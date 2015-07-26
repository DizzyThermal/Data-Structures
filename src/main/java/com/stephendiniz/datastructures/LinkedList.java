package com.stephendiniz.datastructures;

public class LinkedList {

	private Node linkedList;
	
	public LinkedList() {
		linkedList = null;
	}
	
	public int size() {
		if(linkedList == null) {
			return 0;
		}
		
		int size = 1;
		Node countNode = linkedList;
		while(countNode.getNextNode() != null) {
			countNode = countNode.getNextNode();
			size++;
		}
		
		return size;
	}
	
	public void addToEnd(Object data) {
		Node newNode = new Node(data);
		
		if(linkedList == null) {
			linkedList = newNode;
		}
		else {
			Node traverseNode = linkedList;
			while(traverseNode.getNextNode() != null) {
				traverseNode = traverseNode.getNextNode();
			}
			
			traverseNode.setNextNode(newNode);
			newNode.setPrevNode(traverseNode);
		}
	}
	
	public void addToFront(Object data) {
		Node newNode = new Node(data);
		
		if(linkedList == null) {
			linkedList = newNode;
		}
		else {
			newNode.setNextNode(linkedList);
			linkedList = newNode;
		}
	}
	
	public Object remove(int index) {
		if((index < 0) || (index >= size())) {
			System.out.println("IndexOutOfBounds Error");
			
			return null;
		}
		else {
			int i = 0;
			Node nodeToDelete = linkedList;
			while(i < index) {
				nodeToDelete = nodeToDelete.getNextNode();
				i++;
			}
			
			if(nodeToDelete.getPrevNode() != null) {
				nodeToDelete.getPrevNode().setNextNode(nodeToDelete.getNextNode());
			}
			if(nodeToDelete.getNextNode() != null) {
				nodeToDelete.getNextNode().setPrevNode(nodeToDelete.getPrevNode());
			}
			
			return nodeToDelete.getData();
		}
	}
	
	public void printLinkedList() {
		if(linkedList != null) {
			
			Node traverseNode = linkedList;
			do {
				System.out.println(traverseNode.getData());
				traverseNode = traverseNode.getNextNode();
			} while(traverseNode.getNextNode() != null);
			
			// Print Last Node
			System.out.println(traverseNode.getData());
		}
	}
	
	public Object get(int index) {
		if((index < 0) || (index >= size())) {
			System.out.println("IndexOutOfBounds Error");
			
			return null;
		}

		int i = 0;
		Node node = linkedList;
		while(i < index) {
			node = node.getNextNode();
			i++;
		}
		
		return node.getData();
	}
}