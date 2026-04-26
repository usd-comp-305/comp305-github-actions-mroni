package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    @Test
    void testReverseFirst() {
        assertEquals("tsrif", StringUtils.reverseString("first"));
    }

    @Test
    void testReverseSecond() {
        assertEquals("dnoces", StringUtils.reverseString("second"));
    }

    @Test
    void testReverseEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void testReverseSingleChar() {
        assertEquals("a", StringUtils.reverseString("a"));
    }
}
