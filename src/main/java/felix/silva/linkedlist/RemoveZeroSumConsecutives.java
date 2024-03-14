package felix.silva.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class RemoveZeroSumConsecutives {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> uniqueSums = new HashMap<>();
        int sum = 0;

        ListNode currentNode = head;
        while (currentNode != null) {
            sum += currentNode.val;

            if (sum == 0) {
                head = currentNode.next;
                currentNode = head;
                uniqueSums = new HashMap<>();
                continue;
            } else if (uniqueSums.containsKey(sum)) {
                uniqueSums.get(sum).next = currentNode.next;
                currentNode = head;
                uniqueSums = new HashMap<>();
                sum = 0;
                continue;
            } else {
                uniqueSums.put(sum, currentNode);
            }

            currentNode = currentNode.next;
        }
        return head;
    }
}
