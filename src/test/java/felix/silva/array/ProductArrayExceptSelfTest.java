package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductArrayExceptSelfTest {

    @Test
    void testSolution() {
        ProductArrayExceptSelf solution = new ProductArrayExceptSelf();
        var answer = solution.productExceptSelf(new int[]{1,2,3,4});
        assertArrayEquals(new int[]{24, 12, 8, 6}, answer);
    }

    @Test
    void testSolution2() {
        ProductArrayExceptSelf solution = new ProductArrayExceptSelf();
        var answer = solution.productExceptSelf(new int[]{-1,1,0,-3,3});
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, answer);
    }

    @Test
    void testSolution3() {
        ProductArrayExceptSelf solution = new ProductArrayExceptSelf();
        var answer = solution.productExceptSelf(new int[]{1,2,3,4,5,6,7,8,9,10});
        assertArrayEquals(new int[]{3628800, 1814400, 1209600, 907200, 725760, 604800, 518400, 453600, 403200, 362880}, answer);
    }

    @Test
    void testSolution4() {
        ProductArrayExceptSelf solution = new ProductArrayExceptSelf();
        var answer = solution.productExceptSelf(new int[]{0,0});
        assertArrayEquals(new int[]{0, 0}, answer);
    }
}
