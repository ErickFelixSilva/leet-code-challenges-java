package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntersectionArraysTest {

    @Test
    public void testSolution() {
        IntersectionArrays solution = new IntersectionArrays();

        var answer = solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        assertEquals(answer, new int[]{2});
        answer = solution.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        assertEquals(answer, new int[]{2});
    }
}
