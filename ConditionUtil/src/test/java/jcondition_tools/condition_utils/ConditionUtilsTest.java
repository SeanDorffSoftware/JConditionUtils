package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConditionUtilsTest {
    @Test
    void testAreNotNullObjectNegative() {
        assertFalse(ConditionUtils.areNotNull());
        assertFalse(ConditionUtils.areNotNull(null));
        assertFalse(ConditionUtils.areNotNull(null, null));
        assertFalse(ConditionUtils.areNotNull(null, new Object()));
        assertFalse(ConditionUtils.areNotNull(new Object(), null));
    }

    @Test
    void testAreNotNullObjectPositive() {
        assertTrue(ConditionUtils.areNotNull(new Object()));
        assertTrue(ConditionUtils.areNotNull(new Object(), new Object()));
    }

    @Test
    void testAreNullObjectNegative() {
        assertFalse(ConditionUtils.areNull(new Object()));
        assertFalse(ConditionUtils.areNull(new Object(), new Object()));
        assertFalse(ConditionUtils.areNull(null, new Object()));
        assertFalse(ConditionUtils.areNull(new Object(), null));
    }

    @Test
    void testAreNullObjectPositive() {
        assertTrue(ConditionUtils.areNull());
        assertTrue(ConditionUtils.areNull(null));
        assertTrue(ConditionUtils.areNull(null, null));
    }

    @Test
    void testEqualsAllObjectNegative() {
        assertFalse(ConditionUtils.equalsAll(new Object(), null));
        assertFalse(ConditionUtils.equalsAll(null, new Object()));
        assertFalse(ConditionUtils.equalsAll(null, new Object(), null));
        assertFalse(ConditionUtils.equalsAll(null, null, new Object()));
        assertFalse(ConditionUtils.equalsAll(new Object(), new Object()));
    }

    @Test
    void testEqualsAllObjectPositive() {
        Object object = new Object();
        assertTrue(ConditionUtils.equalsAll(null, null));
        assertTrue(ConditionUtils.equalsAll(null, null, null));
        assertTrue(ConditionUtils.equalsAll(object, object));
        assertTrue(ConditionUtils.equalsAll(object, object, object));
    }

    @Test
    void testEqualsAnyObjectNegative() {
        assertFalse(ConditionUtils.equalsAny(new Object()));
        assertFalse(ConditionUtils.equalsAny(null, new Object()));
        assertFalse(ConditionUtils.equalsAny(null, new Object(), new Object()));
        assertFalse(ConditionUtils.equalsAny(new Object(), null));
        assertFalse(ConditionUtils.equalsAny(new Object(), new Object()));
        assertFalse(ConditionUtils.equalsAny(new Object(), new Object(), new Object()));
        assertFalse(ConditionUtils.equalsAny(new Object(), new Object(), null));
        assertFalse(ConditionUtils.equalsAny(new Object(), null, new Object()));
    }

    @Test
    void testEqualsAnyObjectPositive() {
        Object object = new Object();
        assertTrue(ConditionUtils.equalsAny(null));
        assertTrue(ConditionUtils.equalsAny(null, null));
        assertTrue(ConditionUtils.equalsAny(null, null, null));
        assertTrue(ConditionUtils.equalsAny(null, object, null));
        assertTrue(ConditionUtils.equalsAny(null, null, object));
        assertTrue(ConditionUtils.equalsAny(object, object));
        assertTrue(ConditionUtils.equalsAny(object, object, object));
        assertTrue(ConditionUtils.equalsAny(object, object, null));
        assertTrue(ConditionUtils.equalsAny(object, null, object));
    }

    @Test
    void testEqualsNoneObjectNegative() {
        Object object = new Object();
        assertFalse(ConditionUtils.equalsNone(null));
        assertFalse(ConditionUtils.equalsNone(null, null));
        assertFalse(ConditionUtils.equalsNone(null, null, object));
        assertFalse(ConditionUtils.equalsNone(null, object, null));
        assertFalse(ConditionUtils.equalsNone(object, object));
        assertFalse(ConditionUtils.equalsNone(object, object, object));
        assertFalse(ConditionUtils.equalsNone(object, object, null));
        assertFalse(ConditionUtils.equalsNone(object, null, object));
    }

    @Test
    void testEqualsNoneObjectPositive() {
        assertTrue(ConditionUtils.equalsNone(null, new Object()));
        assertTrue(ConditionUtils.equalsNone(null, new Object(), new Object()));
        assertTrue(ConditionUtils.equalsNone(new Object()));
        assertTrue(ConditionUtils.equalsNone(new Object(), null));
        assertTrue(ConditionUtils.equalsNone(new Object(), null, null));
        assertTrue(ConditionUtils.equalsNone(new Object(), new Object()));
        assertTrue(ConditionUtils.equalsNone(new Object(), new Object(), new Object()));
        assertTrue(ConditionUtils.equalsNone(new Object(), new Object(), null));
        assertTrue(ConditionUtils.equalsNone(new Object(), null, new Object()));
    }

    @Test
    void testIsAnyNotNullObjectNegative() {
        assertFalse(ConditionUtils.isAnyNotNull());
        assertFalse(ConditionUtils.isAnyNotNull(null));
        assertFalse(ConditionUtils.isAnyNotNull(null, null));
    }

    @Test
    void testIsAnyNotNullObjectPositive() {
        assertTrue(ConditionUtils.isAnyNotNull(new Object()));
        assertTrue(ConditionUtils.isAnyNotNull(new Object(), new Object()));
        assertTrue(ConditionUtils.isAnyNotNull(null, new Object()));
        assertTrue(ConditionUtils.isAnyNotNull(new Object(), null));
    }

    @Test
    void testIsAnyNullObjectNegative() {
        assertFalse(ConditionUtils.isAnyNull(new Object()));
        assertFalse(ConditionUtils.isAnyNull(new Object(), new Object()));
    }

    @Test
    void testisAnyNullObjectPositive() {
        assertTrue(ConditionUtils.isAnyNull());
        assertTrue(ConditionUtils.isAnyNull(null));
        assertTrue(ConditionUtils.isAnyNull(new Object(), null));
        assertTrue(ConditionUtils.isAnyNull(null, new Object()));
    }
}