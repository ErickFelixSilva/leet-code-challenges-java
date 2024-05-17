package felix.silva.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteLeavesWithGivenValueTest {

    private final DeleteLeavesWithGivenValue solution = new DeleteLeavesWithGivenValue();

    @Test
    public void testSolution() {
        TreeNode n = new TreeNode(2, new TreeNode(2), null);
        TreeNode n1 = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode root = new TreeNode(1, n, n1);
        var answer = solution.removeLeafNodes(root, 2);

        TreeNode en = new TreeNode(3, null, new TreeNode(4));
        TreeNode expected = new TreeNode(1, null, en);

        assertEquals(expected, answer);
    }

    @Test
    public void testSolution1() {
        TreeNode n = new TreeNode(3, new TreeNode(3), new TreeNode(2));
        TreeNode n1 = new TreeNode(3);
        TreeNode root = new TreeNode(1, n, n1);
        var answer = solution.removeLeafNodes(root, 3);

        TreeNode en = new TreeNode(3, null, new TreeNode(2));
        TreeNode expected = new TreeNode(1, en, null);

        assertEquals(expected, answer);
    }

    @Test
    public void testSolution2() {
        TreeNode root = new TreeNode(1, new TreeNode(1), new TreeNode(1));
        var answer = solution.removeLeafNodes(root, 1);

        assertEquals(null, answer);
    }
}
