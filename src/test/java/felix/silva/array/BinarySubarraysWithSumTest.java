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
}
