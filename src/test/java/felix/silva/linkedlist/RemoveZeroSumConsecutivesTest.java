package felix.silva.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveZeroSumConsecutivesTest {

    @Test
    public void testSolution() {
        RemoveZeroSumConsecutives solution = new RemoveZeroSumConsecutives();
        ListNode answer = null;
        ListNode listNode = new ListNode(1);
//        listNode.add(2).add(-3).add(3).add(1);
//        answer = solution.removeZeroSumSublists(listNode);
//        Utils.compareResults(String.valueOf(answer), "3 - 1");
//
//        listNode = new ListNode(1);
//        listNode.add(2).add(3).add(-3).add(-2);
//        answer = solution.removeZeroSumSublists(listNode);
//        Utils.compareResults(String.valueOf(answer), "1");
//
//        listNode = new ListNode(1);
//        listNode.add(2).add(3).add(-3).add(4);
//        answer = solution.removeZeroSumSublists(listNode);
//        Utils.compareResults(String.valueOf(answer), "1 - 2 - 4");
//
//        listNode = new ListNode(1);
//        listNode.add(-1);
//        answer = solution.removeZeroSumSublists(listNode);
//        Utils.compareResults(String.valueOf(answer), "[]");
//
//        listNode = new ListNode(5);
//        listNode.add(-3).add(-4).add(1).add(6).add(-2).add(-5);
//        answer = solution.removeZeroSumSublists(listNode);
//        Utils.compareResults(String.valueOf(answer), "5 -2 -5");
//
//        listNode = new ListNode(1);
//        listNode.add(3).add(2).add(-3).add(-2).add(5).add(5).add(-5).add(1);
//        answer = solution.removeZeroSumSublists(listNode);
//        Utils.compareResults(String.valueOf(answer), "1 - 5 - 1");

        listNode = new ListNode(1);
        listNode.add(0).add(2).add(-3);
        answer = solution.removeZeroSumSublists(listNode);
        assertEquals(answer, null);
    }
}
