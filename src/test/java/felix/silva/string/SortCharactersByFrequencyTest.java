package felix.silva.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortCharactersByFrequencyTest {

    SortCharactersByFrequency solution = new SortCharactersByFrequency();

    @Test
    public void testSolution() {
        var answer = solution.frequencySort("tree");
        assertEquals("eert", answer);

    }
}
