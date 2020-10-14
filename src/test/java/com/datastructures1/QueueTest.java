package com.datastructures1;

import org.junit.Test;

public class QueueTest {
	@Test
	public void given3NumberWhenAddedToStackShouldBeAddedFromFront() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyQueue queue = new MyQueue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.print();

	}
	
	@Test
	public void given3NumberWhenAddedToQueueShouldBeDequeue() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		MyQueue queue = new MyQueue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.print();
		queue.dequeue();
		queue.print();

	}
}
