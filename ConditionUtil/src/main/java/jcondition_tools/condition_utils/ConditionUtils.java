package jcondition_tools.condition_utils;

import java.util.List;
import java.util.Map;

/**
 * ConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 */
public class ConditionUtils {
    /**
     * Only static methods. Hide constructor.
     */
    private ConditionUtils() {
    }

    /*
    Objects section
     */

    /**
     * @param objects to be checked
     * @return {@code true} if all parameters are not {@code null}
     */
    public static boolean areNotNull(Object... objects) {
        if (objects == null || objects.length == 0) {
            return false;
        }

        for (Object object : objects) {
            if (object == null) {
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

        for (Object object : objects) {
            if (object != null) {
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

        for (Object comparison : comparisons) {
            if (!value.equals(comparison)) {
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

        for (Object comparison : comparisons) {
            if (value.equals(comparison)) {
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

        for (Object comparison : comparisons) {
            if (value.equals(comparison)) {
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

        for (Object object : objects) {
            if (object != null) {
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

        for (Object object : objects) {
            if (object == null) {
                return true;
            }
        }

        return false;
    }

    /*
    List section
     */

    /**
     * @param list to be checked
     * @return {@code true} if {@code list} is not {@code null} or empty
     */
    public static <E> boolean isNotNullOrEmpty(List<E> list) {
        return (list != null && !list.isEmpty());
    }

    /**
     * @param list to be checked
     * @return {@code true} if {@code list} is {@code null} or empty
     */
    public static <E> boolean isNullOrEmpty(List<E> list) {
        return (list == null || list.isEmpty());
    }

    /*
    Map section
     */

    /**
     * @param map to be checked
     * @return {@code true} if {@code map} is not {@code null} or empty
     */
    public static <K, V> boolean isNotNullOrEmpty(Map<K, V> map) {
        return (map != null && !map.isEmpty());
    }

    /**
     * @param map to be checked
     * @return {@code true} if {@code map} is {@code null} or empty
     */
    public static <K, V> boolean isNullOrEmpty(Map<K, V> map) {
        return (map == null || map.isEmpty());
    }
}