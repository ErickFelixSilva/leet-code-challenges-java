package felix.silva.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvaluateBooleanBinaryTreeTest {
    private final EvaluateBooleanBinaryTree solution = new EvaluateBooleanBinaryTree();

    @Test
    public void testSolution() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        var answer = solution.evaluateTree(root);
        assertTrue(answer);
    }

    @Test
    public void testSolution1() {
        TreeNode n = new TreeNode(2, new TreeNode(1), new TreeNode(1));
        TreeNode n1 = new TreeNode(3);
        n1.left = n;
        n1.right = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        n2.left = new TreeNode(1);
        n2.right = n1;
        TreeNode n3 = new TreeNode(2);
        n3.left = n2;
        n3.right = new TreeNode(2, new TreeNode(1), new TreeNode(1));
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3, new TreeNode(0), new TreeNode(0));
        root.right = n3;
        var answer = solution.evaluateTree(root);
        assertFalse(answer);
    }
}
