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
     * @param map   to be checked
     * @param entry to be compared
     * @return {@code true} if {@code map} is not {@code null} or empty and contains the tuple {@code entry}
     */
    public static <K, V> boolean containsTuple(Map<K, V> map, Map.Entry<K, V> entry) {
        if (isNullOrEmpty(map)) {
            return false;
        }
        if (entry == null) {
            return false;
        }

        K entryKey = entry.getKey();
        if (map.containsKey(entryKey)) {
            V mapValue = map.get(entryKey);
            V entryValue = entry.getValue();
            if (ObjectConditionUtils.areNull(entryValue, mapValue)) {
                return true;
            }
            if (entryValue == null) {
                return false;
            }
            if (entryValue.equals(mapValue)) {
                return true;
            }
        }
        return false;
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