package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskSchedulerTest {

    TaskScheduler solution = new TaskScheduler();

    @Test
    public void testSolution() {
        var answer = solution.leastInterval(new char[]{'A','A','A','B','B','B'}, 2);
        assertEquals(answer, 8);
    }

    @Test
    public void testSolution1() {
        var answer = solution.leastInterval(new char[]{'A','C','A','B','D','B'}, 1);
        assertEquals(6, answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.leastInterval(new char[]{'A','A','A','B','B','B', 'C', 'C', 'C', 'D', 'D', 'E'}, 2);
        assertEquals(12, answer);
    }
}
