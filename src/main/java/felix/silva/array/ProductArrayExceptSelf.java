package felix.silva.array;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] productResult = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            productResult[i] = product;
        }

        product = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            int left = i-1 >= 0 ? productResult[i-1] : 1;
            productResult[i] = product * left;
            product *= nums[i];
        }

        return productResult;
    }

    public int[] productExceptSelf_(int[] nums) {
        System.out.println(Arrays.stream(nums).boxed().toList());
        int[] productResult = new int[nums.length];
        int product = 0;

        // Left product
        for(int i = 0; i < nums.length; i++) {
            productResult[i] = product;
            if (product == 0 && i == 0) {
                product = nums[i];
            } else {
                product *= nums[i];
            }
        }

        // Right product
        product = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            if (i == 0) {
                productResult[i] = product;
            } else {
                productResult[i] = productResult[i] * product;
            }
            if (product == 0 && i == nums.length-1) {
                product = nums[i];
            } else {
                product *= nums[i];
            }
        }

        System.out.println(Arrays.stream(productResult).boxed().toList());
        return productResult;
    }
}
