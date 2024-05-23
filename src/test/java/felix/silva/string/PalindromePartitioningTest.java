package felix.silva.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromePartitioningTest {
    private final PalindromePartitioning solution = new PalindromePartitioning();

    @Test
    public void testSolution() {
        var answer = solution.partition("aab");
        System.out.println(answer);
        var expected = List.of(List.of("a", "a", "b"), List.of("aa", "b"));
        for (List<String> palindrome: expected) {
            assertTrue(answer.contains(palindrome));
        }
    }
}
