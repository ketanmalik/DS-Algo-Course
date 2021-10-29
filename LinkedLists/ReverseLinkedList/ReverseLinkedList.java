package ReverseLinkedList;

import ListNode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

    // Recursive Approach
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        return reverseListRec(head.next, new ListNode(head.val));
    }

    // Recursive Function Implementation
    public ListNode reverseListRec(ListNode head, ListNode newHead) {
        if(head == null) return newHead;
        ListNode temp = new ListNode(head.val, newHead);
        newHead = temp;
        return reverseListRec(head.next, newHead);
    }

    // O(N) time & O(N) space
    public ListNode reverseListIterative(ListNode head) {
        if(head == null) return head;
        ListNode newHead = new ListNode(head.val);

        head = head.next;
        while(head != null) {
            ListNode temp = new ListNode(head.val, newHead);
            newHead = temp;
            head = head.next;
        }
        return newHead;
    }

    // O(N) time & O(N) space
    public ListNode reverseListBruteForce(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        ListNode newHead = new ListNode();
        ListNode curr = newHead;
        for(int i = list.size() - 1; i >= 0; i--) {
            int val = list.get(i);
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return newHead.next;
    }
}
