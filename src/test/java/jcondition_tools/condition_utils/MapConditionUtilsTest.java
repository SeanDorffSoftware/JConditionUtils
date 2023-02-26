package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MapConditionUtilsTest {
    static final Map<Object, Object> EMPTY_MAP = Collections.emptyMap();
    static final Map<Character, Character> NON_EMPTY_MAP = Map.of('a', 'b');
    static final Map NULL_MAP = null;

    @Test
    void testIsNotNullOrEmptyNegative() {
        assertFalse(MapConditionUtils.isNotNullOrEmpty(NULL_MAP));
        assertFalse(MapConditionUtils.isNotNullOrEmpty(EMPTY_MAP));
    }

    @Test
    void testIsNotNullOrEmptyPositive() {
        assertTrue(MapConditionUtils.isNotNullOrEmpty(NON_EMPTY_MAP));
    }

    @Test
    void testIsNullOrEmptyNegative() {
        assertFalse(MapConditionUtils.isNullOrEmpty(NON_EMPTY_MAP));
    }

    @Test
    void testIsNullOrEmptyPositive() {
        assertTrue(MapConditionUtils.isNullOrEmpty(NULL_MAP));
        assertTrue(MapConditionUtils.isNullOrEmpty(EMPTY_MAP));
    }
}