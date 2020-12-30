package com.examples;


public class Test {
    private static String name;


    public static void main(String[] args) throws InterruptedException {
        String name = "Nayan";
        byte[] bytes = name.getBytes();
        System.out.println(bytes);

        System.out.println(new String(bytes));

    }


}
