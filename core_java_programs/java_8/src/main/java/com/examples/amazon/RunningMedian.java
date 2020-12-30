package com.examples.amazon;

import java.util.*;

public class RunningMedian {

    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // keeps track of the SMALL numbers
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();                           // keeps track of the LARGE numbers

    static double[] runningMedian(int[] a) {
        double[] output = new double[a.length];
        List<Integer> track = new ArrayList<>(a.length);
        for (int i = 0; i < a.length; i++) {
            track.add(i, a[i]);
            track.sort(Comparator.naturalOrder());
            int len = track.size();
            if (len % 2 == 1) {
                int mean = track.get(len / 2);
                output[i] = mean;
            } else {
                int index = len / 2;
                double mean = (double)(track.get(index) + track.get(index - 1)) / 2;
                output[i] = mean;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] a = {12, 4, 5, 3, 8, 7};
        //int[] a = {1,2,3,4,5,6,7,8,9,10};
        double[] doubles = runningMedian(a);
        System.out.println(doubles);

        medianTracker(a);
    }

    public static void medianTracker(int [] array) {
        for (int i = 0; i < array.length; i++) {
            addNumber(array[i]);
            System.out.println(getMedian());
        }
    }

    private static void addNumber(int n) {
        if (maxHeap.isEmpty()) {
            maxHeap.add(n);
        } else if (maxHeap.size() == minHeap.size()) {
            if (n < minHeap.peek()) {
                maxHeap.add(n);
            } else {
                minHeap.add(n);
                maxHeap.add(minHeap.remove());
            }
        } else if (maxHeap.size() > minHeap.size()) {
            if (n > maxHeap.peek()) {
                minHeap.add(n);
            } else {
                maxHeap.add(n);
                minHeap.add(maxHeap.remove());
            }
        }
        // maxHeap will never have fewer elements than minHeap
    }

    private static double getMedian() {
        if (maxHeap.isEmpty()) {
            return 0;
        } else if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else { // maxHeap must have more elements than minHeap
            return maxHeap.peek();
        }
    }
}
