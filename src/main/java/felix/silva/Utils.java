package felix.silva;

import java.util.Arrays;
import java.util.List;

public class Utils {

    public static List<Integer> arrayToList(int[] array) {
        return Arrays.stream(array).boxed().toList();
    }
}
