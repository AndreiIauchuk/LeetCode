import tasks.PalindromeLinkedList234.ListNode;
import tasks.PalindromeLinkedList234.PalindromeLinkedList234;

public class Main {

    public static void main(String[] args) {
        ListNode forthNode = createNode(2, null);
        ListNode thirdNode = createNode(2, forthNode);
        ListNode secondNode = createNode(1, thirdNode);
        ListNode head = createNode(2, secondNode);
        System.out.println("Is palindrome? Answer: " + new PalindromeLinkedList234().isPalindrome(head));
    }

    private static ListNode createNode(int val, ListNode next) {
        return new ListNode(val, next);
    }
}