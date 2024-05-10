package felix.silva.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthSmallestPrimeFractionTest {
    private final KthSmallestPrimeFraction solution = new KthSmallestPrimeFraction();

    @Test
    public void testSolution() {
        var answer = solution.kthSmallestPrimeFraction(new int[] {1,2,3,5}, 3);
        for (int i : answer) {
            System.out.println(i);
        }
        Assertions.assertArrayEquals(answer, new int[] {2,5});
    }

    @Test
    public void testSolution1() {
        var answer = solution.kthSmallestPrimeFraction(new int[] {1,29,47}, 1);
        for (int i : answer) {
            System.out.println(i);
        }
        Assertions.assertArrayEquals(answer, new int[] {1,47});
    }
}
