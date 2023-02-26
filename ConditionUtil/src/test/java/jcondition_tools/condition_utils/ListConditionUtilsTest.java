package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListConditionUtilsTest {
    static final List NULL_LIST = null;
    static final List<Object> EMPTY_LIST = Collections.emptyList();
    static final List<Integer> NON_EMPTY_LIST = Arrays.asList(1, 2);

    @Test
    void testIsNotNullOrEmptyNegative() {
        assertFalse(ListConditionUtils.isNotNullOrEmpty(NULL_LIST));
        assertFalse(ListConditionUtils.isNotNullOrEmpty(EMPTY_LIST));
    }

    @Test
    void testIsNotNullOrEmptyPositive() {
        assertTrue(ListConditionUtils.isNotNullOrEmpty(NON_EMPTY_LIST));
    }

    @Test
    void testIsNullOrEmptyNegative() {
        assertFalse(ListConditionUtils.isNullOrEmpty(NON_EMPTY_LIST));
    }

    @Test
    void testIsNullOrEmptyPositive() {
        assertTrue(ListConditionUtils.isNullOrEmpty(NULL_LIST));
        assertTrue(ListConditionUtils.isNullOrEmpty(EMPTY_LIST));
    }
}