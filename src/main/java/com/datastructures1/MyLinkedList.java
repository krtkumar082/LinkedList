package com.datastructures1;

public class MyLinkedList {
	public INode head;
	public INode tail;
	
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void addAtFront(Node node) {
		if(head==null) {
			this.head=node;
			this.tail=node;
		}
		else {
			node.setNext(head);
			this.head=node;
		}
	}
	
	public void addAtEnd(Node node) {
		if(head==null) {
			this.head=node;
			this.tail=node;
		}
		else {
			tail.setNext(node);
			tail=tail.getNext();
		}
	}
	
	public void printList() {
		if(this.head!=null) {
			INode temp=head;
			while(temp!=null) {
				System.out.print(temp.getKey()+ "->");
				temp=temp.getNext();
			}
		}
	}
	
}
