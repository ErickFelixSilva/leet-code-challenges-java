package felix.silva.string;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {
//    public String customSortString(String order, String s) {
//        Map<Character, Integer> orderMap = new HashMap<>();
//        for (int i = 0; i < order.length(); i++) {
//            orderMap.put(order.charAt(i), i);
//        }
//
//        StringBuilder orderedString = new StringBuilder(s);
//        var ordered = false;
//        var iterationsCounter = 0;
//        while (!ordered) {
//            for (int i = 0; i < orderedString.length(); i++) {
//                iterationsCounter++;
//                var actualChar = orderedString.charAt(i);
//                var actualCharOrder = orderMap.get(actualChar);
//                if (actualCharOrder != null) {
//                    var nextChar = orderMap.entrySet().stream()
//                            .filter(entry -> entry.getValue().equals(actualCharOrder + 1))
//                            .map(Map.Entry::getKey).findFirst().orElse(null);
//                    var indexOfNextChar = orderedString.indexOf(valueOf(nextChar));
//                    if (nextChar != null && indexOfNextChar >= 0 && indexOfNextChar < i) {
//                        swapChars(orderedString, i, i-1);
//                        System.out.println(orderedString + " - " + iterationsCounter);
//                        i = 0;
//                    }
//                }
//            }
//            ordered = true;
//        }
//
//        return orderedString.toString();
//    }

    public String customSortString(String order, String s) {
        Map<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }

        StringBuilder orderedString = new StringBuilder(s);
        var orderedIndex = 0;
        for (char actualCharToOrder: order.toCharArray()) {
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