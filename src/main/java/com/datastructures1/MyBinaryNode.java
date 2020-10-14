package com.datastructures1;

public class MyBinaryNode<K extends Comparable<K>> {
   K key;
   MyBinaryNode<K> left;
   MyBinaryNode<K> right;
       
   MyBinaryNode(K key){
	   this.key=key;
	   this.left=null;
	   this.right=null;
   }
}
