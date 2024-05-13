package felix.silva.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LargestLocalValuesMatrixTest {
    private final LargestLocalValuesMatrix solution = new LargestLocalValuesMatrix();

    @Test
    public void testSolution() {
        var answer = solution.largestLocal(new int[][] {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}});
        var expected = new int [][] {{9,9}, {8,6}};

        for (int i=0; i<expected.length; i++) {
            assertArrayEquals(expected[i], answer[i]);
        }
    }

    @Test
    public void testSolution1() {
        var answer = solution.largestLocal(new int[][] {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}});
        var expected = new int [][] {{2,2,2},{2,2,2},{2,2,2}};

        for (int i=0; i<expected.length; i++) {
            assertArrayEquals(expected[i], answer[i]);
        }
    }
}
