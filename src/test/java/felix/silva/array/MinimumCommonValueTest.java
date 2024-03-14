package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCommonValueTest {

    @Test
    public void testSolution() {
        MinimumCommonValue solution = new MinimumCommonValue();
        var answer = solution.getCommon(new int[]{1, 2, 3}, new int[]{2, 4});
        assertEquals(answer, 2);
    }
}
