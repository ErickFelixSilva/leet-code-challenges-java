package felix.silva.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicStringTest {

    IsomorphicString solution = new IsomorphicString();

    @Test
    public void testSolution() {
        var answer = solution.isIsomorphic("egg", "add");
        assertTrue(answer);
    }

    @Test
    public void testSolution1() {
        var answer = solution.isIsomorphic("foo", "bar");
        assertFalse(answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.isIsomorphic("paper", "title");
        assertTrue(answer);
    }

    @Test
    public void testSolution3() {
        var answer = solution.isIsomorphic("abcdefghijklmnopqrstuvwxyzva", "abcdefghijklmnopqrstuvwxyzck");
        assertFalse(answer);
    }
}
