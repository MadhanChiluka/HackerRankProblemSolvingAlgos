package com.linkedlist;

public class Runner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList() ;
		list.insert(10);
		list.insert(25);
		list.insert(65);
		list.insertAtStart(2);
		list.insertAt(2, 8);
		list.show();
	}
}
