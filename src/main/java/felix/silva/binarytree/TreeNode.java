package felix.silva.binarytree;

import java.util.Objects;

public class TreeNode {
      int val;
      public TreeNode left;
      TreeNode right;

      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    @Override
    public String toString() {
        if (this.left != null && this.right != null) {
            return String.format("node: %s  \n- left: %s  \n- right: %s", this.val, this.left, this.right);
        } else if (this.left != null) {
            return String.format("node: %s  \n- left: %s", this.val, this.left);
        } else if (this.right != null) {
            return String.format("node: %s  \n- right: %s", this.val, this.right);
        } else {
            return String.format("node: %s", this.val);
        }
    }
}
