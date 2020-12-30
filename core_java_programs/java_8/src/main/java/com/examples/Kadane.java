package com.examples;

public class Kadane {

    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        maxSubArraySum(a, n);
        System.out.println();
        staircase(6);
    }

    static void staircase(int n) {
        for(int i=0; i< n; i++) {
            for(int j=1; j< n - i; j++) {
                System.out.print("0");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }


    static void maxSubArraySum(int a[], int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0, start = 0, end = 0, s = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here += a[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is "+ max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);

        printArray(start, end, a);
    }

    private static void printArray(int start, int end, int[] a) {
        for (int i = start; i <= end; i++) {
            System.out.print(a[i]+",");
        }
    }

}
