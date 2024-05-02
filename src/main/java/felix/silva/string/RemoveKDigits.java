package felix.silva.string;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        var result = new StringBuilder(num);
        var removals = 0;
        var index = 1;

        if (num.length() == k) {
            return "0";
        }

        while(removals < k) {
            if (index == result.length()) {
                index = 1;
            } else if (result.charAt(index-1) > result.charAt(index)) {
                result.deleteCharAt(index-1);
                removals++;
                while (!result.isEmpty() && result.charAt(0) == '0') {
                    result.deleteCharAt(0);
                }
            } else {
                index++;
            }
        }

        return result.isEmpty() ? "0" : result.toString();
    }
}
