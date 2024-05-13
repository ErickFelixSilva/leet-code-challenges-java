package felix.silva.matrix;

import static java.lang.Math.max;


public class LargestLocalValuesMatrix {
    public int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length-2][grid[1].length-2];
        for (int i=0; i < result.length; i++) {
            for (int j=0; j < result[i].length; j++) {
                result[i][j] = getPositionMax(i+1, j+1, grid);
            }
        }

        return result;
    }

    private int getPositionMax(int i, int j, int[][] grid) {
        int max = max(grid[i][j], grid[i][j-1]);
        max = max(max, grid[i-1][j]);
        max = max(max, grid[i-1][j-1]);
        max = max(max, grid[i+1][j-1]);
        max = max(max, grid[i+1][j+1]);
        max = max(max, grid[i][j+1]);
        max = max(max, grid[i+1][j]);
        return max(max, grid[i-1][j+1]);
    }
}
