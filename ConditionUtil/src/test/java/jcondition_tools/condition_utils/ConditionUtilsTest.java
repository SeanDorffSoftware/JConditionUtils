package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConditionUtilsTest {
    static final List NULL_LIST = null;
    static final List<Object> EMPTY_LIST = Collections.emptyList();
    static final Map<Object, Object> EMPTY_MAP = Collections.emptyMap();
    static final List<Integer> NON_EMPTY_LIST = Arrays.asList(new Integer[]{1, 2});
    static final Map<Character, Character> NON_EMPTY_MAP = Map.of('a', 'b');
    static final Map NULL_MAP = null;
    static final Object NULL_OBJECT = null;
    static final Object[] NULL_OBJECT_ARRAY = null;
    static final Object OBJECT_1 = new Object();
    static final Object OBJECT_2 = new Object();
    static final Object OBJECT_3 = new Object();

    /*
    Objects section
     */

    @Test
    void testAreNotNullObjectNegative() {
        assertFalse(ConditionUtils.areNotNull());
        assertFalse(ConditionUtils.areNotNull(NULL_OBJECT));
        assertFalse(ConditionUtils.areNotNull(NULL_OBJECT_ARRAY));
        assertFalse(ConditionUtils.areNotNull(null, null));
        assertFalse(ConditionUtils.areNotNull(null, OBJECT_1));
        assertFalse(ConditionUtils.areNotNull(OBJECT_1, null));
    }

    @Test
    void testAreNotNullObjectPositive() {
        assertTrue(ConditionUtils.areNotNull(OBJECT_1));
        assertTrue(ConditionUtils.areNotNull(OBJECT_1, OBJECT_1));
    }

    @Test
    void testAreNullObjectNegative() {
        assertFalse(ConditionUtils.areNull(OBJECT_1));
        assertFalse(ConditionUtils.areNull(OBJECT_1, OBJECT_1));
        assertFalse(ConditionUtils.areNull(null, OBJECT_1));
        assertFalse(ConditionUtils.areNull(OBJECT_1, null));
    }

    @Test
    void testAreNullObjectPositive() {
        assertTrue(ConditionUtils.areNull());
        assertTrue(ConditionUtils.areNull(NULL_OBJECT));
        assertTrue(ConditionUtils.areNull(NULL_OBJECT_ARRAY));
        assertTrue(ConditionUtils.areNull(null, null));
    }

    @Test
    void testEqualsAllObjectNegative() {
        assertFalse(ConditionUtils.equalsAll(OBJECT_1, NULL_OBJECT));
        assertFalse(ConditionUtils.equalsAll(OBJECT_1, NULL_OBJECT_ARRAY));
        assertFalse(ConditionUtils.equalsAll(null, OBJECT_1));
        assertFalse(ConditionUtils.equalsAll(null, OBJECT_1, null));
        assertFalse(ConditionUtils.equalsAll(null, null, OBJECT_1));
        assertFalse(ConditionUtils.equalsAll(OBJECT_1, OBJECT_2));
    }

    @Test
    void testEqualsAllObjectPositive() {
        assertTrue(ConditionUtils.equalsAll(null, NULL_OBJECT));
        assertTrue(ConditionUtils.equalsAll(null, NULL_OBJECT_ARRAY));
        assertTrue(ConditionUtils.equalsAll(null, null, null));
        assertTrue(ConditionUtils.equalsAll(OBJECT_1, OBJECT_1));
        assertTrue(ConditionUtils.equalsAll(OBJECT_1, OBJECT_1, OBJECT_1));
    }

    @Test
    void testEqualsAnyObjectNegative() {
        assertFalse(ConditionUtils.equalsAny(OBJECT_1));
        assertFalse(ConditionUtils.equalsAny(null, OBJECT_1));
        assertFalse(ConditionUtils.equalsAny(null, OBJECT_1, OBJECT_1));
        assertFalse(ConditionUtils.equalsAny(OBJECT_1, NULL_OBJECT));
        assertFalse(ConditionUtils.equalsAny(OBJECT_1, NULL_OBJECT_ARRAY));
        assertFalse(ConditionUtils.equalsAny(OBJECT_1, OBJECT_2));
        assertFalse(ConditionUtils.equalsAny(OBJECT_1, OBJECT_2, OBJECT_3));
        assertFalse(ConditionUtils.equalsAny(OBJECT_1, OBJECT_2, null));
        assertFalse(ConditionUtils.equalsAny(OBJECT_1, null, OBJECT_2));
    }

    @Test
    void testEqualsAnyObjectPositive() {
        assertTrue(ConditionUtils.equalsAny(null));
        assertTrue(ConditionUtils.equalsAny(null, NULL_OBJECT));
        assertTrue(ConditionUtils.equalsAny(null, NULL_OBJECT_ARRAY));
        assertTrue(ConditionUtils.equalsAny(null, null, null));
        assertTrue(ConditionUtils.equalsAny(null, OBJECT_1, null));
        assertTrue(ConditionUtils.equalsAny(null, null, OBJECT_1));
        assertTrue(ConditionUtils.equalsAny(OBJECT_1, OBJECT_1));
        assertTrue(ConditionUtils.equalsAny(OBJECT_1, OBJECT_1, OBJECT_1));
        assertTrue(ConditionUtils.equalsAny(OBJECT_1, OBJECT_1, null));
        assertTrue(ConditionUtils.equalsAny(OBJECT_1, null, OBJECT_1));
    }

    @Test
    void testEqualsNoneObjectNegative() {
        assertFalse(ConditionUtils.equalsNone(null));
        assertFalse(ConditionUtils.equalsNone(null, NULL_OBJECT));
        assertFalse(ConditionUtils.equalsNone(null, NULL_OBJECT_ARRAY));
        assertFalse(ConditionUtils.equalsNone(null, null, OBJECT_1));
        assertFalse(ConditionUtils.equalsNone(null, OBJECT_1, null));
        assertFalse(ConditionUtils.equalsNone(OBJECT_1, OBJECT_1));
        assertFalse(ConditionUtils.equalsNone(OBJECT_1, OBJECT_1, OBJECT_1));
        assertFalse(ConditionUtils.equalsNone(OBJECT_1, OBJECT_1, null));
        assertFalse(ConditionUtils.equalsNone(OBJECT_1, null, OBJECT_1));
    }

    @Test
    void testEqualsNoneObjectPositive() {
        assertTrue(ConditionUtils.equalsNone(null, OBJECT_1));
        assertTrue(ConditionUtils.equalsNone(null, OBJECT_1, OBJECT_1));
        assertTrue(ConditionUtils.equalsNone(OBJECT_1));
        assertTrue(ConditionUtils.equalsNone(OBJECT_1, NULL_OBJECT));
        assertTrue(ConditionUtils.equalsNone(OBJECT_1, NULL_OBJECT_ARRAY));
        assertTrue(ConditionUtils.equalsNone(OBJECT_1, null, null));
        assertTrue(ConditionUtils.equalsNone(OBJECT_1, OBJECT_2));
        assertTrue(ConditionUtils.equalsNone(OBJECT_1, OBJECT_2, OBJECT_3));
        assertTrue(ConditionUtils.equalsNone(OBJECT_1, OBJECT_2, null));
        assertTrue(ConditionUtils.equalsNone(OBJECT_1, null, OBJECT_2));
    }

    @Test
    void testIsAnyNotNullObjectNegative() {
        assertFalse(ConditionUtils.isAnyNotNull());
        assertFalse(ConditionUtils.isAnyNotNull(NULL_OBJECT));
        assertFalse(ConditionUtils.isAnyNotNull(NULL_OBJECT_ARRAY));
        assertFalse(ConditionUtils.isAnyNotNull(null, null));
    }

    @Test
    void testIsAnyNotNullObjectPositive() {
        assertTrue(ConditionUtils.isAnyNotNull(OBJECT_1));
        assertTrue(ConditionUtils.isAnyNotNull(OBJECT_1, OBJECT_1));
        assertTrue(ConditionUtils.isAnyNotNull(null, OBJECT_1));
        assertTrue(ConditionUtils.isAnyNotNull(OBJECT_1, null));
    }

    @Test
    void testIsAnyNullObjectNegative() {
        assertFalse(ConditionUtils.isAnyNull(OBJECT_1));
        assertFalse(ConditionUtils.isAnyNull(OBJECT_1, OBJECT_1));
    }

    @Test
    void testIsAnyNullObjectPositive() {
        assertTrue(ConditionUtils.isAnyNull());
        assertTrue(ConditionUtils.isAnyNull(NULL_OBJECT));
        assertTrue(ConditionUtils.isAnyNull(NULL_OBJECT_ARRAY));
        assertTrue(ConditionUtils.isAnyNull(OBJECT_1, null));
        assertTrue(ConditionUtils.isAnyNull(null, OBJECT_1));
    }

    /*
    List section
     */

    @Test
    void testIsNotNullOrEmptyListNegative() {
        assertFalse(ConditionUtils.isNotNullOrEmpty(NULL_LIST));
        assertFalse(ConditionUtils.isNotNullOrEmpty(EMPTY_LIST));
    }

    @Test
    void testIsNotNullOrEmptyListPositive() {
        assertTrue(ConditionUtils.isNotNullOrEmpty(NON_EMPTY_LIST));
    }

    @Test
    void testIsNullOrEmptyListNegative() {
        assertFalse(ConditionUtils.isNullOrEmpty(NON_EMPTY_LIST));
    }

    @Test
    void testIsNullOrEmptyListPositive() {
        assertTrue(ConditionUtils.isNullOrEmpty(NULL_LIST));
        assertTrue(ConditionUtils.isNullOrEmpty(EMPTY_LIST));
    }

    /*
    Map section
     */

    @Test
    void testIsNotNullOrEmptyMapNegative() {
        assertFalse(ConditionUtils.isNotNullOrEmpty(NULL_MAP));
        assertFalse(ConditionUtils.isNotNullOrEmpty(EMPTY_MAP));
    }

    @Test
    void testIsNotNullOrEmptyMapPositive() {
        assertTrue(ConditionUtils.isNotNullOrEmpty(NON_EMPTY_MAP));
    }

    @Test
    void testIsNullOrEmptyMapNegative() {
        assertFalse(ConditionUtils.isNullOrEmpty(NON_EMPTY_MAP));
    }

    @Test
    void testIsNullOrEmptyMapPositive() {
        assertTrue(ConditionUtils.isNullOrEmpty(NULL_MAP));
        assertTrue(ConditionUtils.isNullOrEmpty(EMPTY_MAP));
    }
}