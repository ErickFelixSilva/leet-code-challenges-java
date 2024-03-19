package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContiguousArrayTest {

    @Test
    public void testSolution() {
        ContiguousArray solution = new ContiguousArray();
        var answer = solution.findMaxLength(new int[]{0,1});
        assertEquals(answer, 2);
    }

    @Test
    public void testSolution1() {
        ContiguousArray solution = new ContiguousArray();
        var answer = solution.findMaxLength(new int[]{0,1,0});
        assertEquals(answer, 2);
    }

    @Test
    public void testSolution3() {
        ContiguousArray solution = new ContiguousArray();
        var answer = solution.findMaxLength(new int[]{0,0,1,1,0,0,0,1});
        assertEquals(answer, 6);
    }

    @Test
    public void testSolution4() {
        ContiguousArray solution = new ContiguousArray();
        var answer = solution.findMaxLength(new int[]{1,1,0,0,0,0,0,1});
        assertEquals(answer, 4);
    }
}
