package felix.silva.linkedlist;

import java.math.BigInteger;

public class DoubleNumberRepresentedAsLinkedList {
    public ListNode doubleIt(ListNode head) {
        StringBuilder number = new StringBuilder();
        var node = head;
        while (node != null) {
            number.append(node.val);
            node = node.next;
        }

        BigInteger doubleNumber = new BigInteger(number.toString()).multiply(BigInteger.valueOf(2));
        String strDouble = String.valueOf(doubleNumber);
        head = new ListNode(Character.getNumericValue(strDouble.charAt(0)));
        node = head;
        for (int i = 1; i < strDouble.length(); i++) {
            node.next = new ListNode(Character.getNumericValue(strDouble.charAt(i)));
            node = node.next;
        }

        return head;
    }
}
