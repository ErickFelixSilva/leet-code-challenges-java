package felix.silva.binarytree;

public class DeleteLeavesWithGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root.left != null) {
            removeLeafNodes(root.left, target);
            if (checkIfShouldDelete(root.left, target)) {
                root.left = null;
            }
        }
        if (root.right != null) {
            removeLeafNodes(root.right, target);
            if (checkIfShouldDelete(root.right, target)) {
                root.right = null;
            }
        }

        if (checkIfShouldDelete(root, target)) {
            return null;
        }
        return root;
    }

    private boolean checkIfShouldDelete(TreeNode node, int target) {
        return node.left == null && node.right == null && node.val == target;
    }
}
