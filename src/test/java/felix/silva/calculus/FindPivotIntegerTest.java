package felix.silva.calculus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPivotIntegerTest {

    @Test
    public void testSolution() {
        FindPivotInteger solution = new FindPivotInteger();
        var answer = solution.pivotInteger(8);
        assertEquals(String.valueOf(answer), "6");
    }
}
