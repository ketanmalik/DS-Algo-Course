package CheckPalindrome;

import ListNode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class CheckPalindrome {

    // O(n) time & O(1) space
    public boolean isPalindromeEfficient(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        slow = reverse(slow);

        while(slow != null) {
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    // Helper function to reverse the linked list
    public ListNode reverse(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;

        while(head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    // O(n) time & O(n) space
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        int left = 0, right = list.size() - 1;
        while(left < right) {
            if(list.get(left++) != list.get(right--)) return false;
        }
        return true;
    }
}
