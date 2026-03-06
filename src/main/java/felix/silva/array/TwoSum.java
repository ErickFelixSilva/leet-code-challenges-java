package felix.silva.array;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valuesMap = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            int valueToTarget = target - nums[i];
            if (valuesMap.containsKey(valueToTarget)) {
                return new int [] {valuesMap.get(valueToTarget), i};
            } else {
                valuesMap.put(nums[i], i);
            }
        }
        return new int [] {};
    }
}
