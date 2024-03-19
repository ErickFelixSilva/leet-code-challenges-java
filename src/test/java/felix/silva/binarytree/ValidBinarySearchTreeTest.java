package felix.silva.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidBinarySearchTreeTest {
    ValidBinarySearchTree solution = new ValidBinarySearchTree();


    @Test
    public void testSolution() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    public void testSolution1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    public void testSolution2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    public void testSolution3() {
        TreeNode root = new TreeNode(0);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    public void testSolution4() {
        TreeNode root = new TreeNode(32);
        root.left = new TreeNode(26);
        root.left.left = new TreeNode(19);
        root.left.left.right = new TreeNode(27);
        root.right = new TreeNode(47);
        root.right.right = new TreeNode(56);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    public void testSolution5() {
        TreeNode root = new TreeNode(2147483647);
        assertTrue(solution.isValidBST(root));
    }
}
