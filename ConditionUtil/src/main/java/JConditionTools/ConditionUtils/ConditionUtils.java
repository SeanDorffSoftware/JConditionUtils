package JConditionTools.ConditionUtils;

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

    /**
     * @param objects
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
     * @param objects
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
     * @param value
     * @param comparisons
     * @return {@code true} if {@code value} equals all objects in {@code comparisons}
     */
    // TODO: test
    public static boolean equalsAll(Object value, Object... comparisons) {
        if (value == null) {
            if (areNull(comparisons)) {
                return true;
            } else {
                return false;
            }
        }

        for (Object comparison : comparisons) {
            if (!value.equals(comparison)) {
                return false;
            }
        }

        return true;
    }

    // TODO: test, JavaDoc
    public static boolean equalsAny(Object value, Object... comparisons) {
        // TODO
        return false;
    }

    // TODO: test, JavaDoc
    public static boolean equalsNone(Object value, Object... comparisons) {
        // TODO
        return false;
    }

    // TODO: test, JavaDoc
    public static boolean isAnyNotNull(Object... objects) {
        if (objects.length == 0) {
            return false;
        }

        for (Object object : objects) {
            if (object != null) {
                return true;
            }
        }

        return false;
    }

    // TODO: test, JavaDoc
    public static boolean isAnyNull(Object... objects) {
        if (objects.length == 0) {
            return true;
        }

        for (Object object : objects) {
            if (object == null) {
                return true;
            }
        }

        return false;
    }
}