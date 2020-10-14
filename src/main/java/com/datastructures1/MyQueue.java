package com.datastructures1;

public class MyQueue {
	private final MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode node) {
		myLinkedList.addAtEnd(node);
	}

	public void print() {
		myLinkedList.printList();
	}
}
