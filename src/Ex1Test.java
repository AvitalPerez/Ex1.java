import assignments.ex1.Ex1;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.descriptor.FileSystemSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v, 2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v, v2);
        assertTrue(Ex1.equals(s10, s2));
    }

    @Test
    void isNumberTest() {
        String[] good = {"1", "1b2", "12b3", "01b2", "123bA", "ABbG", "0bA"};
        for (int i = 0; i < good.length; i = i + 1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"12b37", "6b", "b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for (int i = 0; i < not_good.length; i = i + 1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }

    @Test
    void int2NumberTest() {
        assertEquals("1011", Ex1.int2Number(11, 2));
        assertEquals("", Ex1.int2Number(-1, 10)); // Invalid input
        assertEquals("", Ex1.int2Number(10, 17)); // Invalid base
    }

    @Test
    void number2IntTest() {
        assertEquals(11, Ex1.number2Int("1011b2"));
        assertEquals(-1, Ex1.number2Int("15b10")); //Invalid base
        assertEquals(-1, Ex1.number2Int("12b37")); // Invalid base
        assertEquals(-1, Ex1.number2Int("")); // Empty string
        assertEquals(-1, Ex1.number2Int(null)); // Null input
    }

    @Test
    void equalsTest() {
        assertTrue(Ex1.equals("1011b2", "11bA"));
        assertFalse(Ex1.equals("1011b2", "11b10"));
        assertFalse(Ex1.equals("F", "15b10"));
        assertFalse(Ex1.equals("101b2", "12b10"));
        assertFalse(Ex1.equals("1011b2", null)); // One input is null
        assertFalse(Ex1.equals(null, null)); // Both inputs are null
    }

    @Test
    void maxIndexTest() {
        String[] array = {"101b2", "10b16", "1111b2", "123b8"};
        assertEquals(83, Ex1.maxIndex(array)); // "1111b2" (15 in decimal) is the largest

        //String[] arrayWithInvalid = {"10b2", null, "123b10", "12bG"};
        //assertEquals(2, Ex1.maxIndex(arrayWithInvalid)); // "123b10" (123 in decimal) is the largest

        String[] allInvalid = {"", null, "12b37", "invalid"};
        assertEquals(-1, Ex1.maxIndex(allInvalid)); // No valid numbers
    }
}

