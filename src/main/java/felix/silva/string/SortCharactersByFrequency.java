package felix.silva.string;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        charFrequency = charFrequency.entrySet()
                .stream()
                .sorted(Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors
                        .toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        StringBuilder orderedString = new StringBuilder(s);
        var orderedIndex = 0;
        for (char actualCharToOrder: charFrequency.keySet()) {
            var lastIndexFound = 0;
            var charIndex = orderedString.indexOf(String.valueOf(actualCharToOrder));

            while (charIndex >= 0) {
                if (charIndex != orderedIndex) {
                    swapChars(orderedString, orderedIndex, charIndex);
                    lastIndexFound = charIndex;
                } else {
                    lastIndexFound = charIndex + 1;
                }
                charIndex = orderedString.indexOf(String.valueOf(actualCharToOrder), lastIndexFound);
                orderedIndex++;
            }
        }

        return orderedString.toString();
    }

    private void swapChars(StringBuilder sb, Integer i, Integer j) {
        char char1 = sb.charAt(i);
        char char2 = sb.charAt(j);
        sb.setCharAt(i, char2);
        sb.setCharAt(j, char1);
    }
}