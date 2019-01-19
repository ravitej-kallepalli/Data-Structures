package LinkedLists;

public class SinglyLinkedList {

	/* ADT - Abstract data types for Linked List class */
	private Node head;

	/*
	 * Complexity is 0(n) As we have to traverse the end of the list to insert the
	 * item.
	 */
	public void insertAtEnd(int data) {
		Node node;
		if (head == null) {
			head = new Node(data);
		} else {
			node = head;
			while (node.getNextNode() != null) {
				node = node.getNextNode();
			}
			node.setNextNode(new Node(data));
		}
	}

	/*
	 * Complexity is 0(1) As we don't have to loop through the list, we can replace
	 * the head with the new node
	 */
	public void insertAtBeginning(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.setNextNode(head);
			head = node;
		}
	}

	public void insertAtPosition(int data, int position) {
		int count = 1;
		Node presentNode = head;

		if (position == 0) {
			insertAtBeginning(data);
			return;
		}

		while (count < position && presentNode != null) {
			presentNode = presentNode.getNextNode();
			count++;
		}

		if (count == position) {
			Node temp = presentNode;
			Node node = new Node(data);
			node.setNextNode(temp.getNextNode());
			temp.setNextNode(node);
			return;
		}
		System.out.println("Unable to insert node at given posit");
	}

	/*
	 * Complexity - 0(n)
	 */
	public void walkThroughNodes() {
		Node node = head;
		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNextNode();
		}
	}

	public void deleteElementAtBeginning() {
		Node node = head;
		if (node == null) {
			return;
		} else {
			head = node.getNextNode();
			node = null;
		}
	}

	public void deleteElemnetAtEnd() {
		if (head == null) {
			return;
		}
		Node prevNode = head;
		Node node = head.getNextNode();

		while (node.getNextNode() != null) {
			prevNode = node;
			node = node.getNextNode();
		}

		if (prevNode == head) {
			head = null;
		}
		prevNode.setNextNode(null);
		node = null;
	}

	public void deleteElementAtGivenPosition(int position) {
		if (position == 0) {
			deleteElementAtBeginning();
			return;
		} else if (position == (listLength() - 1)) {
			deleteElemnetAtEnd();
			return;
		} else if (position >= listLength()) {
			System.out.println("Out of bounds");
			return;
		} else {
			Node prevNode = head;
			Node node = head.getNextNode();
			int count = 1;
			while (count < position) {
				prevNode = node;
				node = node.getNextNode();
				count++;
			}

			prevNode.setNextNode(node.getNextNode());
			node = null;
		}
	}

	/*
	 * The complexity of finding the list length is : 0(n) As we have to loop
	 * through the entire list to find it out.
	 */
	public int listLength() {
		Node node = head;
		int length = 0;
		while (node != null) {
			length++;
			node = node.getNextNode();
		}

		System.out.println("\nSize of linked list : " + length);
		return length;
	}

	public void clearList() {
		head = null;
	}
}
