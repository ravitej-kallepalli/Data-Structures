package stacks;

import java.util.Arrays;

public class StacksWithDynamicArray {
	int capacity;
	int top;
	int stackArray[];

	public StacksWithDynamicArray() {
		capacity = 1;
		top = -1;
		stackArray = new int[capacity];
	}

	public void push(int data) {
		if (isStackFull()) {
			doubleArray();
		}
		top++;
		stackArray[top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			top--;
			return stackArray[top + 1];
		}
	}

	public int top() {
		return stackArray[top];
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isStackFull() {
		return capacity == top + 1;
	}

	public void doubleArray() {
		int[] array = new int[capacity * 2];
		array = Arrays.copyOf(stackArray, capacity*2);
		stackArray = array;
		capacity = capacity * 2;
	}
}
