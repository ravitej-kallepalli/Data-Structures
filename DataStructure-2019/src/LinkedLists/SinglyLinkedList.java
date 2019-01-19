package LinkedLists;

public class SinglyLinkedList {

	public Node node;

	public void insertNode(int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			Node temp = node;
			while (temp.getNextNode() != null) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(new Node(data));
		}
	}
	
	public void insertAtBeginning(int data) {
		Node temp = new Node(data);
		temp.setNextNode(node);
		node = temp;
	}
	
	public void deleteAtEnd() {
		
	}

	public void traverseLinkedList() {
		Node temp = node;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNextNode();
		}
	}
}
