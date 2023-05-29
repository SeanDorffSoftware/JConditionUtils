package jcondition_tools.condition_utils;

/**
 * ObjectConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 * @since 1.0.0
 */
public class ObjectConditionUtils {
    /**
     * Only static methods. Hide constructor.
     */
    private ObjectConditionUtils() {
    }

    /**
     * @param objects to be checked
     * @return {@code true} if all parameters are not {@code null}
     */
    public static boolean areNotNull(Object... objects) {
        if (objects == null || objects.length == 0) {
            return false;
        }

        for (int i = 0, objectsLength = objects.length; i < objectsLength; i++) {
            if (objects[i] == null) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param objects to be checked
     * @return {@code true} if all parameters are {@code null} or there is no parameter
     */
    public static boolean areNull(Object... objects) {
        if (objects == null || objects.length == 0) {
            return true;
        }

        for (int i = 0, objectsLength = objects.length; i < objectsLength; i++) {
            if (objects[i] != null) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals all objects in {@code comparisons}
     */
    public static boolean equalsAll(Object value, Object... comparisons) {
        if (value == null) {
            return areNull(comparisons);
        }

        if (comparisons == null || comparisons.length == 0) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (!value.equals(comparisons[i])) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals any object in {@code comparisons}
     */
    public static boolean equalsAny(Object value, Object... comparisons) {
        if (value == null) {
            return isAnyNull(comparisons);
        }

        if (areNull(comparisons)) {
            return false;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value.equals(comparisons[i])) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param value       to be compared
     * @param comparisons to be used
     * @return {@code true} if {@code value} equals no object in {@code comparisons}
     */
    public static boolean equalsNone(Object value, Object... comparisons) {
        if (value == null) {
            return areNotNull(comparisons);
        }

        if (areNull(comparisons)) {
            return true;
        }

        for (int i = 0, comparisonsLength = comparisons.length; i < comparisonsLength; i++) {
            if (value.equals(comparisons[i])) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param objects to be checked
     * @return {@code true} if {@code objects} contains a value that is not {@code null}
     */
    public static boolean isAnyNotNull(Object... objects) {
        if (objects == null || objects.length == 0) {
            return false;
        }

        for (int i = 0, objectsLength = objects.length; i < objectsLength; i++) {
            if (objects[i] != null) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param objects to be checked
     * @return {@code true} if {@code objects} contains a value that is {@code null} or there is no parameter
     */
    public static boolean isAnyNull(Object... objects) {
        if (objects == null || objects.length == 0) {
            return true;
        }

        for (int i = 0, objectsLength = objects.length; i < objectsLength; i++) {
            if (objects[i] == null) {
                return true;
            }
        }

        return false;
    }
}