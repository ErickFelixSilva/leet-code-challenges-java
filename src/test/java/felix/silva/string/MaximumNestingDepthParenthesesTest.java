package felix.silva.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNestingDepthParenthesesTest {

    private final MaximumNestingDepthParentheses solution = new MaximumNestingDepthParentheses();

    @Test
    public void testSolution() {
        var answer = solution.maxDepth("(1+(2*3)+((8)/4))+1");
        assertEquals(3, answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.maxDepth("(1)+((2))+(((3)))");
        assertEquals(3, answer);
    }
}
