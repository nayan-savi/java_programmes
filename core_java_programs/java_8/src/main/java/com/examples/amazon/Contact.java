package com.examples.amazon;

public class Contact {

    static final int ALPHA_SIZE = 26;
    public ContactNode root;

    static class ContactNode {
        ContactNode[] contactNodes = new ContactNode[ALPHA_SIZE];
        int count;

        ContactNode() {
            count = 0;
            for (int i = 0; i < ALPHA_SIZE; i++) contactNodes[i] = null;
        }
    }

    public void insertContact(String contact) {
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

    public int searchContact(String key) {
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

    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.root = new ContactNode();
        contact.insertContact("hack");
        contact.insertContact("hacker");
        contact.insertContact("hackos");
        contact.insertContact("hacpost");
        System.out.println(contact.searchContact("hacko"));
    }
}
