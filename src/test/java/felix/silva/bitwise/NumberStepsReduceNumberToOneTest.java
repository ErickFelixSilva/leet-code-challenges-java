package felix.silva.bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberStepsReduceNumberToOneTest {
    private final NumberStepsReduceNumberToOne solution = new NumberStepsReduceNumberToOne();

    @Test
    void testSolution() {
        var answer = solution.numSteps("1101");
        assertEquals(6, answer);
    }

    @Test
    void testSolution1() {
        var answer = solution.numSteps("10101010");
        assertEquals(12, answer);
    }
}
