package com.stephendiniz.queue;

import com.stephendiniz.common.Node;

public class Queue {

	private Node queue;
	
	public Queue() {
		queue = null;
	}
	
	public int size() {
		if(queue == null) {
			return 0;
		}
		
		int size = 1;
		Node countNode = queue;
		while(countNode.getNextNode() != null) {
			countNode = countNode.getNextNode();
			size++;
		}
		
		return size;
	}
	
	public void add(Object data) {
		Node newNode = new Node(data);
		
		if(queue == null) {
			queue = newNode;
		}
		else {
			Node traverseNode = queue;
			while(traverseNode.getNextNode() != null) {
				traverseNode = traverseNode.getNextNode();
			}
			
			traverseNode.setNextNode(newNode);
		}
	}
	
	public Object pop() {
		if(queue != null) {
			Object data = queue.getData();
			queue = queue.getNextNode();
			return data;
		}
		
		return null;
	}
}