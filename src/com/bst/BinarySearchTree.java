package com.bst;

public class BinarySearchTree <T extends Comparable <T>> {
	
	// class node for making the operation
	class Node<T> {
        T key;
        Node<T> left, right;
 
        public Node(T data) {
            key = data;
            left = right = null;
        }
    }

	Node<T> root;
	 
    // Constructor
    BinarySearchTree() {
         root = null;
    }
 
    //method for inserting the data
    void insert(T key) {
         root = insertRec(root, key);
    }
 
    // recursive method for inserting data
    Node<T> insertRec(Node<T> root, T key) {
 
        if (root == null)
        {
            root = new Node<T>(key);
            return root;
        }
 
        if (key.compareTo(root.key) > 0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) < 0)
            root.right = insertRec(root.right, key);

        return root;
    }
 
    //method for inordered root
    void inorder() {
         inorderRec(root);
    }
 
    void inorderRec(Node<T> root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
}
