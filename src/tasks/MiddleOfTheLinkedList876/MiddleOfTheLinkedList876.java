package tasks.MiddleOfTheLinkedList876;

import tasks.PalindromeLinkedList234.ListNode;

public class MiddleOfTheLinkedList876 {

    public ListNode middleNode(ListNode head) {
        if (head.next == null)  {
            return head;
        }
        ListNode fast = head.next.next;
        head = head.next;
        while (fast != null && fast.next != null) {
            head = head.next;
            fast = fast.next.next;
        }
        return head;
    }
}
