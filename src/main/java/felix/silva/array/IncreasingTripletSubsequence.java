package felix.silva.array;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            } else if (num < secondSmallest && num > smallest) {
                secondSmallest = num;
            }

            if (num > secondSmallest) {
                return true;
            }
        }

        return false;
    }
}
