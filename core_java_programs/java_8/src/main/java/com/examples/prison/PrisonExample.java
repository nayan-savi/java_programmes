package com.examples.prison;

import java.util.HashSet;
import java.util.Set;

public class PrisonExample {

    public static void main(String[] args) {
        int i = prisonArea(2, 3, new int[]{1,2,3}, new int[]{1,2});
        System.out.println(i);
    }

    public static int prisonArea(int m, int n, int[] h, int[] v) {
        int output = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < h.length; i++) {
            int num= h[i];
            set.add(num);
            set.add(num-1);
        }
        output *= set.size();
        set.clear();

        for (int i = 0; i < v.length; i++) {
            int num= h[i];
            set.add(num);
            set.add(num-1);
        }
        output *= set.size();
        return output;
    }
}

