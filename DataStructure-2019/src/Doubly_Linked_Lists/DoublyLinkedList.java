package Doubly_Linked_Lists;

public class DoublyLinkedList {

	private DoubleLinkedNode head;
	
	public void insertAtBeginning(int data) {
		if(head == null) {
			head = new DoubleLinkedNode(data);
		}else {
			DoubleLinkedNode node = new DoubleLinkedNode(data);
			head.setPrevNode(node);
			node.setNextNode(head);
			head = node;
		}
	}
	
	
	public void insertAtEnd(int data) {
		if(head == null) {
			head = new DoubleLinkedNode(data);
		}else {
			DoubleLinkedNode node = head;
			while(node.getNextNode() != null) {
				node = node.getNextNode();
			}
			DoubleLinkedNode newNode = new DoubleLinkedNode(data);
			newNode.setPrevNode(node);
			node.setNextNode(newNode);
		}
	}
	
	
	public void insertAtPosition(int position, int data) {
		if(position == 0) {
			insertAtBeginning(data);
		}else if(position == size() -1) {
			insertAtEnd(data);
		}else if(position >= size()){
			System.out.println("Out of bounds");
		}else {
			DoubleLinkedNode node = head;
			for(int i=1; i<position; i++) {
				node = node.getNextNode();
			}
			
			DoubleLinkedNode newNode = new DoubleLinkedNode(data);
			newNode.setPrevNode(node);
			newNode.setNextNode(node.getNextNode());
			
			node.getNextNode().setPrevNode(newNode);
			node.setNextNode(newNode);
		}
	}
	
	public void deleteElementAtBeginning() {
		if(head == null) {
			return;
		}else {
			head.getNextNode().setPrevNode(null);
			head = head.getNextNode();
		}
	}
	
	public void deleteElementAtEnd() {
		if(head == null) {
			return;
		}else {
			DoubleLinkedNode node = head;
			while(node.getNextNode() != null) {
				node = node.getNextNode();
			}
			
			node.getPrevNode().setNextNode(null);
			node = null;
		}
	}
	
	public void deleteElementAtPosition(int position) {
		if(position == 0) {
			deleteElementAtBeginning();
		}else if(position == size() -1) {
			deleteElementAtEnd();
		}else if(position >= size()) {
			System.out.println("Out of bounds");
		}else {
			DoubleLinkedNode node = head;
			int count= 0;
			while(count < position) {
				node = node.getNextNode();
				count++;
			}
			
			node.getNextNode().setPrevNode(node.getPrevNode());
			node.getPrevNode().setNextNode(node.getNextNode());
		}
	}
	
	public int size() {
		int count = 1;
		DoubleLinkedNode node = head;
		while(node.getNextNode() != null) {
			node = node.getNextNode();
			count++;
		}
		System.out.println("Size of Double linked list : " + count);
		return count;
	}
	
	public void print() {
		DoubleLinkedNode node = head;
		while(node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNextNode();
		}
		
		
	}
}
