package com.stephendiniz.binarysearchtree;

// Generic Node for Binary Search Tree
public class Node {

	private int data;
	private Node left;
	private Node right;
	
	public Node() {
		data = 0;
		left = null;
		right = null;
	}

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getLeft() {
		return this.left;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return this.right;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
	
}