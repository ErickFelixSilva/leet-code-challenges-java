package felix.silva.string;

public class MaximumNestingDepthParentheses {
    public int maxDepth(String s) {
        var depth = 0;
        var maxDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (c == ')') {
                depth--;
            }
        }

        return maxDepth;
    }
}
