package jcondition_tools.condition_utils;

import java.util.Collection;

/**
 * CollectionConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 */
public class CollectionConditionUtils {
    /**
     * Only static methods. Hide constructor.
     */
    private CollectionConditionUtils() {
    }

    /**
     * @param collection to be checked
     * @return {@code true} if {@code collection} is not {@code null} or empty
     */
    public static <E> boolean isNotNullOrEmpty(Collection<E> collection) {
        return (collection != null && !collection.isEmpty());
    }

    /**
     * @param collection to be checked
     * @return {@code true} if {@code collection} is {@code null} or empty
     */
    public static <E> boolean isNullOrEmpty(Collection<E> collection) {
        return (collection == null || collection.isEmpty());
    }
}