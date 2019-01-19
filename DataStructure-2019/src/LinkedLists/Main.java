package LinkedLists;

public class Main {
	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertNode(20);
		list.insertNode(30);
		list.insertNode(40);
		list.insertAtBeginning(10);
		list.insertNode(50);
		list.insertNode(60);
		list.traverseLinkedList();
	}
}
