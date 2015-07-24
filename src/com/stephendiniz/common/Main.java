package com.stephendiniz.common;

public class Main {
	public static void main(String[] args) {
		
		final int ALL			= -1;
		final int LINKED_LIST	=  0;
		final int STACK			=  1;
		final int QUEUE			=  2;
		final int HEAP			=  3;
		final int HASH_TABLE	=  4;
		final int GRAPH			=  5;
		final int BS_TREE		=  6;

		int testing = BS_TREE;
		
		// LinkedList
		if(testing == LINKED_LIST || testing == ALL) {
			System.out.println("=== Linked List ===");
			com.stephendiniz.linkedlist.LinkedList list = new com.stephendiniz.linkedlist.LinkedList();
			
			list.addToEnd(1);
			list.addToEnd(2);
			list.addToEnd(3);
			
			list.remove(1); // Remove 2 - 1, 3
			
			System.out.println("Size: " + list.size());
			System.out.println("2nd Index: " + list.get(1)); // Print 3 
			
			System.out.println("Print List:");
			list.printLinkedList();
		}
		
		// Stack
		if(testing == STACK || testing == ALL) {
			System.out.println("=== Stack ===");
			com.stephendiniz.stack.Stack stack = new com.stephendiniz.stack.Stack();
			
			stack.push(5);
			stack.push(4);
			stack.push(3);
			stack.push(2);
			stack.push(1);
			
			while(stack.size() > 0) {
				System.out.println(stack.pop());
			}
		}
		
		// Queue
		if(testing == QUEUE || testing == ALL) {
			System.out.println("=== Queue ===");
			com.stephendiniz.queue.Queue queue = new com.stephendiniz.queue.Queue();
			
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			
			while(queue.size() > 0) {
				System.out.println(queue.pop());
			}
		}
		
		// Heap
		if(testing == HEAP || testing == ALL) {
			System.out.println("=== Heap ===");
		}
		
		// Hash Table
		if(testing == HASH_TABLE || testing == ALL) {
			System.out.println("=== Hash Table ===");
		}
		
		// Graph
		if(testing == GRAPH || testing == ALL) {
			System.out.println("=== Graph ===");
		}
		
		// Binary Search Tree
		if(testing == BS_TREE || testing == ALL) {
			System.out.println("=== Binary Search Tree ===");
			com.stephendiniz.binarysearchtree.BinarySearchTree bst = new com.stephendiniz.binarysearchtree.BinarySearchTree();
			
			bst.add(5);
			bst.add(3);
			bst.add(8);
			bst.add(100);
			bst.add(9);

			System.out.println("Infix Traversal");		// 3, 5, 8, 9, 100
			bst.infix();
			System.out.println("Postfix Traversal");	// 3, 9, 100, 8, 5
			bst.postfix();
			System.out.println("Prefix Traversal");		// 5, 3, 8, 100, 9
			bst.prefix();
		}
	}
}