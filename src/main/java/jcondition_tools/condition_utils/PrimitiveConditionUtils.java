package jcondition_tools.condition_utils;

/**
 * ObjectConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 */
public class PrimitiveConditionUtils {
    public static final String BOUNDARY_ORDER_ARGUMENT_EXCEPTION = "lowerBoundary is greater than upperBoundary";

    /**
     * Only static methods. Hide constructor.
     */
    private PrimitiveConditionUtils() {
    }

    /*
    boolean section
     */

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals everything in {@code comparisons}
     */
    public static boolean equalsAll(boolean value, boolean... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value != comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals anything in {@code comparisons}
     */
    public static boolean equalsAny(boolean value, boolean... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals nothing in {@code comparisons} or if {@code comparisons} is {@code null} or empty
     */
    public static boolean equalsNone(boolean value, boolean... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return true;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return false;
            }
        }

        return true;
    }

     /*
     byte section
      */

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals everything in {@code comparisons}
     */
    public static boolean equalsAll(byte value, byte... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value != comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals anything in {@code comparisons}
     */
    public static boolean equalsAny(byte value, byte... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals nothing in {@code comparisons} or if {@code comparisons} is {@code null} or empty
     */
    public static boolean equalsNone(byte value, byte... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return true;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is greater than {@code lowerBoundary} and less than {@code upperBoundary}
     */
    public static boolean isBetween(byte value, byte lowerBoundary, byte upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary < value && value < upperBoundary);
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is equal or greater than {@code lowerBoundary} and equal or less than {@code upperBoundary}
     */
    public static boolean isWithin(byte value, byte lowerBoundary, byte upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary <= value && value <= upperBoundary);
    }

    /*
    char section
     */

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals everything in {@code comparisons}
     */
    public static boolean equalsAll(char value, char... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value != comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals anything in {@code comparisons}
     */
    public static boolean equalsAny(char value, char... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals nothing in {@code comparisons} or if {@code comparisons} is {@code null} or empty
     */
    public static boolean equalsNone(char value, char... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return true;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is greater than {@code lowerBoundary} and less than {@code upperBoundary}
     */
    public static boolean isBetween(char value, char lowerBoundary, char upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary < value && value < upperBoundary);
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is equal or greater than {@code lowerBoundary} and equal or less than {@code upperBoundary}
     */
    public static boolean isWithin(char value, char lowerBoundary, char upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary <= value && value <= upperBoundary);
    }

    /*
    double section
     */

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals everything in {@code comparisons}
     */
    public static boolean equalsAll(double value, double... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value != comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals anything in {@code comparisons}
     */
    public static boolean equalsAny(double value, double... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals nothing in {@code comparisons} or if {@code comparisons} is {@code null} or empty
     */
    public static boolean equalsNone(double value, double... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return true;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is greater than {@code lowerBoundary} and less than {@code upperBoundary}
     */
    public static boolean isBetween(double value, double lowerBoundary, double upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary < value && value < upperBoundary);
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is equal or greater than {@code lowerBoundary} and equal or less than {@code upperBoundary}
     */
    public static boolean isWithin(double value, double lowerBoundary, double upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary <= value && value <= upperBoundary);
    }

    /*
    float section
     */

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals everything in {@code comparisons}
     */
    public static boolean equalsAll(float value, float... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value != comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals anything in {@code comparisons}
     */
    public static boolean equalsAny(float value, float... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals nothing in {@code comparisons} or if {@code comparisons} is {@code null} or empty
     */
    public static boolean equalsNone(float value, float... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return true;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is greater than {@code lowerBoundary} and less than {@code upperBoundary}
     */
    public static boolean isBetween(float value, float lowerBoundary, float upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary < value && value < upperBoundary);
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is equal or greater than {@code lowerBoundary} and equal or less than {@code upperBoundary}
     */
    public static boolean isWithin(float value, float lowerBoundary, float upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary <= value && value <= upperBoundary);
    }

    /*
    int section
     */

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals everything in {@code comparisons}
     */
    public static boolean equalsAll(int value, int... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value != comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals anything in {@code comparisons}
     */
    public static boolean equalsAny(int value, int... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals nothing in {@code comparisons} or if {@code comparisons} is {@code null} or empty
     */
    public static boolean equalsNone(int value, int... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return true;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is greater than {@code lowerBoundary} and less than {@code upperBoundary}
     */
    public static boolean isBetween(int value, int lowerBoundary, int upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary < value && value < upperBoundary);
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is equal or greater than {@code lowerBoundary} and equal or less than {@code upperBoundary}
     */
    public static boolean isWithin(int value, int lowerBoundary, int upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary <= value && value <= upperBoundary);
    }

    /*
    long section
     */

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals everything in {@code comparisons}
     */
    public static boolean equalsAll(long value, long... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value != comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals anything in {@code comparisons}
     */
    public static boolean equalsAny(long value, long... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals nothing in {@code comparisons} or if {@code comparisons} is {@code null} or empty
     */
    public static boolean equalsNone(long value, long... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return true;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is greater than {@code lowerBoundary} and less than {@code upperBoundary}
     */
    public static boolean isBetween(long value, long lowerBoundary, long upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary < value && value < upperBoundary);
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is equal or greater than {@code lowerBoundary} and equal or less than {@code upperBoundary}
     */
    public static boolean isWithin(long value, long lowerBoundary, long upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary <= value && value <= upperBoundary);
    }

    /*
    short section
     */

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals everything in {@code comparisons}
     */
    public static boolean equalsAll(short value, short... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value != comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals anything in {@code comparisons}
     */
    public static boolean equalsAny(short value, short... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals nothing in {@code comparisons} or if {@code comparisons} is {@code null} or empty
     */
    public static boolean equalsNone(short value, short... comparisons) {
        if (comparisons == null || comparisons.length == 0) {
            return true;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value == comparisons[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is greater than {@code lowerBoundary} and less than {@code upperBoundary}
     */
    public static boolean isBetween(short value, short lowerBoundary, short upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary < value && value < upperBoundary);
    }

    /**
     * @param value         to be compared
     * @param lowerBoundary of comparison
     * @param upperBoundary of comparison
     * @return {@code true} if {@code value} is equal or greater than {@code lowerBoundary} and equal or less than {@code upperBoundary}
     */
    public static boolean isWithin(short value, short lowerBoundary, short upperBoundary) {
        if (lowerBoundary > upperBoundary) {
            throw new IllegalArgumentException(BOUNDARY_ORDER_ARGUMENT_EXCEPTION);
        }
        return (lowerBoundary <= value && value <= upperBoundary);
    }
}