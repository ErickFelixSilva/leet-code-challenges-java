package felix.silva.binarytree;

import static java.lang.Math.abs;

public class DistributeCoins {
    int moves = 0;

    public int distributeCoins(TreeNode root) {
        moves = 0;
        dfs(root);
        return moves;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        var leftCoins = dfs(node.left);
        var rightCoins = dfs(node.right);

        moves += abs(leftCoins) + abs(rightCoins);
        return (node.val - 1) + leftCoins + rightCoins;
    }
}
