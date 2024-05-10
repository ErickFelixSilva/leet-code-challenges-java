package felix.silva.array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestPrimeFraction {
    public int[] kthSmallestPrimeFraction_t(int[] arr, int k) {
        if (arr.length == 1) {
            return arr;
        }
        PriorityQueue<int[]> smallestFractions = new PriorityQueue<>(k, (o1, o2) -> {
            double fractionO1 = (double) o1[0]/ o1[1];
            double fractionO2 = (double) o2[0]/ o2[1];
            return Double.compare(fractionO1, fractionO2);
        });

        for (int i=0; i < arr.length; i++) {
            for (int j=i+1; j < arr.length; j++) {
                smallestFractions.offer(new int[] {arr[i], arr[j]});
            }
        }

        int[] kthSmallestFraction = new int[] {};
        for (int i = 0; i < k; i++) {
            kthSmallestFraction = smallestFractions.poll();
        }
        return kthSmallestFraction;
    }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> smallestFractions = new PriorityQueue<>(k, (o1, o2) -> {
            double fractionO1 = (double) o1[0]/ o1[1];
            double fractionO2 = (double) o2[0]/ o2[1];
            return Double.compare(fractionO1, fractionO2);
        });

        for (int prime : arr) {
            smallestFractions.offer(new int[]{prime, arr[arr.length - 1]});
        }

        for (int i=1; i < k; i++) {
            var fraction = smallestFractions.poll();
            int numerator = fraction[0];
            int denominator = fraction[1];

            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[j] < denominator) {
                    smallestFractions.offer(new int[]{numerator, arr[j]});
                    break;
                }
            }
        }

        return smallestFractions.poll();
    }
}
