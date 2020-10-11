package com.datastructures1;

import org.junit.Test;

import org.junit.Assert;

public class LinkedListTest {
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedAtFront() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		MyLinkedList list = new MyLinkedList();
		list.addAtFront(firstNode);
		list.addAtFront(secondNode);
		list.addAtFront(thirdNode);
		list.printList();
	}
	
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedAtEnd() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addAtEnd(firstNode);
		list.addAtEnd(secondNode);
		list.addAtEnd(thirdNode);
		list.printList();
	}
	
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedAtMiddle() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addAtEnd(firstNode);	
		list.addAtEnd(thirdNode);
		list.insertAtMiddle(secondNode);
		list.printList();
	}
	
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeDeletedAtFront() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addAtEnd(firstNode);
		list.addAtEnd(secondNode);
		list.addAtEnd(thirdNode);
		list.printList();
		INode pop=list.pop();
		list.printList();
		Assert.assertEquals(firstNode,pop );
	}
	
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeDeletedAtEnd() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addAtEnd(firstNode);
		list.addAtEnd(secondNode);
		list.addAtEnd(thirdNode);
		list.printList();
		INode pop=list.popLast();
		list.printList();
		Assert.assertEquals(thirdNode,pop );
	}
}
