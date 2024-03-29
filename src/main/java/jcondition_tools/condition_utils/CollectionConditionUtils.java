package jcondition_tools.condition_utils;

import java.util.Collection;

/**
 * CollectionConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 * @since 1.0.0
 */
public class CollectionConditionUtils {
    /**
     * Only static methods. Hide constructor.
     * @since 1.0.0
     */
    private CollectionConditionUtils() {
    }

    /**
     * @param collection to be checked
     * @param <T>        type
     * @return {@code true} if {@code collection} is not {@code null} or empty
     * @since 1.0.0
     */
    public static <T> boolean isNotNullOrEmpty(Collection<T> collection) {
        return (collection != null && !collection.isEmpty());
    }

    /**
     * @param collection to be checked
     * @param <T>        type
     * @return {@code true} if {@code collection} is {@code null} or empty
     * @since 1.0.0
     */
    public static <T> boolean isNullOrEmpty(Collection<T> collection) {
        return (collection == null || collection.isEmpty());
    }
}