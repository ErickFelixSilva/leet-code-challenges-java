package felix.silva.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskScheduler {
    public class Task {
        char id;
        int count;

        private Task(char id, int counts) {
            this.id = id;
            this.count = counts;
        }
        public String toString() {
            return String.format("%c - Counts: %1d ", id, count);
        }
    }

    Map<Character, Integer> countPerTask;

    public int leastInterval(char[] tasks, int n) {
        countPerTask = new LinkedHashMap<>();
        for (char c : tasks) {
            countPerTask.put(c, countPerTask.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Task> taskByFrequency = new PriorityQueue<>((a, b) -> b.count - a.count);
        for (Map.Entry<Character, Integer> task : countPerTask.entrySet()) {
            taskByFrequency.add(new Task(task.getKey(), task.getValue()));
        }

        int processedTasks = 0;
        Queue<Character> processorQueue = new LinkedList<>();
        while (tasksLeft()) {
            boolean taskAssigned = false;
            for (Task task : taskByFrequency) {
                if (!processorQueue.contains(task.id) && countPerTask.get(task.id) > 0) {
                    processorQueue.add(task.id);
                    countPerTask.put(task.id, countPerTask.get(task.id)-1);
                    taskByFrequency.remove(task);
                    task.count--;
                    taskByFrequency.add(task);
                    taskAssigned = true;
                    processedTasks++;
                    break;
                }
            }
            if (!taskAssigned) {
                processorQueue.add(null);
                processedTasks++; // idle
            }

            if (processorQueue.size() > n) {
                processorQueue.remove();
            }
        }

        return processedTasks;
    }


    private boolean tasksLeft() {
        return countPerTask.entrySet().stream().anyMatch(task -> task.getValue() > 0);
    }
}
