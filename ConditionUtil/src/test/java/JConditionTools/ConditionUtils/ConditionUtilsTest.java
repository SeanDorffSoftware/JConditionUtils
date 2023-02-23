package JConditionTools.ConditionUtils;

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
}