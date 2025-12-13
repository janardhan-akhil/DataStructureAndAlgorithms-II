package circularLinkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class CircilarList {
	Node head;
	Node tail;

	void print() {
		if (head != null) {
			Node curr = head;
			do {
				System.out.print(curr.data + " ");
				curr = curr.next;
			} while (curr != head);

		}
		System.out.println();
	}

//	void add(int element) {
//		Node temp = new Node(element);
//		Node curr = head;
//		if (head == null) {
//			head = temp;
//			head.next = head;
//		} else {
//			while (curr.next != head) {
//				curr = curr.next;
//			}
//			curr.next = temp;
//			temp.next = head;
//		}
//
//	}

	void addLastEfficient(int element) {
		 Node newNode = new Node(element);

	        if (head == null) {
	            // Empty list → first node becomes both head and tail
	            head = newNode;
	            tail = newNode;
	            newNode.next = head; // circular link
	        } else {
	            // Non-empty list
	            tail.next = newNode;  // old tail points to new node
	            newNode.next = head;  // new node points to head (circular)
	            tail = newNode;       // update tail reference
	        }

	}

	void addFirst(int element) {
		Node temp = new Node(element);
		Node curr = head;
		if (head == null) {
			head = temp;
			head.next = head;
		} else {
			while (curr.next != head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
			head = temp;
		}
	}

	void addFirstEfficient(int element) {
		Node temp = new Node(element);
		if (head == null) {
			head = temp;
			head.next = head;
		} else {
			temp.next = head.next;
			head.next = temp;

			int n = head.data;
			head.data = temp.data;
			temp.data = n;
		}

	}
	
	void removeFirst() {
		if(head == null) {
		}
		else if(head.next == head) {
			head = null;
		}else {
			int n = head.data;
			head.data = head.next.data;
			head.next.data = n;
			head.next = head.next.next;
		}
	}
	void removeLast() {
		Node curr = head;
		if(head == null) {
		}
		else if(head.next == head) {
			head = null;
		}else {
			while(curr.next.next != head) {
				curr = curr.next;
			}
			curr.next = head;
		}
	}
}

public class CircularLinkedList {

	public static void main(String[] args) {
		CircilarList cll = new CircilarList();

//		cll.head = new Node(10);
//		cll.head.next = new Node(20);
//		cll.head.next.next = new Node(30);
//		cll.head.next.next.next = new Node(40);
//		cll.head.next.next.next.next = cll.head;
		cll.addLastEfficient(10);
		cll.addLastEfficient(20);
		cll.addLastEfficient(30);
		cll.addLastEfficient(40);
		cll.addLastEfficient(50);
		cll.addLastEfficient(60);
		cll.print();
//		cll.addFirst(5);
//		cll.print();
//		cll.addFirstEfficient(5);
//		cll.print();
//		cll.addLastEfficient(65);
//		cll.print();
//		cll.removeFirst();
//		cll.print();
		cll.removeLast();
		cll.print();

	}

}
