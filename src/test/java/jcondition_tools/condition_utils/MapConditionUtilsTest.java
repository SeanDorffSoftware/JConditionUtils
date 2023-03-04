package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MapConditionUtilsTest {
    static final Map<Object, Object> EMPTY_MAP = Collections.emptyMap();
    static final Map<Character, Character> NON_EMPTY_MAP = Map.of('a', 'b');
    static final Map NULL_MAP = null;
    static final Map.Entry<Character, Character> TUPLE_A_B = new Map.Entry<>() {
        private Character value = 'b';

        @Override
        public Character getKey() {
            return 'a';
        }

        @Override
        public Character getValue() {
            return value;
        }

        @Override
        public Character setValue(Character value) {
            this.value = value;
            return value;
        }
    };
    static final Map.Entry<Character, Character> TUPLE_C_D = new Map.Entry<>() {
        private Character value = 'd';

        @Override
        public Character getKey() {
            return 'c';
        }

        @Override
        public Character getValue() {
            return value;
        }

        @Override
        public Character setValue(Character value) {
            this.value = value;
            return value;
        }
    };
    static final Map.Entry<Character, Character> TUPLE_E_NULL = new Map.Entry<>() {
        private Character value = null;

        @Override
        public Character getKey() {
            return 'e';
        }

        @Override
        public Character getValue() {
            return value;
        }

        @Override
        public Character setValue(Character value) {
            this.value = value;
            return value;
        }
    };
    static final Map<Character, Character> NULL_VALUE_MAP = generateNullValueMap();

    private static Map<Character, Character> generateNullValueMap() {
        Map<Character, Character> nullValueMap = new HashMap<>();
        nullValueMap.put('e', null);
        return nullValueMap;
    }

    @Test
    void testContainsTupleNegative() {
        assertFalse(MapConditionUtils.containsTuple(NULL_MAP, null));
        assertFalse(MapConditionUtils.containsTuple(EMPTY_MAP, null));
        assertFalse(MapConditionUtils.containsTuple(NULL_MAP, TUPLE_A_B));
        assertFalse(MapConditionUtils.containsTuple(NON_EMPTY_MAP, null));
        assertFalse(MapConditionUtils.containsTuple(NON_EMPTY_MAP, TUPLE_C_D));
    }

    @Test
    void testContainsTuplePositive() {
        assertTrue(MapConditionUtils.containsTuple(NON_EMPTY_MAP, TUPLE_A_B));
        assertTrue(MapConditionUtils.containsTuple(NULL_VALUE_MAP, TUPLE_E_NULL));
    }

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