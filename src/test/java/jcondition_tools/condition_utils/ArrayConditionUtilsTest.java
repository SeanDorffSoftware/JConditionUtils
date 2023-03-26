package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayConditionUtilsTest {
    static final Integer[] EMPTY_INTEGER_ARRAY = new Integer[]{};
    static final Integer[] INTEGER_ARRAY = new Integer[]{1, 2, 3};
    static final Integer[] INTEGER_NULL_ARRAY = new Integer[]{null, null, null};
    static final Integer[] INTEGER_WITH_NULL_ARRAY = new Integer[]{1, null, 3};
    static final Integer[] NULL_ARRAY = null;

    @Test
    void testIsNotNullOrEmptyNegative() {
        assertFalse(ArrayConditionUtils.isNotNullOrEmpty(EMPTY_INTEGER_ARRAY));
        assertFalse(ArrayConditionUtils.isNotNullOrEmpty(NULL_ARRAY));
    }

    @Test
    void testIsNotNullOrEmptyPositive() {
        assertTrue(ArrayConditionUtils.isNotNullOrEmpty(INTEGER_ARRAY));
    }

    @Test
    void testIsNullOrEmptyNegative() {
        assertFalse(ArrayConditionUtils.isNullOrEmpty(INTEGER_ARRAY));
    }

    @Test
    void testIsNullOrEmptyPositive() {
        assertTrue(ArrayConditionUtils.isNullOrEmpty(EMPTY_INTEGER_ARRAY));
        assertTrue(ArrayConditionUtils.isNullOrEmpty(NULL_ARRAY));
    }

    @Test
    void testAreAllElementsNotNullNegative() {
        assertFalse(ArrayConditionUtils.areAllElementsNotNull(INTEGER_WITH_NULL_ARRAY));
        assertFalse(ArrayConditionUtils.areAllElementsNotNull(INTEGER_NULL_ARRAY));
        assertFalse(ArrayConditionUtils.areAllElementsNotNull(NULL_ARRAY));
    }

    @Test
    void testAreAllELementsNotNullPositive() {
        assertTrue(ArrayConditionUtils.areAllElementsNotNull(INTEGER_ARRAY));
    }

    @Test
    void testIsAnyElementNullNegative() {
        assertFalse(ArrayConditionUtils.isAnyElementNull(INTEGER_ARRAY));
        assertFalse(ArrayConditionUtils.isAnyElementNull(NULL_ARRAY));
    }

    @Test
    void testIsAnyElementNullPositive() {
        assertTrue(ArrayConditionUtils.isAnyElementNull(INTEGER_WITH_NULL_ARRAY));
        assertTrue(ArrayConditionUtils.isAnyElementNull(INTEGER_NULL_ARRAY));
    }

    @Test
    void testContainsAllNegative() {
        assertFalse(ArrayConditionUtils.containsAll(INTEGER_ARRAY, 1, 2, 4));
        assertFalse(ArrayConditionUtils.containsAll(NULL_ARRAY, 1, 2));
    }

    @Test
    void testContainsAllPositive() {
        assertTrue(ArrayConditionUtils.containsAll(INTEGER_ARRAY, 1, 2));
        assertTrue(ArrayConditionUtils.containsAll(INTEGER_ARRAY));
    }

    @Test
    void testContainsAnyNegative() {
        assertFalse(ArrayConditionUtils.containsAny(INTEGER_ARRAY, 4, 5));
        assertFalse(ArrayConditionUtils.containsAny(NULL_ARRAY, 1, 2));
    }

    @Test
    void testContainsAnyPositive() {
        assertTrue(ArrayConditionUtils.containsAny(INTEGER_ARRAY, 1, 2, 4));
    }

    @Test
    void testContainsNoneNegative() {
        assertFalse(ArrayConditionUtils.containsNone(INTEGER_ARRAY, 1, 4));
    }

    @Test
    void testContainsNonePositive() {
        assertTrue(ArrayConditionUtils.containsNone(INTEGER_ARRAY, 4, 5));
        assertTrue(ArrayConditionUtils.containsNone(NULL_ARRAY, 1, 2));
    }
}