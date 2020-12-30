package com.examples.functionalinterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        int sum = list.stream().mapToInt(n -> n).sum();
        System.out.println(10/3);

        System.out.println("abcac".substring(0, 3));

    }
}
