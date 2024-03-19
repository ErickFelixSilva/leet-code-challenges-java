package felix.silva.binarytree;

public class ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root != null) {
            return validateNode(root);
        }
        return false;
    }

    private boolean validateNode(TreeNode node) {
        boolean valid = true;
        if (node != null) {
            boolean validLeft = node.left == null || node.val > validateBiggerTree(node.left);
            boolean validRight = node.right == null || node.val < validateSmallerTree(node.right);


            valid = valid && validLeft && validateNode(node.left);
            valid = valid && validRight && validateNode(node.right);
        }
        return valid;
    }

    private int validateSmallerTree(TreeNode node) {
        int min = node.left != null ? Math.min(node.val, validateSmallerTree(node.left)) : node.val ;
        return node.right != null ? Math.min(min, validateSmallerTree(node.right)) : min;
    }


    private int validateBiggerTree(TreeNode node) {
        int max = node.left != null ? Math.max(node.val, validateBiggerTree(node.left)) : node.val ;
        return node.right != null ? Math.max(max, validateBiggerTree(node.right)) : max;
    }
}
