package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressionTest {
     private final StringCompression solution = new StringCompression();
    @Test
    void testSolution() {
        var answer = solution.compress(new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'});
        assertEquals(6, answer);
    }

    @Test
    void testSolution1() {
        var answer = solution.compress(new char[] {'a'});
        assertEquals(1, answer);
    }

    @Test
    void testSolution2() {
        var answer = solution.compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'});
        assertEquals(4, answer);
    }
}
