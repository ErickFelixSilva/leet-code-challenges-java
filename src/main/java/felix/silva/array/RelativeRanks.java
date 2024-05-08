package felix.silva.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class RelativeRanks {
    public String[] findRelativeRanks2(int[] score) {
        var sorted = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).toList();
        var ranks = new HashMap<Integer, String>();
        for (int i=0; i < sorted.size(); i++) {
            if (i==0) {
                ranks.put(sorted.get(i), "Gold Medal");
            } else if (i==1) {
                ranks.put(sorted.get(i), "Silver Medal");
            } else if (i==2) {
                ranks.put(sorted.get(i), "Bronze Medal");
            } else ranks.put(sorted.get(i), String.valueOf(i+1));
        }

        var result = new String[score.length];
        for (int i=0; i < score.length; i++) {
            result[i] = ranks.get(score[i]);
        }

        return result;
    }

    public String[] findRelativeRanks(int[] score) {
        Integer[] indices = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(score[b], score[a]));

        var result = new String[score.length];
        for (int i=0; i < score.length; i++) {
            if (i == 0) {
                result[indices[i]] = "Gold Medal";
            } else if (i == 1) {
                result[indices[i]] = "Silver Medal";
            } else if (i == 2) {
                result[indices[i]] = "Bronze Medal";
            } else {
                result[indices[i]] = Integer.toString(i + 1);
            }
        }

        return result;
    }
}
