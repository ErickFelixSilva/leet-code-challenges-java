package felix.silva.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> firstArray  = new HashMap<>();
        for (int num : nums1) {
            firstArray.putIfAbsent(num, num);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int i = nums2.length-1; i >= 0; i--) {
            int num = nums2[i];
            if (firstArray.get(num) != null) {
                firstArray.remove(num);
                intersection.add(num);
            }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
}
