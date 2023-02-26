package jcondition_tools.condition_utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimitiveConditionUtilsTest {
    static final byte BYTE_1 = 1;
    static final byte BYTE_2 = 2;
    static final byte BYTE_3 = 3;
    static final char CHAR_A = 'A';
    static final char CHAR_B = 'B';
    static final char CHAR_C = 'C';
    static final double DOUBLE_1 = 1;
    static final double DOUBLE_2 = 2;
    static final double DOUBLE_3 = 3;
    static final float FLOAT_1 = 1;
    static final float FLOAT_2 = 2;
    static final float FLOAT_3 = 3;
    static final int INT_1 = 1;
    static final int INT_2 = 2;
    static final int INT_3 = 3;
    static final long LONG_1 = 1;
    static final long LONG_2 = 2;
    static final long LONG_3 = 3;
    static final short SHORT_1 = 1;
    static final short SHORT_2 = 2;
    static final short SHORT_3 = 3;
    static final boolean[] EMPTY_BOOLEAN_ARRAY = {};
    static final byte[] EMPTY_BYTE_ARRAY = {};
    static final char[] EMPTY_CHAR_ARRAY = {};
    static final double[] EMPTY_DOUBLE_ARRAY = {};
    static final float[] EMPTY_FLOAT_ARRAY = {};
    static final int[] EMPTY_INT_ARRAY = {};
    static final long[] EMPTY_LONG_ARRAY = {};
    static final short[] EMPTY_SHORT_ARRAY = {};

    /*
    boolean section
     */

    @Test
    void testEqualsAllBooleanNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAll(false, null));
        assertFalse(PrimitiveConditionUtils.equalsAll(false, EMPTY_BOOLEAN_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAll(false, true));
        assertFalse(PrimitiveConditionUtils.equalsAll(false, true, false));
        assertFalse(PrimitiveConditionUtils.equalsAll(false, false, true));
        assertFalse(PrimitiveConditionUtils.equalsAll(false, true, true));
    }

    @Test
    void testEqualsAllBooleanPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAll(false, false));
        assertTrue(PrimitiveConditionUtils.equalsAll(false, false, false));
    }

    @Test
    void testEqualsAnyBooleanNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAny(false, null));
        assertFalse(PrimitiveConditionUtils.equalsAny(false, EMPTY_BOOLEAN_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAny(false, true));
        assertFalse(PrimitiveConditionUtils.equalsAny(false, true, true));
    }

    @Test
    void testEqualsAnyBooleanPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAny(false, false));
        assertTrue(PrimitiveConditionUtils.equalsAny(false, false, false));
        assertTrue(PrimitiveConditionUtils.equalsAny(false, false, true));
        assertTrue(PrimitiveConditionUtils.equalsAny(false, false, false));
    }

    @Test
    void testEqualsNoneBooleanNegative() {
        assertFalse(PrimitiveConditionUtils.equalsNone(false, false));
        assertFalse(PrimitiveConditionUtils.equalsNone(false, false, false));
        assertFalse(PrimitiveConditionUtils.equalsNone(false, false, true));
        assertFalse(PrimitiveConditionUtils.equalsNone(false, true, false));
    }

    @Test
    void testEqualsNoneBooleanPositive() {
        assertTrue(PrimitiveConditionUtils.equalsNone(false, null));
        assertTrue(PrimitiveConditionUtils.equalsNone(false, EMPTY_BOOLEAN_ARRAY));
        assertTrue(PrimitiveConditionUtils.equalsNone(false, true));
        assertTrue((PrimitiveConditionUtils.equalsNone(false, true, true)));
    }

    /*
    byte section
     */

    @Test
    void testEqualsAllByteNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAll(BYTE_1, EMPTY_BYTE_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAll(BYTE_1, BYTE_2));
        assertFalse(PrimitiveConditionUtils.equalsAll(BYTE_1, BYTE_2, BYTE_3));
    }

    @Test
    void testEqualsAllBytePositive() {
        assertTrue(PrimitiveConditionUtils.equalsAll(BYTE_1, BYTE_1));
        assertTrue(PrimitiveConditionUtils.equalsAll(BYTE_1, BYTE_1, BYTE_1));
    }

    @Test
    void testEqualsAnyByteNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAny(BYTE_1, EMPTY_BYTE_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAny(BYTE_1, BYTE_2));
        assertFalse(PrimitiveConditionUtils.equalsAny(BYTE_1, BYTE_2, BYTE_3));
    }

    @Test
    void testEqualsAnyBytePositive() {
        assertTrue(PrimitiveConditionUtils.equalsAny(BYTE_1, BYTE_1));
        assertTrue(PrimitiveConditionUtils.equalsAny(BYTE_1, BYTE_1, BYTE_2));
        assertTrue(PrimitiveConditionUtils.equalsAny(BYTE_1, BYTE_3, BYTE_2, BYTE_1));
    }

    @Test
    void testEqualsNoneByteNegative() {
        assertFalse(PrimitiveConditionUtils.equalsNone(BYTE_1, BYTE_1));
        assertFalse(PrimitiveConditionUtils.equalsNone(BYTE_1, BYTE_1, BYTE_2));
        assertFalse(PrimitiveConditionUtils.equalsNone(BYTE_1, BYTE_3, BYTE_2, BYTE_1));
    }

    @Test
    void testEqualsNoneBytePositive() {
        assertTrue(PrimitiveConditionUtils.equalsNone(BYTE_1, EMPTY_BYTE_ARRAY));
        assertTrue(PrimitiveConditionUtils.equalsNone(BYTE_1, BYTE_2));
        assertTrue(PrimitiveConditionUtils.equalsNone(BYTE_1, BYTE_2, BYTE_3));
    }

    @Test
    void testIsBetweenByteIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isBetween(BYTE_1, BYTE_3, BYTE_2));
    }

    @Test
    void testIsBetweenByteNegative() {
        assertFalse(PrimitiveConditionUtils.isBetween(BYTE_1, BYTE_2, BYTE_3));
        assertFalse(PrimitiveConditionUtils.isBetween(BYTE_3, BYTE_1, BYTE_2));
    }

    @Test
    void testIsBetweenBytePositive() {
        assertTrue(PrimitiveConditionUtils.isBetween(BYTE_2, BYTE_1, BYTE_3));
    }

    @Test
    void testIsWithinByteIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isWithin(BYTE_1, BYTE_3, BYTE_2));
    }

    @Test
    void testIsWithinByteNegative() {
        assertFalse(PrimitiveConditionUtils.isWithin(BYTE_1, BYTE_2, BYTE_3));
        assertFalse(PrimitiveConditionUtils.isWithin(BYTE_3, BYTE_1, BYTE_2));
    }

    @Test
    void testIsWithinBytePositive() {
        assertTrue(PrimitiveConditionUtils.isWithin(BYTE_2, BYTE_1, BYTE_3));
        assertTrue(PrimitiveConditionUtils.isWithin(BYTE_1, BYTE_1, BYTE_2));
        assertTrue(PrimitiveConditionUtils.isWithin(BYTE_3, BYTE_2, BYTE_3));
    }

    /*
    char section
     */

    @Test
    void testEqualsAllCharNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAll(CHAR_A, EMPTY_CHAR_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAll(CHAR_A, CHAR_B));
        assertFalse(PrimitiveConditionUtils.equalsAll(CHAR_A, CHAR_B, CHAR_C));
    }

    @Test
    void testEqualsAllCharPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAll(CHAR_A, CHAR_A));
        assertTrue(PrimitiveConditionUtils.equalsAll(CHAR_A, CHAR_A, CHAR_A));
    }

    @Test
    void testEqualsAnyCharNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAny(CHAR_A, EMPTY_CHAR_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAny(CHAR_A, CHAR_B));
        assertFalse(PrimitiveConditionUtils.equalsAny(CHAR_A, CHAR_B, CHAR_C));
    }

    @Test
    void testEqualsAnyCharPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAny(CHAR_A, CHAR_A));
        assertTrue(PrimitiveConditionUtils.equalsAny(CHAR_A, CHAR_A, CHAR_B));
        assertTrue(PrimitiveConditionUtils.equalsAny(CHAR_A, CHAR_C, CHAR_B, CHAR_A));
    }

    @Test
    void testEqualsNoneCharNegative() {
        assertFalse(PrimitiveConditionUtils.equalsNone(CHAR_A, CHAR_A));
        assertFalse(PrimitiveConditionUtils.equalsNone(CHAR_A, CHAR_A, CHAR_B));
        assertFalse(PrimitiveConditionUtils.equalsNone(CHAR_A, CHAR_C, CHAR_B, CHAR_A));
    }

    @Test
    void testEqualsNoneCharPositive() {
        assertTrue(PrimitiveConditionUtils.equalsNone(CHAR_A, EMPTY_CHAR_ARRAY));
        assertTrue(PrimitiveConditionUtils.equalsNone(CHAR_A, CHAR_B));
        assertTrue(PrimitiveConditionUtils.equalsNone(CHAR_A, CHAR_B, CHAR_C));
    }

    @Test
    void testIsBetweenCharIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isBetween(CHAR_A, CHAR_C, CHAR_B));
    }

    @Test
    void testIsBetweenCharNegative() {
        assertFalse(PrimitiveConditionUtils.isBetween(CHAR_A, CHAR_B, CHAR_C));
        assertFalse(PrimitiveConditionUtils.isBetween(CHAR_C, CHAR_A, CHAR_B));
    }

    @Test
    void testIsBetweenCharPositive() {
        assertTrue(PrimitiveConditionUtils.isBetween(CHAR_B, CHAR_A, CHAR_C));
    }

    @Test
    void testIsWithinCharIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isWithin(CHAR_A, CHAR_C, CHAR_B));
    }

    @Test
    void testIsWithinCharNegative() {
        assertFalse(PrimitiveConditionUtils.isWithin(CHAR_A, CHAR_B, CHAR_C));
        assertFalse(PrimitiveConditionUtils.isWithin(CHAR_C, CHAR_A, CHAR_B));
    }

    @Test
    void testIsWithinCharPositive() {
        assertTrue(PrimitiveConditionUtils.isWithin(CHAR_B, CHAR_A, CHAR_C));
        assertTrue(PrimitiveConditionUtils.isWithin(CHAR_A, CHAR_A, CHAR_B));
        assertTrue(PrimitiveConditionUtils.isWithin(CHAR_C, CHAR_B, CHAR_C));
    }

    /*
    double section
     */

    @Test
    void testEqualsAllDoubleNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAll(DOUBLE_1, EMPTY_DOUBLE_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAll(DOUBLE_1, DOUBLE_2));
        assertFalse(PrimitiveConditionUtils.equalsAll(DOUBLE_1, DOUBLE_2, DOUBLE_3));
    }

    @Test
    void testEqualsAllDoublePositive() {
        assertTrue(PrimitiveConditionUtils.equalsAll(DOUBLE_1, DOUBLE_1));
        assertTrue(PrimitiveConditionUtils.equalsAll(DOUBLE_1, DOUBLE_1, DOUBLE_1));
    }

    @Test
    void testEqualsAnyDoubleNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAny(DOUBLE_1, EMPTY_DOUBLE_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAny(DOUBLE_1, DOUBLE_2));
        assertFalse(PrimitiveConditionUtils.equalsAny(DOUBLE_1, DOUBLE_2, DOUBLE_3));
    }

    @Test
    void testEqualsAnyDoublePositive() {
        assertTrue(PrimitiveConditionUtils.equalsAny(DOUBLE_1, DOUBLE_1));
        assertTrue(PrimitiveConditionUtils.equalsAny(DOUBLE_1, DOUBLE_1, DOUBLE_2));
        assertTrue(PrimitiveConditionUtils.equalsAny(DOUBLE_1, DOUBLE_3, DOUBLE_2, DOUBLE_1));
    }

    @Test
    void testEqualsNoneDoubleNegative() {
        assertFalse(PrimitiveConditionUtils.equalsNone(DOUBLE_1, DOUBLE_1));
        assertFalse(PrimitiveConditionUtils.equalsNone(DOUBLE_1, DOUBLE_1, DOUBLE_2));
        assertFalse(PrimitiveConditionUtils.equalsNone(DOUBLE_1, DOUBLE_3, DOUBLE_2, DOUBLE_1));
    }

    @Test
    void testEqualsNoneDoublePositive() {
        assertTrue(PrimitiveConditionUtils.equalsNone(DOUBLE_1, EMPTY_DOUBLE_ARRAY));
        assertTrue(PrimitiveConditionUtils.equalsNone(DOUBLE_1, DOUBLE_2));
        assertTrue(PrimitiveConditionUtils.equalsNone(DOUBLE_1, DOUBLE_2, DOUBLE_3));
    }

    @Test
    void testIsBetweenDoubleIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isBetween(DOUBLE_1, DOUBLE_3, DOUBLE_2));
    }

    @Test
    void testIsBetweenDoubleNegative() {
        assertFalse(PrimitiveConditionUtils.isBetween(DOUBLE_1, DOUBLE_2, DOUBLE_3));
        assertFalse(PrimitiveConditionUtils.isBetween(DOUBLE_3, DOUBLE_1, DOUBLE_2));
    }

    @Test
    void testIsBetweenDoublePositive() {
        assertTrue(PrimitiveConditionUtils.isBetween(DOUBLE_2, DOUBLE_1, DOUBLE_3));
    }

    @Test
    void testIsWithinDoubleIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isWithin(DOUBLE_1, DOUBLE_3, DOUBLE_2));
    }

    @Test
    void testIsWithinDoubleNegative() {
        assertFalse(PrimitiveConditionUtils.isWithin(DOUBLE_1, DOUBLE_2, DOUBLE_3));
        assertFalse(PrimitiveConditionUtils.isWithin(DOUBLE_3, DOUBLE_1, DOUBLE_2));
    }

    @Test
    void testIsWithinDoublePositive() {
        assertTrue(PrimitiveConditionUtils.isWithin(DOUBLE_2, DOUBLE_1, DOUBLE_3));
        assertTrue(PrimitiveConditionUtils.isWithin(DOUBLE_1, DOUBLE_1, DOUBLE_2));
        assertTrue(PrimitiveConditionUtils.isWithin(DOUBLE_3, DOUBLE_2, DOUBLE_3));
    }

    /*
    float section
     */

    @Test
    void testEqualsAllFloatNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAll(FLOAT_1, EMPTY_FLOAT_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAll(FLOAT_1, FLOAT_2));
        assertFalse(PrimitiveConditionUtils.equalsAll(FLOAT_1, FLOAT_2, FLOAT_3));
    }

    @Test
    void testEqualsAllFloatPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAll(FLOAT_1, FLOAT_1));
        assertTrue(PrimitiveConditionUtils.equalsAll(FLOAT_1, FLOAT_1, FLOAT_1));
    }

    @Test
    void testEqualsAnyFloatNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAny(FLOAT_1, EMPTY_FLOAT_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAny(FLOAT_1, FLOAT_2));
        assertFalse(PrimitiveConditionUtils.equalsAny(FLOAT_1, FLOAT_2, FLOAT_3));
    }

    @Test
    void testEqualsAnyFloatPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAny(FLOAT_1, FLOAT_1));
        assertTrue(PrimitiveConditionUtils.equalsAny(FLOAT_1, FLOAT_1, FLOAT_2));
        assertTrue(PrimitiveConditionUtils.equalsAny(FLOAT_1, FLOAT_3, FLOAT_2, FLOAT_1));
    }

    @Test
    void testEqualsNoneFloatNegative() {
        assertFalse(PrimitiveConditionUtils.equalsNone(FLOAT_1, FLOAT_1));
        assertFalse(PrimitiveConditionUtils.equalsNone(FLOAT_1, FLOAT_1, FLOAT_2));
        assertFalse(PrimitiveConditionUtils.equalsNone(FLOAT_1, FLOAT_3, FLOAT_2, FLOAT_1));
    }

    @Test
    void testEqualsNoneFloatPositive() {
        assertTrue(PrimitiveConditionUtils.equalsNone(FLOAT_1, EMPTY_FLOAT_ARRAY));
        assertTrue(PrimitiveConditionUtils.equalsNone(FLOAT_1, FLOAT_2));
        assertTrue(PrimitiveConditionUtils.equalsNone(FLOAT_1, FLOAT_2, FLOAT_3));
    }

    @Test
    void testIsBetweenFloatIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isBetween(FLOAT_1, FLOAT_3, FLOAT_2));
    }

    @Test
    void testIsBetweenFloatNegative() {
        assertFalse(PrimitiveConditionUtils.isBetween(FLOAT_1, FLOAT_2, FLOAT_3));
        assertFalse(PrimitiveConditionUtils.isBetween(FLOAT_3, FLOAT_1, FLOAT_2));
    }

    @Test
    void testIsBetweenFloatPositive() {
        assertTrue(PrimitiveConditionUtils.isBetween(FLOAT_2, FLOAT_1, FLOAT_3));
    }

    @Test
    void testIsWithinFloatIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isWithin(FLOAT_1, FLOAT_3, FLOAT_2));
    }

    @Test
    void testIsWithinFloatNegative() {
        assertFalse(PrimitiveConditionUtils.isWithin(FLOAT_1, FLOAT_2, FLOAT_3));
        assertFalse(PrimitiveConditionUtils.isWithin(FLOAT_3, FLOAT_1, FLOAT_2));
    }

    @Test
    void testIsWithinFloatPositive() {
        assertTrue(PrimitiveConditionUtils.isWithin(FLOAT_2, FLOAT_1, FLOAT_3));
        assertTrue(PrimitiveConditionUtils.isWithin(FLOAT_1, FLOAT_1, FLOAT_2));
        assertTrue(PrimitiveConditionUtils.isWithin(FLOAT_3, FLOAT_2, FLOAT_3));
    }

    /*
    int section
     */
    @Test
    void testEqualsAllIntNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAll(INT_1, EMPTY_INT_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAll(INT_1, INT_2));
        assertFalse(PrimitiveConditionUtils.equalsAll(INT_1, INT_2, INT_3));
    }

    @Test
    void testEqualsAllIntPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAll(INT_1, INT_1));
        assertTrue(PrimitiveConditionUtils.equalsAll(INT_1, INT_1, INT_1));
    }

    @Test
    void testEqualsAnyIntNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAny(INT_1, EMPTY_INT_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAny(INT_1, INT_2));
        assertFalse(PrimitiveConditionUtils.equalsAny(INT_1, INT_2, INT_3));
    }

    @Test
    void testEqualsAnyIntPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAny(INT_1, INT_1));
        assertTrue(PrimitiveConditionUtils.equalsAny(INT_1, INT_1, INT_2));
        assertTrue(PrimitiveConditionUtils.equalsAny(INT_1, INT_3, INT_2, INT_1));
    }

    @Test
    void testEqualsNoneIntNegative() {
        assertFalse(PrimitiveConditionUtils.equalsNone(INT_1, INT_1));
        assertFalse(PrimitiveConditionUtils.equalsNone(INT_1, INT_1, INT_2));
        assertFalse(PrimitiveConditionUtils.equalsNone(INT_1, INT_3, INT_2, INT_1));
    }

    @Test
    void testEqualsNoneIntPositive() {
        assertTrue(PrimitiveConditionUtils.equalsNone(INT_1, EMPTY_INT_ARRAY));
        assertTrue(PrimitiveConditionUtils.equalsNone(INT_1, INT_2));
        assertTrue(PrimitiveConditionUtils.equalsNone(INT_1, INT_2, INT_3));
    }

    @Test
    void testIsBetweenIntIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isBetween(INT_1, INT_3, INT_2));
    }

    @Test
    void testIsBetweenIntNegative() {
        assertFalse(PrimitiveConditionUtils.isBetween(INT_1, INT_2, INT_3));
        assertFalse(PrimitiveConditionUtils.isBetween(INT_3, INT_1, INT_2));
    }

    @Test
    void testIsBetweenIntPositive() {
        assertTrue(PrimitiveConditionUtils.isBetween(INT_2, INT_1, INT_3));
    }

    @Test
    void testIsWithinIntIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isWithin(INT_1, INT_3, INT_2));
    }

    @Test
    void testIsWithinIntNegative() {
        assertFalse(PrimitiveConditionUtils.isWithin(INT_1, INT_2, INT_3));
        assertFalse(PrimitiveConditionUtils.isWithin(INT_3, INT_1, INT_2));
    }

    @Test
    void testIsWithinIntPositive() {
        assertTrue(PrimitiveConditionUtils.isWithin(INT_2, INT_1, INT_3));
        assertTrue(PrimitiveConditionUtils.isWithin(INT_1, INT_1, INT_2));
        assertTrue(PrimitiveConditionUtils.isWithin(INT_3, INT_2, INT_3));
    }

    /*
    long section
     */

    @Test
    void testEqualsAllLongNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAll(LONG_1, EMPTY_LONG_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAll(LONG_1, LONG_2));
        assertFalse(PrimitiveConditionUtils.equalsAll(LONG_1, LONG_2, LONG_3));
    }

    @Test
    void testEqualsAllLongPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAll(LONG_1, LONG_1));
        assertTrue(PrimitiveConditionUtils.equalsAll(LONG_1, LONG_1, LONG_1));
    }

    @Test
    void testEqualsAnyLongNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAny(LONG_1, EMPTY_LONG_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAny(LONG_1, LONG_2));
        assertFalse(PrimitiveConditionUtils.equalsAny(LONG_1, LONG_2, LONG_3));
    }

    @Test
    void testEqualsAnyLongPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAny(LONG_1, LONG_1));
        assertTrue(PrimitiveConditionUtils.equalsAny(LONG_1, LONG_1, LONG_2));
        assertTrue(PrimitiveConditionUtils.equalsAny(LONG_1, LONG_3, LONG_2, LONG_1));
    }

    @Test
    void testEqualsNoneLongNegative() {
        assertFalse(PrimitiveConditionUtils.equalsNone(LONG_1, LONG_1));
        assertFalse(PrimitiveConditionUtils.equalsNone(LONG_1, LONG_1, LONG_2));
        assertFalse(PrimitiveConditionUtils.equalsNone(LONG_1, LONG_3, LONG_2, LONG_1));
    }

    @Test
    void testEqualsNoneLongPositive() {
        assertTrue(PrimitiveConditionUtils.equalsNone(LONG_1, EMPTY_LONG_ARRAY));
        assertTrue(PrimitiveConditionUtils.equalsNone(LONG_1, LONG_2));
        assertTrue(PrimitiveConditionUtils.equalsNone(LONG_1, LONG_2, LONG_3));
    }

    @Test
    void testIsBetweenLongIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isBetween(LONG_1, LONG_3, LONG_2));
    }

    @Test
    void testIsBetweenLongNegative() {
        assertFalse(PrimitiveConditionUtils.isBetween(LONG_1, LONG_2, LONG_3));
        assertFalse(PrimitiveConditionUtils.isBetween(LONG_3, LONG_1, LONG_2));
    }

    @Test
    void testIsBetweenLongPositive() {
        assertTrue(PrimitiveConditionUtils.isBetween(LONG_2, LONG_1, LONG_3));
    }

    @Test
    void testIsWithinLongIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isWithin(LONG_1, LONG_3, LONG_2));
    }

    @Test
    void testIsWithinLongNegative() {
        assertFalse(PrimitiveConditionUtils.isWithin(LONG_1, LONG_2, LONG_3));
        assertFalse(PrimitiveConditionUtils.isWithin(LONG_3, LONG_1, LONG_2));
    }

    @Test
    void testIsWithinLongPositive() {
        assertTrue(PrimitiveConditionUtils.isWithin(LONG_2, LONG_1, LONG_3));
        assertTrue(PrimitiveConditionUtils.isWithin(LONG_1, LONG_1, LONG_2));
        assertTrue(PrimitiveConditionUtils.isWithin(LONG_3, LONG_2, LONG_3));
    }

    /*
    short section
     */

    @Test
    void testEqualsAllShortNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAll(SHORT_1, EMPTY_SHORT_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAll(SHORT_1, SHORT_2));
        assertFalse(PrimitiveConditionUtils.equalsAll(SHORT_1, SHORT_2, SHORT_3));
    }

    @Test
    void testEqualsAllShortPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAll(SHORT_1, SHORT_1));
        assertTrue(PrimitiveConditionUtils.equalsAll(SHORT_1, SHORT_1, SHORT_1));
    }

    @Test
    void testEqualsAnyShortNegative() {
        assertFalse(PrimitiveConditionUtils.equalsAny(SHORT_1, EMPTY_SHORT_ARRAY));
        assertFalse(PrimitiveConditionUtils.equalsAny(SHORT_1, SHORT_2));
        assertFalse(PrimitiveConditionUtils.equalsAny(SHORT_1, SHORT_2, SHORT_3));
    }

    @Test
    void testEqualsAnyShortPositive() {
        assertTrue(PrimitiveConditionUtils.equalsAny(SHORT_1, SHORT_1));
        assertTrue(PrimitiveConditionUtils.equalsAny(SHORT_1, SHORT_1, SHORT_2));
        assertTrue(PrimitiveConditionUtils.equalsAny(SHORT_1, SHORT_3, SHORT_2, SHORT_1));
    }

    @Test
    void testEqualsNoneShortNegative() {
        assertFalse(PrimitiveConditionUtils.equalsNone(SHORT_1, SHORT_1));
        assertFalse(PrimitiveConditionUtils.equalsNone(SHORT_1, SHORT_1, SHORT_2));
        assertFalse(PrimitiveConditionUtils.equalsNone(SHORT_1, SHORT_3, SHORT_2, SHORT_1));
    }

    @Test
    void testEqualsNoneShortPositive() {
        assertTrue(PrimitiveConditionUtils.equalsNone(SHORT_1, EMPTY_SHORT_ARRAY));
        assertTrue(PrimitiveConditionUtils.equalsNone(SHORT_1, SHORT_2));
        assertTrue(PrimitiveConditionUtils.equalsNone(SHORT_1, SHORT_2, SHORT_3));
    }

    @Test
    void testIsBetweenShortIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isBetween(SHORT_1, SHORT_3, SHORT_2));
    }

    @Test
    void testIsBetweenShortNegative() {
        assertFalse(PrimitiveConditionUtils.isBetween(SHORT_1, SHORT_2, SHORT_3));
        assertFalse(PrimitiveConditionUtils.isBetween(SHORT_3, SHORT_1, SHORT_2));
    }

    @Test
    void testIsBetweenShortPositive() {
        assertTrue(PrimitiveConditionUtils.isBetween(SHORT_2, SHORT_1, SHORT_3));
    }

    @Test
    void testIsWithinShortIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> PrimitiveConditionUtils.isWithin(SHORT_1, SHORT_3, SHORT_2));
    }

    @Test
    void testIsWithinShortNegative() {
        assertFalse(PrimitiveConditionUtils.isWithin(SHORT_1, SHORT_2, SHORT_3));
        assertFalse(PrimitiveConditionUtils.isWithin(SHORT_3, SHORT_1, SHORT_2));
    }

    @Test
    void testIsWithinShortPositive() {
        assertTrue(PrimitiveConditionUtils.isWithin(SHORT_2, SHORT_1, SHORT_3));
        assertTrue(PrimitiveConditionUtils.isWithin(SHORT_1, SHORT_1, SHORT_2));
        assertTrue(PrimitiveConditionUtils.isWithin(SHORT_3, SHORT_2, SHORT_3));
    }
}