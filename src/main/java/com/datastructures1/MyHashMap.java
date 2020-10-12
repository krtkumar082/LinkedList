package com.datastructures1;
import com.datastructures1.MyLinkedList;
import com.datastructures1.MyMapNode;
public class MyHashMap<K,V> {
   MyLinkedList<K> myLinkedList;
   public MyHashMap() {
	   this.myLinkedList=new MyLinkedList<>();
   }
   public V get(K key) {
	   MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		return (myMapNode==null)?null:myMapNode.getvalue();
	}
}
