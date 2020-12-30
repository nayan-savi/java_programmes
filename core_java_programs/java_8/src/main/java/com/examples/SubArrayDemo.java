package com.examples;

import java.util.Scanner;

public class SubArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int d = 0; d < n; d++)
            arr[d] = scan.nextInt();

        int output = totalNegativeCount(arr, n);
        System.out.println(output);
    }

    public static int totalNegativeCount(int a[], int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] < 0) count++;
            sum = a[i];
            for(int j = i + 1; j < n; j++) {
                sum = sum + a[j];
                if(sum < 0) count++;
            }
            sum = 0;
        }
        return count;
    }
}
