package com.examples.functionalinterface;

public interface Employee {

    void display();

    default void printAddress() {
        System.out.println("Address prin");
    }
}
