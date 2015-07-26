package com.stephendiniz.datastructures;

public class Main {
	public static void main(String[] args) {
		
		final int UNKNOWN		= -1; 
		final int ALL			=  0;
		final int LINKED_LIST	=  1;
		final int STACK			=  2;
		final int QUEUE			=  3;
		final int HEAP			=  4;
		final int HASH_TABLE	=  5;
		final int GRAPH			=  6;
		final int BS_TREE		=  7;

		int testing = -1;
		if(args.length > 0) {
			String test = args[0];
			if(test.equals("--all")) {
				testing = ALL;
			}
			else if(test.equals("--linked-list")) {
				testing = LINKED_LIST;
			}
			else if(test.equals("--stack")) {
				testing = STACK;
			}
			else if(test.equals("--queue")) {
				testing = QUEUE;
			}
			else if(test.equals("--heap")) {
				testing = HEAP;
			}
			else if(test.equals("--hash-table")) {
				testing = HASH_TABLE;
			}
			else if(test.equals("--graph")) {
				testing = GRAPH;
			}
			else if(test.equals("--binary-search-tree")) {
				testing = BS_TREE;
			}
			else {
				testing = UNKNOWN;
			}
		}
		
		if(testing == UNKNOWN) {
			System.out.println("Unknown Arguement, exiting...");
			System.exit(1);
		}
		
		// LinkedList
		if(testing == LINKED_LIST || testing == ALL) {
			System.out.println("=== Linked List ===");
			com.stephendiniz.datastructures.LinkedList list = new com.stephendiniz.datastructures.LinkedList();
			
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
			com.stephendiniz.datastructures.Stack stack = new com.stephendiniz.datastructures.Stack();
			
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
			com.stephendiniz.datastructures.Queue queue = new com.stephendiniz.datastructures.Queue();
			
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
			com.stephendiniz.datastructures.BinarySearchTree bst = new com.stephendiniz.datastructures.BinarySearchTree();
			
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
