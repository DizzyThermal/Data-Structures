package com.stephendiniz.stack;

import com.stephendiniz.common.Node;

public class Stack {

	private Node stack;
	
	public Stack() {
		stack = null;
	}
	
	public int size() {
		if(stack == null) {
			return 0;
		}
		
		int size = 1;
		Node countNode = stack;
		while(countNode.getNextNode() != null) {
			countNode = countNode.getNextNode();
			size++;
		}
		
		return size;
	}
	
	public void push(Object data) {
		Node newNode = new Node(data);
		
		if(stack == null) {
			stack = newNode;
		}
		else {
			newNode.setNextNode(stack);
			stack = newNode;
		}
	}
	
	public Object pop() {
		if(stack != null) {
			Object data = stack.getData();
			stack = stack.getNextNode();
			return data;
		}
		
		return null;
	}
}