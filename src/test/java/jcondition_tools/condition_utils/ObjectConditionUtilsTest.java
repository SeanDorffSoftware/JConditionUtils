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
    void testAreNotNullNegative() {
        assertFalse(ObjectConditionUtils.areNotNull());
        assertFalse(ObjectConditionUtils.areNotNull(NULL_OBJECT));
        assertFalse(ObjectConditionUtils.areNotNull(NULL_OBJECT_ARRAY));
        assertFalse(ObjectConditionUtils.areNotNull(null, null));
        assertFalse(ObjectConditionUtils.areNotNull(null, OBJECT_1));
        assertFalse(ObjectConditionUtils.areNotNull(OBJECT_1, null));
    }

    @Test
    void testAreNotNullPositive() {
        assertTrue(ObjectConditionUtils.areNotNull(OBJECT_1));
        assertTrue(ObjectConditionUtils.areNotNull(OBJECT_1, OBJECT_1));
    }

    @Test
    void testAreNullNegative() {
        assertFalse(ObjectConditionUtils.areNull(OBJECT_1));
        assertFalse(ObjectConditionUtils.areNull(OBJECT_1, OBJECT_1));
        assertFalse(ObjectConditionUtils.areNull(null, OBJECT_1));
        assertFalse(ObjectConditionUtils.areNull(OBJECT_1, null));
    }

    @Test
    void testAreNullPositive() {
        assertTrue(ObjectConditionUtils.areNull());
        assertTrue(ObjectConditionUtils.areNull(NULL_OBJECT));
        assertTrue(ObjectConditionUtils.areNull(NULL_OBJECT_ARRAY));
        assertTrue(ObjectConditionUtils.areNull(null, null));
    }

    @Test
    void testEqualsAllNegative() {
        assertFalse(ObjectConditionUtils.equalsAll(OBJECT_1, NULL_OBJECT));
        assertFalse(ObjectConditionUtils.equalsAll(OBJECT_1, NULL_OBJECT_ARRAY));
        assertFalse(ObjectConditionUtils.equalsAll(null, OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsAll(null, OBJECT_1, null));
        assertFalse(ObjectConditionUtils.equalsAll(null, null, OBJECT_1));
        assertFalse(ObjectConditionUtils.equalsAll(OBJECT_1, OBJECT_2));
    }

    @Test
    void testEqualsAllPositive() {
        assertTrue(ObjectConditionUtils.equalsAll(null, NULL_OBJECT));
        assertTrue(ObjectConditionUtils.equalsAll(null, NULL_OBJECT_ARRAY));
        assertTrue(ObjectConditionUtils.equalsAll(null, null, null));
        assertTrue(ObjectConditionUtils.equalsAll(OBJECT_1, OBJECT_1));
        assertTrue(ObjectConditionUtils.equalsAll(OBJECT_1, OBJECT_1, OBJECT_1));
    }

    @Test
    void testEqualsAnyNegative() {
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
    void testEqualsAnyPositive() {
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
    void testEqualsNoneNegative() {
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
    void testEqualsNonePositive() {
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
    void testIsAnyNotNullNegative() {
        assertFalse(ObjectConditionUtils.isAnyNotNull());
        assertFalse(ObjectConditionUtils.isAnyNotNull(NULL_OBJECT));
        assertFalse(ObjectConditionUtils.isAnyNotNull(NULL_OBJECT_ARRAY));
        assertFalse(ObjectConditionUtils.isAnyNotNull(null, null));
    }

    @Test
    void testIsAnyNotNullPositive() {
        assertTrue(ObjectConditionUtils.isAnyNotNull(OBJECT_1));
        assertTrue(ObjectConditionUtils.isAnyNotNull(OBJECT_1, OBJECT_1));
        assertTrue(ObjectConditionUtils.isAnyNotNull(null, OBJECT_1));
        assertTrue(ObjectConditionUtils.isAnyNotNull(OBJECT_1, null));
    }

    @Test
    void testIsAnyNullNegative() {
        assertFalse(ObjectConditionUtils.isAnyNull(OBJECT_1));
        assertFalse(ObjectConditionUtils.isAnyNull(OBJECT_1, OBJECT_1));
    }

    @Test
    void testIsAnyNullPositive() {
        assertTrue(ObjectConditionUtils.isAnyNull());
        assertTrue(ObjectConditionUtils.isAnyNull(NULL_OBJECT));
        assertTrue(ObjectConditionUtils.isAnyNull(NULL_OBJECT_ARRAY));
        assertTrue(ObjectConditionUtils.isAnyNull(OBJECT_1, null));
        assertTrue(ObjectConditionUtils.isAnyNull(null, OBJECT_1));
    }
}