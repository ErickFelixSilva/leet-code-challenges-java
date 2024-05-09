package felix.silva.array;

import java.util.Arrays;

import static java.lang.Math.max;

public class MaximizeHappinessSelectedChildren {
    public long maximumHappinessSum(int [] happiness, int k) {
        Arrays.sort(happiness);
        var happinessDecay = 0;
        long happinessSum = 0;
        var index = happiness.length-1;
        while (happinessDecay < k) {
            happinessSum += max(happiness[index] - happinessDecay, 0);
            happinessDecay++;
            index--;
        }
        return happinessSum;
    }
}
