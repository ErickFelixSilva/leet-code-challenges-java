package felix.silva.array;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        var separetedWords = s.split(" ");
        for (int i = separetedWords.length-1; i >= 0; i--) {
            if (!separetedWords[i].isEmpty()) {
                result.append(separetedWords[i]).append(" ");
            }
        }

        return result.toString().trim();
    }
}
