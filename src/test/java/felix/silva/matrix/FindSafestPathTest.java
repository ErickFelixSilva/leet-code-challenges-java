package felix.silva.matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindSafestPathTest {
    FindSafestPath solution = new FindSafestPath();

    @Test
    public void testSolution() {
        var answer = solution.maximumSafenessFactor(List.of(
                List.of(0,0,1),
                List.of(0,0,0),
                List.of(0,0,0)
        ));
        assertEquals(2, answer);
    }
}
