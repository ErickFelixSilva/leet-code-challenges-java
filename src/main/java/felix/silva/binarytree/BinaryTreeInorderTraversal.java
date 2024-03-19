package felix.silva.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    List<Integer> elements;
    public List<Integer> inorderTraversal(TreeNode root) {
        elements = new ArrayList<>();
        traverse(root);
        return elements;
    }

    private void traverse(TreeNode root) {
        if (root != null) {
            traverse(root.left);
            elements.add(root.val);
            traverse(root.right);
        }
    }
}
