package felix.silva.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeStringGreatTest {

    private final MakeStringGreat solution = new MakeStringGreat();

    @Test
    public void testSolution() {
        var answer = solution.makeGood("leEeetcode");
        assertEquals("leetcode", answer);
    }

    @Test
    public void testSolution1() {
        var answer = solution.makeGood("abBAcC");
        assertEquals("", answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.makeGood("s");
        assertEquals("s", answer);
    }
}
