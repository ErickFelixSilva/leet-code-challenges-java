package felix.silva.array;

/*
 * Code challenge link:
 * https://leetcode.com/problems/binary-search/description/
 */
public class BinarySearch {
    public int search_old(int[] nums, int target) {
        int min = 0, max = nums.length - 1, mid = 0;

        while (min < max) {
            mid = (max + min) / 2;
            if (target >= nums[mid]) {
                min = mid;
                if (nums[min] == target) {
                    return min;
                } else {
                    min++;
                }
            } else {
                max = mid;
                if (nums[max] == target) {
                    return max;
                }
            }
        }

        if (nums[max] == target) {
            return max;
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
