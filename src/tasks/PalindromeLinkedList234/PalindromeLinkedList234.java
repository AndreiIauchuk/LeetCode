package tasks.PalindromeLinkedList234;

public class PalindromeLinkedList234 {

    public boolean isPalindrome (final ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null) {
            slow = slow.next;
            if (fast.next.next == null) {
                fast = fast.next;
            } else {
                fast = fast.next.next;
            }
        }

        ListNode prev = slow;
        ListNode temp;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        slow = head;
        while (fast != null) {
            if(slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}
