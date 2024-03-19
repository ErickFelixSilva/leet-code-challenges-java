package felix.silva.array;

public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int start = 0, end = 0, sum = 0, count = 0;

        while (end < nums.length) {
            sum += nums[end];

            while (sum > goal && start < end) {
                sum -= nums[start++];
            }

            if (sum == goal) {
                count++;
                int tempStart = start;
                while (tempStart < end && nums[tempStart] == 0) {
                    count++;
                    tempStart++;
                }
            }

            end++;
        }

        return count;
    }
}
