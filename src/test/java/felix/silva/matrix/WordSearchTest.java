package felix.silva.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordSearchTest {

    private WordSearch solution = new WordSearch();

    @Test
    public void testSolution() {
        var answer = solution.exist(new char[][] {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCCED");
        assertTrue(answer);
    }

    @Test
    public void testSolution1() {
        var answer = solution.exist(new char[][] {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "SEE");
        assertTrue(answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.exist(new char[][] {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCB");
        assertFalse(answer);
    }
}
