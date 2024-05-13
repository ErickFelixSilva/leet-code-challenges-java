package felix.silva.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternatelyTest {
    private final MergeStringsAlternately solution = new MergeStringsAlternately();

    @Test
    public void testSolution() {
        var answer = solution.mergeAlternately("abc", "pqr");
        assertEquals("apbqcr", answer);
    }

    @Test
    public void testSolution1() {
        var answer = solution.mergeAlternately("ab", "pqrs");
        assertEquals("apbqrs", answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.mergeAlternately("abcd", "pq");
        assertEquals("apbqcd", answer);
    }
}
