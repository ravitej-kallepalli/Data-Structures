package Doubly_Linked_Lists;

public class DoubleLinkedNode {
	private DoubleLinkedNode nextNode;
	private DoubleLinkedNode prevNode;
	private int data;
	
	public DoubleLinkedNode(int data) {
		this.data = data;
	}
	
	public DoubleLinkedNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(DoubleLinkedNode nextNode) {
		this.nextNode = nextNode;
	}
	public DoubleLinkedNode getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(DoubleLinkedNode prevNode) {
		this.prevNode = prevNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
	
}
