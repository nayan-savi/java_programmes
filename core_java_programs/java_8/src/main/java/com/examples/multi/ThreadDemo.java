package com.examples.multi;

import java.util.*;

public class ThreadDemo {

    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;


        List<String> list = new ArrayList<>();

        List<String> list1 = new LinkedList<>();

        Set<String> s = new HashSet<>();
        s.add(null);
        System.out.println(s.size());

        Set<String> ss = new TreeSet<>();
        //ss.add(null);
        System.out.println(ss.size());

        Map<String, String> map = new HashMap();
        map.put(null, "test");

        System.out.println(map);



    }
}
