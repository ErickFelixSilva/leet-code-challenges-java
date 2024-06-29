package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerMostWaterTest {
    private final ContainerMostWater solution = new ContainerMostWater();

    @Test
    void testSolution() {
        var answer = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, answer);
    }
}
