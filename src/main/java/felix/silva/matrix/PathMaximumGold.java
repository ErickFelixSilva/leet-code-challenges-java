package felix.silva.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.max;

public class PathMaximumGold {
    public int getMaximumGold(int[][] grid) {
        int maximumGold = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                maximumGold = max(maximumGold, maximumGoldForPosition(i, j, grid));
            }
        }
        return maximumGold;
    }

    private int maximumGoldForPosition(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        int temp = grid[i][j];
        List<Integer> goldSums = Arrays.asList(temp, temp, temp, temp);
        grid[i][j] = 0;

        goldSums.set(0, goldSums.get(0) + maximumGoldForPosition(i - 1, j, grid));
        goldSums.set(1, goldSums.get(1) + maximumGoldForPosition(i + 1, j, grid));
        goldSums.set(2, goldSums.get(2) + maximumGoldForPosition(i, j + 1, grid));
        goldSums.set(3, goldSums.get(3) + maximumGoldForPosition(i, j - 1, grid));

        grid[i][j] = temp;
        return Collections.max(goldSums);
    }
}
