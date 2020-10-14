package com.datastructures1;

import org.junit.Assert;
import org.junit.Test;

public class StackNQueueTest {
	@Test
	public void given3NumberWhenAddedToStackShouldBeAddedFromTop() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		MyStack stack = new MyStack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.print();
	}
	
	@Test
	public void given3NumberWhenPopStackShouldBeLastAddedNode() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		MyStack stack = new MyStack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		INode pop = stack.pop();
		Assert.assertEquals(thirdNode, pop);
		stack.print();

	}
	
}
