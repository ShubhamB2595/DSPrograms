package com.bst;

public class BSTMain {

	public static void main(String[] args) {

		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		
		tree.insert(20);
		
		tree.inorder();
	}

}
