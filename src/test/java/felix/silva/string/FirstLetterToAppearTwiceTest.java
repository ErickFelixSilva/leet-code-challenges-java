package felix.silva.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstLetterToAppearTwiceTest {

    private final FirstLetterToAppearTwice solution = new FirstLetterToAppearTwice();

    @Test
    public void testSolution() {
        var answer = solution.repeatedCharacter("abccbaacz");
        assertEquals('c', answer);
    }
}
