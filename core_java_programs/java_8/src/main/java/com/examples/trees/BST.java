package com.examples.trees;

public class BST {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        } else {
            if (data < node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
            return node;
        }
    }


    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(40);
        bst.insert(60);
        bst.insert(55);
        bst.insert(56);
        bst.insert(30);
        bst.insert(35);
    }
}
