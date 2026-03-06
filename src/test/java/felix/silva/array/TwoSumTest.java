package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    public void testSolution() {
        var answer = solution.twoSum(new int[] {2,7,11,15}, 9);
        assertArrayEquals(new int[] {0,1}, answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.twoSum(new int[] {-3,4,3,90}, 0);
        assertArrayEquals(new int[] {0,2}, answer);
    }

}
