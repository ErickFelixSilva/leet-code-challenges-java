package felix.silva.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SubsetsTest {
    private final Subsets solution = new Subsets();

    @Test
    public void testSolution() {
        var answer = solution.subsets(new int[] {1,2,3});
        List<List<Integer>> expected = List.of(List.of(), List.of(1), List.of(2), List.of(1,2), List.of(3), List.of(1,3), List.of(2,3), List.of(1,2,3));
        for (List<Integer> subset : expected) {
            assertTrue(answer.contains(subset));
        }
    }

}
