package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollectionConditionUtilsTest {
    static final Collection NULL_LIST = null;
    static final Collection<Object> EMPTY_COLLECTION = Collections.emptyList();
    static final Collection<Integer> NON_EMPTY_COLLECTION = Arrays.asList(1, 2);

    @Test
    void testIsNotNullOrEmptyNegative() {
        assertFalse(CollectionConditionUtils.isNotNullOrEmpty(NULL_LIST));
        assertFalse(CollectionConditionUtils.isNotNullOrEmpty(EMPTY_COLLECTION));
    }

    @Test
    void testIsNotNullOrEmptyPositive() {
        assertTrue(CollectionConditionUtils.isNotNullOrEmpty(NON_EMPTY_COLLECTION));
    }

    @Test
    void testIsNullOrEmptyNegative() {
        assertFalse(CollectionConditionUtils.isNullOrEmpty(NON_EMPTY_COLLECTION));
    }

    @Test
    void testIsNullOrEmptyPositive() {
        assertTrue(CollectionConditionUtils.isNullOrEmpty(NULL_LIST));
        assertTrue(CollectionConditionUtils.isNullOrEmpty(EMPTY_COLLECTION));
    }
}