/* Leetcode probem #83 */

package DeleteDuplicate;

import ListNode.ListNode;

public class DeleteDuplicate {

    // Using one pointer
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null) {
            if(current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // Using two pointers
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode current = head;
        ListNode forward = head;

        while(current != null) {
            boolean found = false;
            while(forward.next != null && forward.next.val == current.val) {
                found = true;
                forward = forward.next;
            }
            if(found) {
                current.next = forward.next;
                current = forward.next;
                forward.next = null;
                forward = current;
            } else {
                current = current.next;
                forward = forward.next;
            }
        }

        return head;
    }
}
