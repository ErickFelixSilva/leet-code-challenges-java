package felix.silva.array;

import static java.lang.StringTemplate.STR;

public class StringCompression {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int startGroup = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i+1 == chars.length || chars[i+1] != chars[i]) {
                var quantity = (i+1)-startGroup;
                s.append(STR."\{chars[i]}\{quantity > 1 ? quantity : ""}");
                startGroup = i+1;
            }
        }

        int index = 0;
        for (char c : s.toString().toCharArray()) {
            chars[index] = c;
            index++;
        }

        return s.length();
    }

}
