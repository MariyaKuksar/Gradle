package by.epam.core;

import by.epam.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public final class Utils {

    private Utils() {
    }

    public static boolean isAllPositiveNumbers(String... str) {
        return (!ArrayUtils.isEmpty(str) && Arrays.stream(str).allMatch(StringUtils::isPositiveNumber));
    }
}
