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
	 
	public void insertAtMiddle(Node node) {
		if(head==null) {
			this.head=node;
			this.tail=node;
			return;
		}
		int mid=lenList()/2;
		int i=1;
		INode temp=head;
		while(i!=mid) {
			temp=temp.getNext();
			i++;
		}
		INode temp1=temp.getNext();
		temp.setNext(node);
		node.setNext(temp1);
		
	}
	
	public INode pop() {
		if(head==null) {
			return null;
		}
		INode temp=head;
		head=head.getNext();
		temp.setNext(null);
		return temp;
	}
	
	public int lenList() {
		if(this.head!=null) {
			INode temp=head;
			int count=0;
			while(temp!=null) {
				count++;
				temp=temp.getNext();
			}
			return count;
		}
		else {
			return 0;
		}
	}
	
	public void printList() {
		if(this.head!=null) {
			INode temp=head;
			while(temp!=null) {
				System.out.print(temp.getKey()+ "->");
				temp=temp.getNext();
			}
			System.out.println(" ");
		}
	}
	
}
