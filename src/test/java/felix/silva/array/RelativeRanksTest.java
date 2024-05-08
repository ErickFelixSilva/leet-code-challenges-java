package felix.silva.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelativeRanksTest {

    private final RelativeRanks solution = new RelativeRanks();

    @Test
    public void testSolutiono() {
        var answer = solution.findRelativeRanks(new int[] {5,4,3,2,1});
        assertArrayEquals(new String[] {"Gold Medal","Silver Medal","Bronze Medal","4","5"}, answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.findRelativeRanks(new int[] {10,3,8,9,4});
        assertArrayEquals(new String[] {"Gold Medal","5","Bronze Medal","Silver Medal","4"}, answer);
    }
}
