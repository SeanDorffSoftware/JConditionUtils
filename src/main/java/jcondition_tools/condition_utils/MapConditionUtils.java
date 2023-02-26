package jcondition_tools.condition_utils;

import java.util.Map;

/**
 * MapConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 */
public class MapConditionUtils {
    /**
     * Only static methods. Hide constructor.
     */
    private MapConditionUtils() {
    }

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