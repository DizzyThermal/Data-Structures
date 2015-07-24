package com.stephendiniz.common;

// Generic Node for Queue, Stack, LinkedList

public class Node {

	private Object data;
	private Node nextNode;
	private Node prevNode;
	
	public Node() {
		data = null;
		nextNode = null;
		prevNode = null;
	}

	public Node(Object data) {
		this.data = data;
		nextNode = null;
		prevNode = null;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public Node getPrevNode() {
		return this.prevNode;
	}
	
	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
	
}