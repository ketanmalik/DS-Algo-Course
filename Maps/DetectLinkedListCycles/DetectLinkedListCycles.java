/* LC 141 - Linked List Cycle */

package DetectLinkedListCycles;

import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectLinkedListCycles {

    // O(n) time & O(1) space
    public boolean hasCycleUsingFloyd(ListNode head) {
        ListNode slowPtr = head, fastPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) return true;
        }
        return false;
    }

    // O(n) time & space
    public boolean hasCycle(ListNode head) {
        Map<Integer, ListNode> hmap = new HashMap<>();
        while(head != null) {
            if(hmap.containsKey(head.val) && (head == hmap.get(head.val))) {
                return true;
            };
            hmap.put(head.val, head);
            head = head.next;
        }
        return false;
    }
}
