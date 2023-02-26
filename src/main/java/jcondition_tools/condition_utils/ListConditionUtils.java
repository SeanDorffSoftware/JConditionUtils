package jcondition_tools.condition_utils;

import java.util.List;

/**
 * ListConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 */
public class ListConditionUtils {
    /**
     * Only static methods. Hide constructor.
     */
    private ListConditionUtils() {
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
}