package felix.silva.matrix;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

import static java.lang.Math.abs;

public class FindSafestPath {
    int[] dirX = { -1, 1, 0, 0 };
    int[] dirY = { 0, 0, -1, 1 };

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        for (int i=0; i < grid.size(); i++) {
            for (int j=0; j < grid.getFirst().size(); j++) {
                if (grid.get(i).get(j) == 1) {
                    defineManhatanFromThief(i, j, grid);
                }
            }
        }
        return 0;
    }
    private void defineManhatanFromThief(int startX, int startY, List<List<Integer>> grid) {
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(List.of(startX, startY));

        List<List<Integer>> gridDistance = grid.stream().map(line ->
                line.stream().map(num -> 0).collect(Collectors.toList())).toList();
        while (!queue.isEmpty()) {
            List<Integer> current = queue.poll();
            int x = current.getFirst();
            int y = current.get(1);

            for (int i = 0; i < 4; i++) {
                int nx = x + dirX[i];
                int ny = y + dirY[i];

                if (nx >= 0 && nx < grid.size() &&
                        ny >= 0 && ny < grid.getFirst().size() &&
                        grid.get(nx).get(ny) != 1 && gridDistance.get(nx).get(ny) == 0) {
                    var distance = manhattanDistance(nx, ny, startX, startY);
                    gridDistance.get(nx).set(ny, distance);
                    queue.offer(List.of(nx, ny));
                }
            }
        }
        gridDistance.forEach(System.out::println);
    }

    private int manhattanDistance(int startX, int startY, int endX, int endY) {
        return abs(startX - endX) + abs(startY - endY);
    }
}