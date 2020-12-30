package com.examples.amazon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tries {

    static final int ALPHA_SIZE = 26;
    public static ContactNode root;

    static class ContactNode {
        ContactNode[] contactNodes = new ContactNode[ALPHA_SIZE];
        int count;

        ContactNode() {
            count = 0;
            for (int i = 0; i < ALPHA_SIZE; i++) contactNodes[i] = null;
        }
    }

    public static void insertContact(String contact) {
        ContactNode child = root;
        int length = contact.length();
        for (int i = 0; i < length; i++) {
            int index = contact.charAt(i) - 'a';
            if (child.contactNodes[index] == null) {
                child.contactNodes[index] = new ContactNode();
            }
            child = child.contactNodes[index];
            child.count++;
        }
    }

    public static int searchContact(String key) {
        ContactNode child = root;
        int length = key.length();
        for (int i = 0; i < length; i++) {
            int index = key.charAt(i) - 'a';
            if(child.contactNodes[index] != null) {
                child = child.contactNodes[index];
            } else {
                return 0;
            }
        }
        return child.count;
    }


    static int[] contacts(String[][] queries) {
        root = new ContactNode();
        int length = queries.length;
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < length; i++) {
            String[] query = queries[i];
            String action = query[0];
            String value = query[1];
            if(action.equals("add")) {
                insertContact(value);
            } else {
                int count = searchContact(value);
                output.add(count);
            }
        }
        int[] out = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            out[i] = output.get(i);
        }
        return out;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[][] quries = new String[4][2];
        String[] query = new String[2];
        query[0] = "add";
        query[1] = "hack";
        quries[0] = query;

        String[] query1 = new String[2];
        query1[0] = "add";
        query1[1] = "hackerrank";
        quries[1] = query1;

        String[] query2 = new String[2];
        query2[0] = "find";
        query2[1] = "hac";
        quries[2] = query2;

        String[] query3 = new String[2];
        query3[0] = "find";
        query3[1] = "hak";
        quries[3] = query3;

        int[] contacts = contacts(quries);

        System.out.println(contacts.toString());
    }
}

