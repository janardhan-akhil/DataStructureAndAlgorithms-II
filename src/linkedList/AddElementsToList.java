package linkedList;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class AddElementsToList {

	public static ListNode createList(int[] nums) {
		ListNode head = new ListNode(nums[0]);
		ListNode curr = head;
		if (nums.length == 0)
			return null;

		for (int i = 1; i < nums.length; i++) {
			curr.next = new ListNode(nums[i]);
			curr = curr.next;
		}
		return head;
	}

	public static void printLinkedList(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null)
				System.out.print("-> ");
			head = head.next;
		}
		System.out.println();

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		int carry = 0;
		while (l1 != null || l2 != null || carry != 0) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
		}
		return dummy.next;
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}

		if (list1 != null)
			tail.next = list1;
		if (list2 != null)
			tail.next = list2;

		return dummy.next;
	}

	static ListNode removeDuplicates(ListNode head) {
		ListNode curr = head;
		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return head;
	}

	static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode nextNode = curr.next; // store next node
			curr.next = prev; // reverse the link
			prev = curr; // move prev forward
			curr = nextNode; // move curr forward
		}

		return prev; // new head
	}

	public static void main(String[] args) {

		ListNode l1 = createList(new int[] { 9, 9, 9, 9, 9, 9, 9 });
		ListNode l2 = createList(new int[] { 9, 9, 9, 9 });
		ListNode l3 = createList(new int[] { 1, 1, 2, 3, 3 });

		// ListNode res = addTwoNumbers(l1, l2);
		// ListNode mergeTwoLists = mergeTwoLists(l1, l2);
		// printLinkedList(mergeTwoLists);
		// printLinkedList(res);
		// ListNode removeDuplicates = removeDuplicates(l3);
		// printLinkedList(removeDuplicates);
		
		ListNode reverseList = reverseList(l3);
		printLinkedList(reverseList);

	}

}
