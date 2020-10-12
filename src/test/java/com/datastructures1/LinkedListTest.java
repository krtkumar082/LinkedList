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
	
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeReturnKeyValue() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyLinkedList list = new MyLinkedList();
		list.addAtEnd(firstNode);
		list.addAtEnd(secondNode);
		list.addAtEnd(thirdNode);
		list.printList();
		INode temp=list.search(30);
		
		Assert.assertEquals(30,temp.getKey() );
	}
	
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddNodeAfterGiven() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		Node<Integer> newNode = new Node<Integer>(40);
		MyLinkedList list = new MyLinkedList();
		list.addAtEnd(firstNode);
		list.addAtEnd(secondNode);
		list.addAtEnd(thirdNode);
		list.printList();
		INode<Integer> first=secondNode.getNext();
		list.insert(newNode, 30);
		list.printList();
		INode<Integer> second=newNode.getNext();
		boolean result=first.equals(second);
		Assert.assertEquals(true,result );
	}
 
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeDeleteNodeAfterGiven() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		Node<Integer> newNode = new Node<Integer>(40);
		MyLinkedList list = new MyLinkedList();
		list.addAtEnd(firstNode);
		list.addAtEnd(secondNode);
		list.addAtEnd(thirdNode);
		list.printList();
		
		list.insert(newNode, 30);
		list.printList();
		//Integer i=list.lenList();
		INode<Integer> first=newNode.getNext();
		list.deleteAnode(40);
		list.printList();
		INode<Integer> second=secondNode.getNext();
		//Integer j=list.lenList();
		//boolean result= (i-1)==(j);
		boolean result=first.equals(second);
		Assert.assertEquals(true,result );
	}
}
