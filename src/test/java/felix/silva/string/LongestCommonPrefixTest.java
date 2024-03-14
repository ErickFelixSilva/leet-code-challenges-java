package felix.silva.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void testSolution() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        var answer = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals(answer, "fl");
    }
}