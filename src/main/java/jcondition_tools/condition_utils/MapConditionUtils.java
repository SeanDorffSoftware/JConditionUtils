package jcondition_tools.condition_utils;

import java.util.Map;

/**
 * MapConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 * @since 1.0.0
 */
public class MapConditionUtils {
    /**
     * Only static methods. Hide constructor.
     */
    private MapConditionUtils() {
    }

    /**
     * @param map     to be checked
     * @param entries to be compared
     * @param <K>     key type
     * @param <V>     value type
     * @return {@code true} if {@code map} is not {@code null} or empty, {@code entries} if not {@code null} or empty and {@code map} contains all of the {@code entries}
     */
    public static <K, V> boolean containsAll(Map<K, V> map, Map<K, V> entries) {
        if (isNullOrEmpty(map)) {
            return false;
        }

        if (isNullOrEmpty(entries)) {
            return true;
        }

        for (Map.Entry<K, V> entry : entries.entrySet()) {
            if (!containsTuple(map, entry)) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param map     to be checked
     * @param entries to be compared
     * @param <K>     key type
     * @param <V>     value type
     * @return {@code true} if {@code map} is not {@code null} or empty, {@code entries} if not {@code null} or empty and {@code map} contains at least one of the {@code entries}
     */
    public static <K, V> boolean containsAny(Map<K, V> map, Map<K, V> entries) {
        if (isNullOrEmpty(map)) {
            return false;
        }

        if (isNullOrEmpty(entries)) {
            return false;
        }

        for (Map.Entry<K, V> entry : entries.entrySet()) {
            if (containsTuple(map, entry)) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param map     to be checked
     * @param entries to be compared
     * @param <K>     key type
     * @param <V>     value type
     * @return {@code true} if {@code map} is not {@code null} or empty and contains none of the {@code entries}
     */
    public static <K, V> boolean containsNone(Map<K, V> map, Map<K, V> entries) {
        if (isNullOrEmpty(map)) {
            return true;
        }

        if (isNullOrEmpty(entries)) {
            return true;
        }

        for (Map.Entry<K, V> entry : entries.entrySet()) {
            if (containsTuple(map, entry)) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param map   to be checked
     * @param entry to be compared
     * @param <K>   key type
     * @param <V>   value type
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
     * @param <K> key type
     * @param <V> value type
     * @return {@code true} if {@code map} is not {@code null} or empty
     */
    public static <K, V> boolean isNotNullOrEmpty(Map<K, V> map) {
        return (map != null && !map.isEmpty());
    }

    /**
     * @param map to be checked
     * @param <K> key type
     * @param <V> value type
     * @return {@code true} if {@code map} is {@code null} or empty
     */
    public static <K, V> boolean isNullOrEmpty(Map<K, V> map) {
        return (map == null || map.isEmpty());
    }
}