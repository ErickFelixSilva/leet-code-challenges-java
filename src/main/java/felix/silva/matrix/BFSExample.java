package felix.silva.matrix;

import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {
    public static void bfs(int[][] grid, int startX, int startY) {
        // Directions arrays for moving in the grid (up, down, left, right)
        int[] dirX = {-1, 1, 0, 0};
        int[] dirY = {0, 0, -1, 1};

        // Boundary checks
        if (grid == null || grid.length == 0 || grid[0].length == 0) return;
        int m = grid.length, n = grid[0].length;

        // Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});  // Start from the given point

        // Visit the start cell
        grid[startX][startY] = 0; // Optionally mark visited cells by setting them to 0 or another marker

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // Explore neighbors
            for (int i = 0; i < 4; i++) {
                int nx = x + dirX[i];
                int ny = y + dirY[i];

                // Check boundaries and whether the cell is passable and not visited
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == 1) {
                    grid[nx][ny] = 0; // Mark as visited
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 1},
                {1, 0, 0, 1}
        };

        // Perform BFS from top left corner
        bfs(grid, 0, 0);

        // Print updated grid
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
