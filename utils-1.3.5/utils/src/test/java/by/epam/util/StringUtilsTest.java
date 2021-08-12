package by.epam.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("89"));
    }
}