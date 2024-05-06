package felix.silva.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.lang.Math.max;


public class RemoveGreaterNodesToRight {
    public ListNode removeNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();

        var node = head;
        while (node != null) {
            values.add(node.val);
            node = node.next;
        }

        values = values.reversed();
        Iterator<Integer> iterator = values.iterator();
        var maxValue = 0;
        while (iterator.hasNext()) {
            Integer actualValue = iterator.next();
            if (actualValue < maxValue) {
                iterator.remove();
            }
            maxValue = max(maxValue, actualValue);
        }

        values = values.reversed();
        head = new ListNode(values.getFirst());
        node = head;
        for (int i = 1; i < values.size(); i++) {
            node.next = new ListNode(values.get(i));
            node = node.next;
        }

        return head;
    }
}
