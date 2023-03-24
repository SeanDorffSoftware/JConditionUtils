package jcondition_tools.condition_utils;

import java.util.Arrays;
import java.util.List;

/**
 * ArrayConditionUtils
 * Provides static methods for common conditions.
 *
 * @author Friedemann Metschies
 * @version 1.0.0
 */
public class ArrayConditionUtils {
    /**
     * Only static methods. Hide constructor.
     */
    private ArrayConditionUtils() {
    }

    /**
     * @param array to be checked
     * @return {@code true} if {@code array} is not {@code null} or empty
     */
    public static <E> boolean isNotNullOrEmpty(E[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * @param array to be checked
     * @return {@code true} if {@code array} is {@code null} or empty
     */
    public static <E> boolean isNullOrEmpty(E[] array) {
        return (array == null || array.length == 0);
    }

    /**
     * @param array to be checked
     * @return {@code true} if all elements in {@code array} are not {@code null}
     */
    public static <E> boolean areAllElementsNotNull(E[] array) {
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
     * @return {@code true} if any element in {@code array} is {@code null}
     */
    public static <E> boolean isAnyElementNull(E[] array) {
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
     * @return {@code true} if {@code array} contains all {@code elements}
     */
    public static <E> boolean containsAll(E[] array, E... elements) {
        if (isNullOrEmpty(elements)) {
            return true;
        }

        if (isNullOrEmpty(array)) {
            return false;
        }

        List<E> arrayAsList = Arrays.asList(array);
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
     * @return {@code true} if {@code array} contains at least one element from {@code elements}
     */
    public static <E> boolean containsAny(E[] array, E... elements) {
        if (isNullOrEmpty(elements)) {
            return false;
        }

        if (isNullOrEmpty(array)) {
            return false;
        }

        List<E> arrayAsList = Arrays.asList(array);
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
     * @return {@code true} if {@code array} contains none of the elements in {@code elements}
     */
    public static <E> boolean containsNone(E[] array, E... elements) {
        if (isNullOrEmpty(elements)) {
            return true;
        }

        if (isNullOrEmpty(array)) {
            return true;
        }

        List<E> arrayAsList = Arrays.asList(array);
        for (int i = 0, elementsLength = elements.length; i < elementsLength; i++) {
            if (arrayAsList.contains(elements[i])) {
                return false;
            }
        }

        return true;
    }
}