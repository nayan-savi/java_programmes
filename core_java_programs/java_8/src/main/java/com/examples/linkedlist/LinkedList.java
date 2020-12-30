package com.examples.linkedlist;

public class LinkedList<T> {

    Node head;

    public int size() {
        int count = 0;
        Node temp = head;
        if(temp != null) {
            while (temp.next != null) {
                temp = temp.next;
                ++count;
            }
            return count + 1;
        }
        return count;
    }

    public boolean isEmpty() {
        if(head == null) return true;
        return false;
    }

    class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node newData = new Node(data);
        if (data == null) {
            return;
        }
        if (head == null) {
            head = newData;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newData;
        }
    }

    public void add(T data, int index) {
        Node newData = new Node(data);
        Node current = head;
        int count = 0;
        while (count != index - 1) {
            current = current.next;
            count++;
        }
        newData.next = current.next;
        current.next = newData;
    }

}
