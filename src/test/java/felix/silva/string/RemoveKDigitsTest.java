package felix.silva.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveKDigitsTest {

    private final RemoveKDigits solution = new RemoveKDigits();

    @Test
    public void testSolution() {
        var answer = solution.removeKdigits("1432219", 3);
        assertEquals("1219", answer);
    }

    @Test
    public void testSolution1() {
        var answer = solution.removeKdigits("189154", 3);
        assertEquals("114", answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.removeKdigits("10200", 1);
        assertEquals("200", answer);
    }

    @Test
    public void testSolution3() {
        var answer = solution.removeKdigits("10", 1);
        assertEquals("", answer);
    }

    @Test
    public void testSolution4() {
        var answer = solution.removeKdigits("112", 1);
        assertEquals("", answer);
    }
}
