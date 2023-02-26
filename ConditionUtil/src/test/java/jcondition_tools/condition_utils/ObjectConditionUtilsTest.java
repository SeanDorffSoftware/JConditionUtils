package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ObjectConditionUtilsTest {
    static final Object NULL_OBJECT = null;
    static final Object[] NULL_OBJECT_ARRAY = null;
    static final Object OBJECT_1 = new Object();
    static final Object OBJECT_2 = new Object();
    static final Object OBJECT_3 = new Object();

    @Test
    void testAreNotNullObjectNegative() {
        assertFalse(ObjectConditionUtils.areNotNull());
        assertFalse(ObjectConditionUtils.areNotNull(NULL_OBJECT));
        assertFalse(ObjectConditionUtils.areNotNull(NULL_OBJECT_ARRAY));
        assertFalse(ObjectConditionUtils.areNotNull(null, null));
        assertFalse(ObjectConditionUtils.areNotNull(null, OBJECT_1));
        assertFalse(ObjectConditionUtils.areNotNull(OBJECT_1, null));
    }

    @Test
    void testAreNotNullObjectPositive() {
        assertTrue(ObjectConditionUtils.areNotNull(OBJECT_1));
        assertTrue(ObjectConditionUtils.areNotNull(OBJECT_1, OBJECT_1));
    }

    @Test
    void testAreNullObjectNegative() {
        assertFalse(ObjectConditionUtils.areNull(OBJECT_1));
        assertFalse(ObjectConditionUtils.areNull(OBJECT_1, OBJECT_1));
        assertFalse(ObjectConditionUtils.areNull(null, OBJECT_1));
        assertFalse(ObjectConditionUtils.areNull(OBJECT_1, null));
    }

    @Test
    void testAreNullObjectPositive() {
        assertTrue(ObjectConditionUtils.areNull());
        assertTrue(ObjectConditionUtils.areNull(NULL_OBJECT));
        assertTrue(ObjectConditionUtils.areNull(NULL_OBJECT_ARRAY));
        assertTrue(ObjectConditionUtils.areNull(null, null));
    }

    @Test
    void testEqualsAllObjectNegative() {
        assertFalse(ObjectConditionUtils.equalsAll(OBJECT_1, NULL_OBJECT));
        assertFalse(ObjectConditionUtils.equalsAll(OBJECT_1, NULL_OBJECT_ARRAY));
        assertFalse(ObjectConditionUtils.equalsAll(null, OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsAll(null, OBJECT_1, null));
        assertFalse(ObjectConditionUtils.equalsAll(null, null, OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsAll(OBJECT_1, OBJECT_2));
    }

    @Test
    void testEqualsAllObjectPositive() {
        assertTrue(ObjectConditionUtils.equalsAll(null, NULL_OBJECT));
        assertTrue(ObjectConditionUtils.equalsAll(null, NULL_OBJECT_ARRAY));
        assertTrue(ObjectConditionUtils.equalsAll(null, null, null));
        assertTrue(ObjectConditionUtils.equalsAll(OBJECT_1, OBJECT_1));
        assertTrue(ObjectConditionUtils.equalsAll(OBJECT_1, OBJECT_1, OBJECT_1));
    }

    @Test
    void testEqualsAnyObjectNegative() {
        assertFalse(ObjectConditionUtils.equalsAny(OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsAny(null, OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsAny(null, OBJECT_1, OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsAny(OBJECT_1, NULL_OBJECT));
        assertFalse(ObjectConditionUtils.equalsAny(OBJECT_1, NULL_OBJECT_ARRAY));
        assertFalse(ObjectConditionUtils.equalsAny(OBJECT_1, OBJECT_2));
        assertFalse(ObjectConditionUtils.equalsAny(OBJECT_1, OBJECT_2, OBJECT_3));
        assertFalse(ObjectConditionUtils.equalsAny(OBJECT_1, OBJECT_2, null));
        assertFalse(ObjectConditionUtils.equalsAny(OBJECT_1, null, OBJECT_2));
    }

    @Test
    void testEqualsAnyObjectPositive() {
        assertTrue(ObjectConditionUtils.equalsAny(null));
        assertTrue(ObjectConditionUtils.equalsAny(null, NULL_OBJECT));
        assertTrue(ObjectConditionUtils.equalsAny(null, NULL_OBJECT_ARRAY));
        assertTrue(ObjectConditionUtils.equalsAny(null, null, null));
        assertTrue(ObjectConditionUtils.equalsAny(null, OBJECT_1, null));
        assertTrue(ObjectConditionUtils.equalsAny(null, null, OBJECT_1));
        assertTrue(ObjectConditionUtils.equalsAny(OBJECT_1, OBJECT_1));
        assertTrue(ObjectConditionUtils.equalsAny(OBJECT_1, OBJECT_1, OBJECT_1));
        assertTrue(ObjectConditionUtils.equalsAny(OBJECT_1, OBJECT_1, null));
        assertTrue(ObjectConditionUtils.equalsAny(OBJECT_1, null, OBJECT_1));
    }

    @Test
    void testEqualsNoneObjectNegative() {
        assertFalse(ObjectConditionUtils.equalsNone(null));
        assertFalse(ObjectConditionUtils.equalsNone(null, NULL_OBJECT));
        assertFalse(ObjectConditionUtils.equalsNone(null, NULL_OBJECT_ARRAY));
        assertFalse(ObjectConditionUtils.equalsNone(null, null, OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsNone(null, OBJECT_1, null));
        assertFalse(ObjectConditionUtils.equalsNone(OBJECT_1, OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsNone(OBJECT_1, OBJECT_1, OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsNone(OBJECT_1, OBJECT_1, null));
        assertFalse(ObjectConditionUtils.equalsNone(OBJECT_1, null, OBJECT_1));
    }

    @Test
    void testEqualsNoneObjectPositive() {
        assertTrue(ObjectConditionUtils.equalsNone(null, OBJECT_1));
        assertTrue(ObjectConditionUtils.equalsNone(null, OBJECT_1, OBJECT_1));
        assertTrue(ObjectConditionUtils.equalsNone(OBJECT_1));
        assertTrue(ObjectConditionUtils.equalsNone(OBJECT_1, NULL_OBJECT));
        assertTrue(ObjectConditionUtils.equalsNone(OBJECT_1, NULL_OBJECT_ARRAY));
        assertTrue(ObjectConditionUtils.equalsNone(OBJECT_1, null, null));
        assertTrue(ObjectConditionUtils.equalsNone(OBJECT_1, OBJECT_2));
        assertTrue(ObjectConditionUtils.equalsNone(OBJECT_1, OBJECT_2, OBJECT_3));
        assertTrue(ObjectConditionUtils.equalsNone(OBJECT_1, OBJECT_2, null));
        assertTrue(ObjectConditionUtils.equalsNone(OBJECT_1, null, OBJECT_2));
    }

    @Test
    void testIsAnyNotNullObjectNegative() {
        assertFalse(ObjectConditionUtils.isAnyNotNull());
        assertFalse(ObjectConditionUtils.isAnyNotNull(NULL_OBJECT));
        assertFalse(ObjectConditionUtils.isAnyNotNull(NULL_OBJECT_ARRAY));
        assertFalse(ObjectConditionUtils.isAnyNotNull(null, null));
    }

    @Test
    void testIsAnyNotNullObjectPositive() {
        assertTrue(ObjectConditionUtils.isAnyNotNull(OBJECT_1));
        assertTrue(ObjectConditionUtils.isAnyNotNull(OBJECT_1, OBJECT_1));
        assertTrue(ObjectConditionUtils.isAnyNotNull(null, OBJECT_1));
        assertTrue(ObjectConditionUtils.isAnyNotNull(OBJECT_1, null));
    }

    @Test
    void testIsAnyNullObjectNegative() {
        assertFalse(ObjectConditionUtils.isAnyNull(OBJECT_1));
        assertFalse(ObjectConditionUtils.isAnyNull(OBJECT_1, OBJECT_1));
    }

    @Test
    void testIsAnyNullObjectPositive() {
        assertTrue(ObjectConditionUtils.isAnyNull());
        assertTrue(ObjectConditionUtils.isAnyNull(NULL_OBJECT));
        assertTrue(ObjectConditionUtils.isAnyNull(NULL_OBJECT_ARRAY));
        assertTrue(ObjectConditionUtils.isAnyNull(OBJECT_1, null));
        assertTrue(ObjectConditionUtils.isAnyNull(null, OBJECT_1));
    }
}