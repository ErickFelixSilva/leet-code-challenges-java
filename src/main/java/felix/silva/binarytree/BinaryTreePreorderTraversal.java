package felix.silva.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    List<Integer> elements;
    public List<Integer> preorderTraversal(TreeNode root) {
        elements = new ArrayList<>();
        traverse(root);
        return elements;
    }

    private void traverse(TreeNode root) {
        if (root != null) {
            elements.add(root.val);
            traverse(root.left);
            traverse(root.right);
        }
    }
}
