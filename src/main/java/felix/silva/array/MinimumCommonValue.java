package felix.silva.array;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        Map<Integer, Integer> firstArray = Arrays.stream(nums1).boxed().collect(Collectors.toMap(num -> num, num -> num));

        for (int num : nums2) {
            if (firstArray.get(num) != null) {
                return num;
            }
        }

        return -1;
    }
}
