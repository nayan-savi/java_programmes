package com.examples.linkedlist;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LinkedListTest {

    @Test
    public void addElementToLLString() {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Nayan");
        stringLinkedList.add("Kumar");
        stringLinkedList.add("HN");
        System.out.println(stringLinkedList);
    }

    @Test
    public void addElementToLLInt() {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(1);
        System.out.println(integerLinkedList);
    }

    @Test
    public void addAtIndexToLL() {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(1);
        integerLinkedList.add(10, 2);
        System.out.println(integerLinkedList);
    }

    @Test
    public void getSizeOfLL() {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(1);
        int size = integerLinkedList.size();
        System.out.println(size);
    }

    @Test
    public void isEmptyLL() {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        boolean isEmpty = integerLinkedList.isEmpty();
        System.out.println(isEmpty);
    }



}
