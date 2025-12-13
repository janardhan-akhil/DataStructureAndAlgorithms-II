package linkedList;
import java.util.*;

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int val) {
        this.val = val;
    }
}

public class MergeTwoLists {

    public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 dummy = new ListNode1(0);
        ListNode1 tail = dummy;

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

        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return dummy.next;
    }

    // 🔹 Helper method to build a linked list from input array
    public static ListNode1 createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode1 head = new ListNode1(arr[0]);
        ListNode1 curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode1(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // 🔹 Helper method to print a linked list
    public static void printList(ListNode1 head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // 🔹 Main method to accept inputs
    public static void main(String[] args) {

        ListNode1 list1 = createList(new int[] {1,2,3});
        ListNode1 list2 = createList(new int[] {4,5,6});

        ListNode1 merged = mergeTwoLists(list1, list2);

        System.out.print("Merged Linked List: ");
        printList(merged);
    }
}
