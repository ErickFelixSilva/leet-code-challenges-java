package felix.silva.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryTreePreorderTraversalTest {

    @Test
    public void testSolution() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();
        var answer = solution.preorderTraversal(root);
        assertArrayEquals(answer.stream().mapToInt(Integer::intValue).toArray(), new int[]{1,2,3});
    }
}
