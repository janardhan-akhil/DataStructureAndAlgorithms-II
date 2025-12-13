package DoublyLinkedList;

class Node {
	int data;
	Node next;
	Node prev;

	Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class Solution {
	Node head;
	Node tail;

	void add(int element) {
		Node temp = new Node(element);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}

	void printListElements() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}

	void printListInReverse() {
		Node curr = tail;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.prev;
		}
	}

	void addFirst(int element) {
		Node temp = new Node(element);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
	}

	void addAtIndex(int index, int element) {
		int count = 0;
		Node curr = head;
		Node temp = new Node(element);

		while (count < index - 1) {
			if (curr != null) {
				count++;
				curr = curr.next;
			} else {
				return;
			}

		}
		curr.next.prev = temp;
		temp.next = curr.next;
		curr.next = temp;
		temp.prev = curr;
	}
	
	void addAll(int[] arr) {
//		Node head = new Node(arr[0]);
//		Node curr = head;
		for(int ele : arr) {
			add(ele);
		}
	}
	
	Node addAllElemetns(int[] arr) {
		Node head = new Node(arr[0]);
		Node curr = head;
		for(int i=1;i<arr.length;i++) {
			curr.next = new Node(arr[i]);
			curr = curr.next;
		}
		return head;
	}
	
	void removeFirst() {
		
		if(head == null) {
			
		}else if(head.next == null) {
			head = null;
			tail = null;
		}
		else if(head.next != null){
			Node curr = head;
			head = head.next;
			head.prev = null;
			curr.next = null;
			
		}
	}
	
	void removeLast() {
		
		if(tail == null) {
			
		}
		else if(tail.prev == null) {
			head = null;
			tail = null;
		}
		else if(tail.prev != null) {
			Node curr = tail;
			tail = tail.prev;
			tail.next = null;
			curr.prev = null;
			
		}
		
		
	}
	
	int indexOf(int element) {
		int index = 0;
		Node curr = head;
		if(head == null) {
			return -1;
		}
		while(curr != null) {
			if(curr.data == element) {
				return index;
			}else {
				index++;
				curr =curr.next;
			}
		}
		return -1;
	}
	
	int lastIndexOf(int element) {
		Node curr = head;
		int count = 0;
		int index = -1;
		while(curr != null) {
			if(curr.data == element) {
				index = count;
			}
			curr = curr.next;
			count++;
		}
		return index;
	}
	
	int size() {
		Node curr = head;
		int count=0;
		while(curr != null) {
			count++;
			curr = curr.next;
			
		}
		return count;
	}

}

public class DoublyLinkedList {

	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.add(10);
		sol.add(20);
		sol.add(30);
		sol.add(40);
		sol.add(40);
		sol.add(50);
		// sol.printListElements();
		// sol.printListInReverse();
		// sol.addFirst(5);
		//sol.addAtIndex(3, 35);
	//	sol.addAll(new int[] {1,2,3,4,5});
		//Node addAllElemetns = sol.addAllElemetns(new int[] {1,2,3,4,5});
		sol.printListElements();
//		sol.removeFirst();
//		sol.printListElements();
//		sol.removeLast();
//		sol.printListElements();
		System.out.println(sol.indexOf(40));
		System.out.println(sol.lastIndexOf(40));
		System.out.println(sol.size());

	}

}
