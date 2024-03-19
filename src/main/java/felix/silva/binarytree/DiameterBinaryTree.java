package felix.silva.binarytree;

public class DiameterBinaryTree {
    int maxDiameter;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        diameter(root);
        return maxDiameter;
    }

    private int diameter(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = diameter(node.left);
            int rightDepth = diameter(node.right);

            maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

            if (leftDepth > rightDepth) {
                return leftDepth + 1;
            } else {
                return rightDepth + 1;
            }
        }
    }
}
