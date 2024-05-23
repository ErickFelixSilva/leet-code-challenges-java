package felix.silva.string;

import java.util.*;

public class PalindromePartitioning {
    List<List<String>> result;
    public List<List<String>> partition(String s) {
        result = new ArrayList<>();
        palindromesFromIndex(s, new ArrayList<>(), 0);
        return result;
    }

    private void palindromesFromIndex(String s, List<String> branchPalindromes, int start) {
        if (start == s.length()) {
            result.add(branchPalindromes.stream().toList());
        } else {
            for (int i = start; i < s.length(); i++) {
                String partial = s.substring(start, i + 1);
                if (isPalindrome(partial)) {
                    branchPalindromes.add(partial);
                    palindromesFromIndex(s, branchPalindromes, i + 1);
                    branchPalindromes.removeLast();
                }
            }
        }
    }

    private boolean isPalindrome(String s) {
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}
