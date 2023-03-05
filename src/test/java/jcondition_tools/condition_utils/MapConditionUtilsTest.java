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
    static final Map<Character, Character> A_B_MAP = generateABMap();
    static final Map<Character, Character> A_B_C_D_MAP = generateABCDMap();
    static final Map<Character, Character> C_D_MAP = generateCDMap();
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

    private static Map<Character, Character> generateABMap() {
        Map<Character, Character> a_b_map = new HashMap<>();
        a_b_map.put(TUPLE_A_B.getKey(), TUPLE_A_B.getValue());
        return a_b_map;
    }

    private static Map<Character, Character> generateABCDMap() {
        Map<Character, Character> a_b_c_d_map = new HashMap<>();
        a_b_c_d_map.put(TUPLE_A_B.getKey(), TUPLE_A_B.getValue());
        a_b_c_d_map.put(TUPLE_C_D.getKey(), TUPLE_C_D.getValue());
        return a_b_c_d_map;
    }

    private static Map<Character, Character> generateCDMap() {
        Map<Character, Character> c_d_map = new HashMap<>();
        c_d_map.put(TUPLE_C_D.getKey(), TUPLE_C_D.getValue());
        return c_d_map;
    }

    @Test
    void testContainsAllNegative() {
        assertFalse(MapConditionUtils.containsAll(null, null));
        assertFalse(MapConditionUtils.containsAll(EMPTY_MAP, null));
        assertFalse(MapConditionUtils.containsAll(NULL_MAP, null));
        assertFalse(MapConditionUtils.containsAll(A_B_MAP, C_D_MAP));
        assertFalse(MapConditionUtils.containsAll(A_B_MAP, A_B_C_D_MAP));
    }

    @Test
    void testContainsAllPositive() {
        Map<Character, Character> empty_character_character_map = new HashMap<>();
        assertTrue(MapConditionUtils.containsAll(A_B_MAP, null));
        assertTrue(MapConditionUtils.containsAll(A_B_MAP, NULL_MAP));
        assertTrue(MapConditionUtils.containsAll(A_B_MAP, empty_character_character_map));
        assertTrue(MapConditionUtils.containsAll(A_B_MAP, A_B_MAP));
        assertTrue(MapConditionUtils.containsAll(A_B_C_D_MAP, A_B_MAP));
        assertTrue(MapConditionUtils.containsAll(A_B_C_D_MAP, C_D_MAP));
    }

    @Test
    void testContainsAnyNegative() {
        assertFalse(MapConditionUtils.containsAny(null, null));
        assertFalse(MapConditionUtils.containsAny(EMPTY_MAP, null));
        assertFalse(MapConditionUtils.containsAny(NULL_MAP, null));
        assertFalse(MapConditionUtils.containsAny(NON_EMPTY_MAP, null));
        assertFalse(MapConditionUtils.containsAny(NON_EMPTY_MAP, NULL_MAP));
        assertFalse(MapConditionUtils.containsAny(NON_EMPTY_MAP, C_D_MAP));
    }

    @Test
    void testContainsAnyPositive() {
        assertTrue(MapConditionUtils.containsAny(A_B_C_D_MAP, A_B_MAP));
        assertTrue(MapConditionUtils.containsAny(A_B_C_D_MAP, C_D_MAP));
        assertTrue(MapConditionUtils.containsAny(A_B_MAP, A_B_C_D_MAP));
        assertTrue(MapConditionUtils.containsAny(C_D_MAP, A_B_C_D_MAP));
    }

    @Test
    void testContainsNoneNegative() {
        assertFalse(MapConditionUtils.containsNone(NON_EMPTY_MAP, A_B_MAP));
    }

    @Test
    void testContainsNonePositive() {
        Map<Character, Character> empty_character_character_map = new HashMap<>();
        assertTrue(MapConditionUtils.containsNone(null, null));
        assertTrue(MapConditionUtils.containsNone(EMPTY_MAP, null));
        assertTrue(MapConditionUtils.containsNone(NULL_MAP, null));
        assertTrue(MapConditionUtils.containsNone(NON_EMPTY_MAP, null));
        assertTrue(MapConditionUtils.containsNone(NON_EMPTY_MAP, empty_character_character_map));
        assertTrue(MapConditionUtils.containsNone(NON_EMPTY_MAP, NULL_MAP));
        assertTrue(MapConditionUtils.containsNone(NON_EMPTY_MAP, C_D_MAP));
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