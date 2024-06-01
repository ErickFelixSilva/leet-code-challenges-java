package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInStringTest {
    private final ReverseWordsInString solution = new ReverseWordsInString();

    @Test
    void testSolution() {
        var answer = solution.reverseWords("the sky is blue");
        assertEquals("blue is sky the", answer);
    }

    @Test
    void testSolution1() {
        var answer = solution.reverseWords("  hello world  ");
        assertEquals("world hello", answer);
    }

    @Test
    void testSolution2() {
        var answer = solution.reverseWords("a good   example");
        assertEquals("example good a", answer);
    }
}
