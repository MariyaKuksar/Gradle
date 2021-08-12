package by.epam.util;

import org.apache.commons.lang3.math.NumberUtils;

public final class StringUtils {
    private StringUtils() {
    }

    public static boolean isPositiveNumber(String str) {
        return (NumberUtils.isParsable(str) && (Double.parseDouble(str) > 0));
    }
}
