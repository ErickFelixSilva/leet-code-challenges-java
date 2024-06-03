package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingTripletSubsequenceTest {
    private final IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();
    @Test
    void testSolution() {
        var answer = solution.increasingTriplet(new int[]{1,2,3,4,5});
        assertTrue(answer);
    }

    @Test
    void testSolution1() {
        var answer = solution.increasingTriplet(new int[]{5,4,3,2,1});
        assertFalse(answer);
    }

    @Test
    void testSolution2() {
        var answer = solution.increasingTriplet(new int[]{2,1,5,0,4,6});
        assertTrue(answer);
    }

    @Test
    void testSolution3() {
        var answer = solution.increasingTriplet(new int[]{20,100,10,12,5,13});
        assertTrue(answer);
    }

    @Test
    void testSolution4() {
        var answer = solution.increasingTriplet(new int[]{1,1,-2,6});
        assertFalse(answer);
    }
}
