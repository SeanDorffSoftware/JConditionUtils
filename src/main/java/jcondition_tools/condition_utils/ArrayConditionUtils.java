package jcondition_tools.condition_utils;

import java.util.Arrays;
import java.util.List;

/**
 * ArrayConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 * @since 1.0.0
 */
public class ArrayConditionUtils {
    /**
     * Only static methods. Hide constructor.
     */
    private ArrayConditionUtils() {
    }

    /**
     * @param array to be checked
     * @param <T>   type
     * @return {@code true} if {@code array} is not {@code null} or empty
     */
    public static <T> boolean isNotNullOrEmpty(T[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * @param array to be checked
     * @param <T>   type
     * @return {@code true} if {@code array} is {@code null} or empty
     */
    public static <T> boolean isNullOrEmpty(T[] array) {
        return (array == null || array.length == 0);
    }

    /**
     * @param array to be checked
     * @param <T>   type
     * @return {@code true} if all elements in {@code array} are not {@code null}
     */
    public static <T> boolean areAllElementsNotNull(T[] array) {
        if (isNullOrEmpty(array)) {
            return false;
        }

        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            if (array[i] == null) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param array to be checked
     * @param <T>   type
     * @return {@code true} if any element in {@code array} is {@code null}
     */
    public static <T> boolean isAnyElementNull(T[] array) {
        if (isNullOrEmpty(array)) {
            return false;
        }

        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            if (array[i] == null) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array    to be checked
     * @param elements to be searched
     * @param <T>      type
     * @return {@code true} if {@code array} contains all {@code elements}
     */
    public static <T> boolean containsAll(T[] array, T... elements) {
        if (isNullOrEmpty(elements)) {
            return true;
        }

        if (isNullOrEmpty(array)) {
            return false;
        }

        List<T> arrayAsList = Arrays.asList(array);
        for (int i = 0, elementsLength = elements.length; i < elementsLength; i++) {
            if (!arrayAsList.contains(elements[i])) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param array    to be checked
     * @param elements to be searched
     * @param <T>      type
     * @return {@code true} if {@code array} contains at least one element from {@code elements}
     */
    public static <T> boolean containsAny(T[] array, T... elements) {
        if (isNullOrEmpty(elements)) {
            return false;
        }

        if (isNullOrEmpty(array)) {
            return false;
        }

        List<T> arrayAsList = Arrays.asList(array);
        for (int i = 0, elementsLength = elements.length; i < elementsLength; i++) {
            if (arrayAsList.contains(elements[i])) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array    to be checked
     * @param elements to be searched
     * @param <T>      type
     * @return {@code true} if {@code array} contains none of the elements in {@code elements}
     */
    public static <T> boolean containsNone(T[] array, T... elements) {
        if (isNullOrEmpty(elements)) {
            return true;
        }

        if (isNullOrEmpty(array)) {
            return true;
        }

        List<T> arrayAsList = Arrays.asList(array);
        for (int i = 0, elementsLength = elements.length; i < elementsLength; i++) {
            if (arrayAsList.contains(elements[i])) {
                return false;
            }
        }

        return true;
    }
}