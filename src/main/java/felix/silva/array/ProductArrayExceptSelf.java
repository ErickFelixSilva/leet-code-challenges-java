package felix.silva.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf2(int[] nums) {
        Map<Integer, Integer> leftProduct = new HashMap<>();
        Map<Integer, Integer> rightProduct = new HashMap<>();
        int product = 0;
        for (int i = 0; i < nums.length; i++) {
            leftProduct.put(i, product);
            if (product == 0 && i == 0) {
                product = nums[i];
            } else {
                product *= nums[i];
            }
        }

        product = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            rightProduct.put(i, product);
            if (product == 0 && i == nums.length-1) {
                product = nums[i];
            } else {
                product *= nums[i];
            }
        }

        int[] products = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                products[i] = rightProduct.get(i);
            } else if (i == nums.length-1) {
                products[i] = leftProduct.get(i);
            } else {
                products[i] = leftProduct.get(i) * rightProduct.get(i);
            }
        }
        return products;
    }

    public int[] productExceptSelf(int[] nums) {
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
