package felix.silva.string;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Problem link: https://leetcode.com/problems/isomorphic-strings/?envType=daily-question&envId=2024-04-02
public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        var sCharactersPositions = mapCharacters(s);
        var tCharactersPositions = mapCharacters(t);

        return sCharactersPositions.equals(tCharactersPositions);
    }

    public List<Integer> mapCharacters(String s) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charMap.putIfAbsent(s.charAt(i), i);
        }

        List<Integer> characterPositions = new ArrayList<>();
        for (char c : s.toCharArray()) {
            characterPositions.add(charMap.get(c));
        }

        return characterPositions;
    }
}