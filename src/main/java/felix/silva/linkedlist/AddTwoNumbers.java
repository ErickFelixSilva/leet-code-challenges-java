package felix.silva.linkedlist;

/*
 * Code challenge link:
 * https://leetcode.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode actualNode = resultNode;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int totalSum = (l1 != null ? l1.val : 0) +
                    (l2 != null ? l2.val : 0) +
                    carry;
            carry = totalSum / 10;
            actualNode.next = new ListNode(totalSum % 10);
            actualNode = actualNode.next;

            l2 = (l2 != null ? l2.next : null);
            l1 = (l1 != null ? l1.next : null);
        }

        if (carry > 0) {
            actualNode.next = new ListNode(carry);
        }

        return resultNode.next;
    }
}