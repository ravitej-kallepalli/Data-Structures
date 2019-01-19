package stacks;

public class Stack {
	
	int capactiy = 5;
	int top;
	int[] stackArray;
	
	public Stack() {
		stackArray = new int[capactiy];
		top = -1;
	}
	
	public void push(int data) {
		if(isStackFull()) {
			System.out.println("Stack overflow");
		}else {
			top++;
			stackArray[top] = data;
		}
	}
	
	public int  pop() {
		if(isEmpty()) {
			return -1;
		}else {
			top--;
			return stackArray[top+1];
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
		return capactiy == top +1 ;
	}
}
