package stack;

import java.util.ArrayList;

class StackUnderFlowException extends Exception {
	public StackUnderFlowException() {
		super("Stack is empty");
	}
}

class Stack {
	ArrayList al;
	int top;

	Stack() {
		this.al = new ArrayList<Integer>();
		this.top = -1;
	}

	void push(int element) {
		this.al.add(element);
	}

	int pop() throws StackUnderFlowException {
		if (al.size() == 0) {
			throw new StackUnderFlowException();
		}
		int lastIndex = al.size() - 1;
		int lastElement = (int) al.get(lastIndex);
		al.remove(lastIndex);
		return lastElement;
	}
}

public class StackUsingArrayList {

	public static void main(String[] args) throws StackUnderFlowException {
		Stack myStack = new Stack();
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		//System.out.println(myStack.pop());

	}

}
