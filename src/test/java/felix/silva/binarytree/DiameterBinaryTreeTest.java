package felix.silva.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiameterBinaryTreeTest {

    @Test
    public void testSolution() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        DiameterBinaryTree solution = new DiameterBinaryTree();
        var answer = solution.diameterOfBinaryTree(root);
        assertEquals(answer, 3);
    }
}
