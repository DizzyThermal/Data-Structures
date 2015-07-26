package com.stephendiniz.datastructures;

// Generic Node for Binary Search Tree
public class NodeBS {

	private int data;
	private NodeBS left;
	private NodeBS right;
	
	public NodeBS() {
		data = 0;
		left = null;
		right = null;
	}

	public NodeBS(int data) {
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
	
	public NodeBS getLeft() {
		return this.left;
	}
	
	public void setLeft(NodeBS left) {
		this.left = left;
	}

	public NodeBS getRight() {
		return this.right;
	}
	
	public void setRight(NodeBS right) {
		this.right = right;
	}
	
}