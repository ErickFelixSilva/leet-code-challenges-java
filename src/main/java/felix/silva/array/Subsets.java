package felix.silva.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>(List.of(Collections.emptyList(), List.of(nums[0])));
        for (int i=1; i < nums.length; i++) {
            subsets.addAll(newSubsets(nums[i], subsets));
        }
        return subsets;
    }

    private List<List<Integer>> newSubsets(int num, List<List<Integer>> subsets) {
        List<List<Integer>> newSubsets = new ArrayList<>();
        for (List<Integer> subset: subsets) {
            var newSubset = Stream.concat(subset.stream(), Stream.of(num)).toList();
            newSubsets.add(newSubset);
        }
        return newSubsets;
    }
}
