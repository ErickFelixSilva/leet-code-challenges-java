package felix.silva.binarytree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void testSolution() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
        var answer = solution.inorderTraversal(root);
        assertArrayEquals(answer.stream().mapToInt(Integer::intValue).toArray(), new int[]{1,3,2});
    }
}
