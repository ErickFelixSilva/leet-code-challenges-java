package felix.silva.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveGreaterNodesToRightTest {
    RemoveGreaterNodesToRight solution = new RemoveGreaterNodesToRight();
    @Test
    public void testSolution() {
        ListNode listNode = new ListNode(5);
        listNode.add(2).add(13).add(3).add(8);
        var answer = solution.removeNodes(listNode);
        assertEquals(answer, new ListNode(13, new ListNode(8)));
    }

    @Test
    public void testSolution1() {
        ListNode listNode = new ListNode(1);
        listNode.add(1).add(1).add(1);
        var answer = solution.removeNodes(listNode);
        assertEquals(answer, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1)))));
    }
}
