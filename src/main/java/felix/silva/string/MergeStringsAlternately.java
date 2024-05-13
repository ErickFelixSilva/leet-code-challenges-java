package felix.silva.string;

import static java.lang.Math.min;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int smallerWord = min(word1.length(), word2.length());
        for (int i=0; i < smallerWord; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if (word1.length() != word2.length()) {
            String largestWord = word1.length() > word2.length() ? word1 : word2;
            result.append(largestWord, smallerWord, largestWord.length());
        }

        return result.toString();
    }
}
