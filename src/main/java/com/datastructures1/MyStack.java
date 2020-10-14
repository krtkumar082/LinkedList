package com.datastructures1;

public class MyStack {
	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode node) {
		myLinkedList.addAtFront(node);
	}

	public void print() {
		myLinkedList.printList();
	}
	
	public INode peek() {
		return myLinkedList.head;
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public static void main(String[] args) {

	}
}
