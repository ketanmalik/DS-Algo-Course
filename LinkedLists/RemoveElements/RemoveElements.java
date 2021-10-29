package RemoveElements;

import ListNode.ListNode;

public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;

        while(current != null && current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        if(head != null && head.val == val) head = head.next;
        return head;
    }
}
