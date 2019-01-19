package Doubly_Linked_Lists;

import Doubly_Linked_Lists.DoublyLinkedList;

public class Main {
	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtBeginning(30);
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);
		
		list.insertAtEnd(40);
		list.insertAtPosition(3, 50);
		
		list.deleteElementAtBeginning();
		list.deleteElementAtEnd();
		list.deleteElementAtPosition(1);
		list.print();
	}
}
