package felix.silva.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private final BinarySearch solution = new BinarySearch();

    @ParameterizedTest(name = "{0}")
    @MethodSource("searchCases")
    void search_returnsExpectedIndex(String caseName, int[] nums, int target, int expected) {
        var answer = solution.search(nums, target);
        assertEquals(expected, answer);
    }

    private static Stream<Arguments> searchCases() {
        return Stream.of(
                Arguments.of("finds value in middle", new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of("returns -1 when target does not exist", new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),
                Arguments.of("finds value in single-element array", new int[]{5}, 5, 0),
                Arguments.of("finds value at upper index in two elements", new int[]{2, 5}, 5, 1),
                Arguments.of("returns -1 when target below lower bound", new int[]{2, 5}, 0, -1),
                Arguments.of("returns -1 for empty array", new int[]{}, 1, -1),
                Arguments.of("finds first index", new int[]{2, 5, 8}, 2, 0),
                Arguments.of("returns -1 when target above upper bound", new int[]{2, 5, 8}, 10, -1)
        );
    }
}
