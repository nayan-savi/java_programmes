package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>(5);
        queries.add(Arrays.asList(1, 0, 5));
        queries.add(Arrays.asList(1, 1, 7));
        queries.add(Arrays.asList(1, 0, 3));
        queries.add(Arrays.asList(2, 1, 0));
        queries.add(Arrays.asList(2, 1, 1));

        dynamicArray(2, queries);
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> seqList = new ArrayList<>(n);
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> query = queries.get(i);
            int q = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            if(q == 1) {
                int seqIndex = findSequenceIndex(x, lastAnswer, n);
                List<Integer> integers = seqList.get(seqIndex);
                integers.add(y);
            } else {
                int seqIndex = findSequenceIndex(x, lastAnswer, n);
                int element = y % (seqList.get(seqIndex).size());
                lastAnswer = seqList.get(seqIndex).get(element);
                output.add(lastAnswer);
            }
        }
        System.out.println(output);
        return output;
    }

    public static int findSequenceIndex(int x, int lastAnswer, int n) {
        return ((x ^ lastAnswer) % n);
    }
}
