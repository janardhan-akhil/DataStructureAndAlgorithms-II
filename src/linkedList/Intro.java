package linkedList;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	void printLinkedList() {
		Node cur = this.head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	void add(int e) {
		Node temp = new Node(e);
		if (head == null) {
			head = temp;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}

	void addfirst(int e) {
		Node temp = new Node(e);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}

	void addLast(int e) {
		Node temp = new Node(e);
		if (head == null) {
			head = temp;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}

	void add(int index, int element) throws IndexOutOfBoundsException {
		try {
			if (index == 0) {
				add(element);
			} else {
				Node temp = new Node(element);
				Node curr = this.head;
				int count = 0;
				while (count < index - 1) {
					curr = curr.next;
					count++;
				}

				temp.next = curr.next;
				curr.next = temp;
			}
		} catch (NullPointerException e) {
			throw new IndexOutOfBoundsException();
		}
	}

	void addAll(int[] arr) {
		for (int n : arr) {
			add(n);
		}
	}

	void removeFirst() {

		if (head == null) {

		} else if (head.next == null) {
			head = null;
		} else if (head.next != null) {

			Node curr = this.head;
			head = head.next;
			curr.next = null;
		}

	}

	void removeLast() {

		if (head == null) {
		} else if (head.next == null) {
			head = null;
		} else if (head.next != null) {
			Node curr = this.head;
			while (curr.next.next != null) {
				curr = curr.next;
			}
			curr.next = null;
		}
	}

	int indexOf(int element) {

		int index = 0;
		if (head == null) {
			return -1;
		}
		Node curr = this.head;
		while (curr != null) {
			if (curr.data == element) {
				return index;
			} else {
				curr = curr.next;
				index++;
			}
		}
		return -1;

	}

	int size() {
		int count = 0;
		if (head == null) {
			return -1;
		}
		Node curr = this.head;
		while (curr != null) {
			curr = curr.next;
			count++;
		}

		return count;
	}

	int lastIndexOfElement(int ele) {
		int count = 0;
		int index = -1;

		Node curr = this.head;
		while (curr != null) {
			if (curr.data == ele) {
				index = count;
			}
			curr = curr.next;
			count++;
		}

		return index;
	}

	void sortedLinkedList(int element) {
		Node temp = new Node(element);
		Node curr = head;
		if (head == null) {
			head = temp;
		} else if (temp.data < head.data) {
			temp.next = head;
			head = temp;
		} else {
			while (curr.next != null && curr.next.data < temp.data) {
				curr = curr.next;
			}
			temp.next = curr.next;
			curr.next = temp;
		}
	}

}

public class Intro {
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		ll.add(40);
//		ll.add(50);
//		ll.addfirst(5);
//		ll.addLast(60);
//		ll.addLast(70);
//		ll.add(5, 35);

		int[] arr1 = { 10, 20, 30, 40, 40, 50 };
		// int[] arr2 = {1,3,4};
		ll.addAll(arr1);
		// ll.removeFirst();
		// ll.removeLast();
		// System.out.println(ll.indexOf(10));
		// System.out.println(ll.size());
		// System.out.println(ll.lastIndexOfElement(40));
		ll.printLinkedList();

		ll.sortedLinkedList(95);
		ll.printLinkedList();

	}

}
