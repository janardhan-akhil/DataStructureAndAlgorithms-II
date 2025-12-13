package stack;

class StackUnderFlowException1 extends Exception {
	public StackUnderFlowException1() {
		super("Stack is empty");
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class StackByLinkedList {
	Node top;
	int size;

	public StackByLinkedList() {
		this.size = 0;
	}

	void print() {
		Node curr = top;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	void push(int element) {
		Node temp = new Node(element);
		temp.next = top;
		top = temp;
		size++;

	}

	int pop() throws StackUnderFlowException1 {
		if (top == null) {
			throw new StackUnderFlowException1();
		}
		int ele = top.data;
		top = top.next;
		size--;
		return ele;

	}

	int size() {
		return size;
	}

	int peek() {
		return top.data;
	}

	boolean isEmpty() {
		return top == null;
	}
}

public class StackUsingLinkedList {

	public static boolean validParenthesis(String s) throws StackUnderFlowException1 {
		StackByLinkedList stack = new StackByLinkedList();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (stack.size() > 0 && (c == ')' && stack.peek() == '(') || c == ']' && stack.peek() == '['
					|| c == '}' && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.size() == 0;
	}

	static void closestSmallest(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int x = -1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					x = arr[j];
					break;
				}
			}
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) throws Exception {
		StackByLinkedList st = new StackByLinkedList();
//		System.out.println(st.size());
//		System.out.println(st.isEmpty());
//		st.push(10);
//		st.push(20);
//		st.push(30);
//		st.push(40);
//		st.push(50);
//		st.print();
//		st.pop();
//		st.pop();
//		System.out.println(st.size());
//		System.out.println(st.peek());
//		System.out.println(st.isEmpty());

//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
		// System.out.println(validParenthesis(s));

		int[] arr = { 5, 7, 3, 12, 9 };
		closestSmallest(arr);

	}

}
