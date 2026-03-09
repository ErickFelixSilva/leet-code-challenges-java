package felix.silva.string;

import java.util.HashMap;

public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> letterCounter = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (letterCounter.containsKey(c)) {
                return c;
            } else {
                letterCounter.put(c, 1);
            }
        }
        return 'z';
    }
}
