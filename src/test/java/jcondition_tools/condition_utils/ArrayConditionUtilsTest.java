package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayConditionUtilsTest {
    static final Integer[] EMPTY_INTEGER_ARRAY = new Integer[]{};
    static final Integer[] INTEGER_ARRAY = new Integer[]{1, 2, 3};
    static final Integer[] INTEGER_NULL_ARRAY = new Integer[]{null, null, null};
    static final Integer[] INTEGER_WITH_NULL_ARRAY = new Integer[]{1, null, 3};
    static final Integer[] NULL_ARRAY = null;

    @Test
    void testIsNotNullOrEmptyNegative() {
        Assertions.assertFalse(ArrayConditionUtils.isNotNullOrEmpty(EMPTY_INTEGER_ARRAY));
        Assertions.assertFalse(ArrayConditionUtils.isNotNullOrEmpty(NULL_ARRAY));
    }

    @Test
    void testIsNotNullOrEmptyPositive() {
        Assertions.assertTrue(ArrayConditionUtils.isNotNullOrEmpty(INTEGER_ARRAY));
    }

    @Test
    void testIsNullOrEmptyNegative() {
        Assertions.assertFalse(ArrayConditionUtils.isNullOrEmpty(INTEGER_ARRAY));
    }

    @Test
    void testIsNullOrEmptyPositive() {
        Assertions.assertTrue(ArrayConditionUtils.isNullOrEmpty(EMPTY_INTEGER_ARRAY));
        Assertions.assertTrue(ArrayConditionUtils.isNullOrEmpty(NULL_ARRAY));
    }

    @Test
    void testAreAllElementsNotNullNegative() {
        Assertions.assertFalse(ArrayConditionUtils.areAllElementsNotNull(INTEGER_WITH_NULL_ARRAY));
        Assertions.assertFalse(ArrayConditionUtils.areAllElementsNotNull(INTEGER_NULL_ARRAY));
        Assertions.assertFalse(ArrayConditionUtils.areAllElementsNotNull(NULL_ARRAY));
    }

    @Test
    void testAreAllELementsNotNullPositive() {
        Assertions.assertTrue(ArrayConditionUtils.areAllElementsNotNull(INTEGER_ARRAY));
    }

    @Test
    void testIsAnyElementNullNegative() {
        Assertions.assertFalse(ArrayConditionUtils.isAnyElementNull(INTEGER_ARRAY));
        Assertions.assertFalse(ArrayConditionUtils.isAnyElementNull(NULL_ARRAY));
    }

    @Test
    void testIsAnyElementNullPositive() {
        Assertions.assertTrue(ArrayConditionUtils.isAnyElementNull(INTEGER_WITH_NULL_ARRAY));
        Assertions.assertTrue(ArrayConditionUtils.isAnyElementNull(INTEGER_NULL_ARRAY));
    }

    @Test
    void testContainsAllNegative() {
        Assertions.assertFalse(ArrayConditionUtils.containsAll(INTEGER_ARRAY, 1, 2, 4));
        Assertions.assertFalse(ArrayConditionUtils.containsAll(NULL_ARRAY, 1, 2));
    }

    @Test
    void testContainsAllPositive() {
        Assertions.assertTrue(ArrayConditionUtils.containsAll(INTEGER_ARRAY, 1, 2));
        Assertions.assertTrue(ArrayConditionUtils.containsAll(INTEGER_ARRAY));
    }

    @Test
    void testContainsAnyNegative() {
        Assertions.assertFalse(ArrayConditionUtils.containsAny(INTEGER_ARRAY, 4, 5));
        Assertions.assertFalse(ArrayConditionUtils.containsAny(NULL_ARRAY, 1, 2));
    }

    @Test
    void testContainsAnyPositive() {
        Assertions.assertTrue(ArrayConditionUtils.containsAny(INTEGER_ARRAY, 1, 2, 4));
    }

    @Test
    void testContainsNoneNegative() {
        Assertions.assertFalse(ArrayConditionUtils.containsNone(INTEGER_ARRAY, 1, 4));
    }

    @Test
    void testContainsNonePositive() {
        Assertions.assertTrue(ArrayConditionUtils.containsNone(INTEGER_ARRAY, 4, 5));
        Assertions.assertTrue(ArrayConditionUtils.containsNone(NULL_ARRAY, 1, 2));
    }
}