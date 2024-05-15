package felix.silva.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathMaximumGoldTest {
    private final PathMaximumGold solution = new PathMaximumGold();

    @Test
    public void testSolution() {
        var answer = solution.getMaximumGold(new int[][] {{0,6,0}, {5,8,7}, {0,9,0}});
        assertEquals(24, answer);
    }

    @Test
    public void testSolution1() {
        var answer = solution.getMaximumGold(new int[][] {{1,0,7}, {2,0,6}, {3,4,5},{0,3,0},{9,0,20}});
        assertEquals(28, answer);
    }
}
