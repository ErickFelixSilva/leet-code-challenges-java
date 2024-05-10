package felix.silva.array;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    private class Pair {
        public int zeroesCounter = 0;
        public int onesCounter = 0;

        public Pair() {}

        public Pair(int zeroesCounter, int onesCounter) {
            this.zeroesCounter = zeroesCounter;
            this.onesCounter = onesCounter;
        }

        public String toString() {
            return zeroesCounter + " - " + onesCounter;
        }
    }

    public int findMaxLength(int[] nums) {
        // Map to store the first occurrence index of each cumulative sum
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with a sum of 0 at index -1 to handle subarrays starting at index 0

        int maxLength = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            counter += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(counter)) {
                // If the counter has been seen before, a subarray with an equal number of 0s and 1s exists
                // Calculate the length of this subarray
                maxLength = Math.max(maxLength, i - map.get(counter));
            } else {
                // Otherwise, store this counter with the current index
                map.put(counter, i);
            }
        }

        return maxLength;
    }

//    public int findMaxLength(int[] nums) {
//        System.out.println(Utils.arrayToList(nums));
//        int start = 0, end = nums.length-1, counter = 0;
//        int[] numsSum = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) counter--;
//            if (nums[i] == 1) counter++;
//            numsSum[i] = counter;
//        }
//
//        System.out.println(Utils.arrayToList(numsSum));
//
//        return Arrays.copyOfRange(nums, start, ++end).length;
//    }
//
//[ 0,  0,  1, 1,  0,  0,  0,  1]
//[-1, -2, -1, 0, -1, -2, -3, -2]
//
//[1, 1, 0, 0,  0,  0,  0, 1]
//[1, 2, 1, 0, -1, -2, -3, -2]

//    public int findMaxLength2(int[] nums) {
//        int start = 0, end = nums.length-1, zeroesCounter = 0, onesCounter = 0;
//        for (int num : nums) {
//            if (num == 0) zeroesCounter++;
//            if (num == 1) onesCounter++;
//        }
//
//        if (zeroesCounter == onesCounter) {
//            return nums.length;
//        }
//
//        while ((zeroesCounter > onesCounter) && (nums[start] == 0 || nums[end] == 0)) {
//            if (nums[start] == 0) {
//                start++;
//                zeroesCounter--;
//            } else if (nums[end] == 0) {
//                end--;
//                zeroesCounter--;
//            }
//        }
//
//        return Arrays.copyOfRange(nums, start, ++end).length;
//    }
}
