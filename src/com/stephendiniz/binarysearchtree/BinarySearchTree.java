package com.stephendiniz.binarysearchtree;

public class BinarySearchTree {

	private Node binarySearchTree;
	
	public BinarySearchTree() {
		binarySearchTree = null;
	}
	
	public void add(int data) {
		if(binarySearchTree == null) {
			binarySearchTree = new Node(data);
		}
		else {
			Node node = binarySearchTree;
			while(true) {
				if(node.getData() >= data) {
					if(node.getLeft() == null) {
						Node newNode = new Node(data);
						node.setLeft(newNode);
						break;
					}
					node = node.getLeft();
				}
				else {
					if(node.getRight() == null) {
						Node newNode = new Node(data);
						node.setRight(newNode);
						break;
					}
					node = node.getRight();
				}
			}
		}
	}
	
	public boolean contains(int data) {
		if(binarySearchTree == null) {
			return false;
		}
		else {
			Node node = binarySearchTree;
			while(true) {
				if(node.getData() == data) {
					return true;
				}
				else {
					if(node.getData() > data) {
						if(node.getLeft() != null) {
							node = node.getLeft();
						}
						else {
							break;
						}
					}
					else {
						if(node.getRight() != null) {
							node = node.getRight();
						}
						else {
							break;
						}
					}
				}
			}
		}
		
		return false;
	}

	public void infix() {
		infixTraverse(binarySearchTree);
	}
	
	public void prefix() {
		prefixTraverse(binarySearchTree);
	}
	
	public void postfix() {
		postfixTraverse(binarySearchTree);
	}
	
	private void infixTraverse(Node node) {
		if(node == null) {
			return;
		}
		
		infixTraverse(node.getLeft());
		System.out.println(node.getData());
		infixTraverse(node.getRight());
	}
	
	private void prefixTraverse(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.println(node.getData());
		prefixTraverse(node.getLeft());
		prefixTraverse(node.getRight());
	}
	
	private void postfixTraverse(Node node) {
		if(node == null) {
			return;
		}
		
		postfixTraverse(node.getLeft());
		postfixTraverse(node.getRight());
		System.out.println(node.getData());
	}
}