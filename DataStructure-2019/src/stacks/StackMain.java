package stacks;

public class StackMain {
	public static void main(String[] args) {
		StacksWithDynamicArray stack = new StacksWithDynamicArray();
		stack.push(10);
		stack.push(3);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		System.out.println(stack.top());
	}
}
