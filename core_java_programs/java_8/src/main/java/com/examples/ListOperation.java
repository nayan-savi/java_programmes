package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for(int i=0; i< n; i++) {
            list.add(scan.nextInt());
        }

        int q = scan.nextInt();
        for(int i=0; i < q; i++) {
            String action = scan.next();
            if(action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }

        list.forEach(l-> System.out.print(l.intValue()+" "));

    }
}
