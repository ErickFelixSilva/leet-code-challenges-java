package felix.silva.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistributeCoinsTest {
    private final DistributeCoins solution = new DistributeCoins();

    @Test
    public void testSolution() {
        var answer = solution.distributeCoins(new TreeNode(3, new TreeNode(0), new TreeNode(0)));
        assertEquals(2, answer);
    }

    @Test
    public void testSolution1() {
        var answer = solution.distributeCoins(new TreeNode(0, new TreeNode(3), new TreeNode(0)));
        assertEquals(3, answer);
    }

    @Test
    public void testSolution2() {
        TreeNode n1 = new TreeNode(0, null, new TreeNode(0));
        TreeNode n = new TreeNode(0, null, n1);
        var answer = solution.distributeCoins(new TreeNode(4, n, null));
        assertEquals(6, answer);
    }
}
