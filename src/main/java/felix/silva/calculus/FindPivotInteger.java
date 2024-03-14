package felix.silva.calculus;

import java.util.ArrayList;
import java.util.List;

public class FindPivotInteger {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }

        List<Integer> nums = new ArrayList<>();
        for (int i=0; i <= n; i++) {
            nums.add(i);
        }

        int pivot = 1;
        while (pivot < nums.size()) {
            var firstHalf = nums.subList(0, pivot+1).stream().mapToInt(Integer::intValue).sum();
            var otherHalf = nums.subList(pivot, nums.size()).stream().mapToInt(Integer::intValue).sum();
            if (firstHalf == otherHalf) {
                return pivot;
            }
            pivot++;
        }

        return -1;
    }
}
