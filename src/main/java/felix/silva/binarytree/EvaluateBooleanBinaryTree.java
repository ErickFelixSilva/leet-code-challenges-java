package felix.silva.binarytree;

public class EvaluateBooleanBinaryTree {
    public boolean evaluateTree(TreeNode root) {
        if (root != null) {
            if (root.val < 2) {
                return root.val == 1;
            } else if (root.val == 2) {
                return evaluateTree(root.left) || evaluateTree(root.right);
            } else if (root.val == 3) {
                return evaluateTree(root.left) && evaluateTree(root.right);
            }
        }
        return false;
    }
}
