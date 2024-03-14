package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySubarraysWithSumTest {

    @Test
    public void testSolution() {
        BinarySubarraysWithSum solution = new BinarySubarraysWithSum();
        var answer = solution.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2);
        assertEquals(answer, 4);
    }

    @Test
    public void testSolution1() {
        BinarySubarraysWithSum solution = new BinarySubarraysWithSum();
        var answer = solution.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0}, 0);
        assertEquals(answer, 15);
    }

    @Test
    public void testSolution2() {
        BinarySubarraysWithSum solution = new BinarySubarraysWithSum();
        var answer = solution.numSubarraysWithSum(new int[]{0,0,0,0,0,0,1,0,0,0}, 0);
        assertEquals(answer, 27);
    }
}
