package felix.silva.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {
    AddTwoNumbers solution = new AddTwoNumbers();

    @Test
    public void testSolution() {
        ListNode listNode = new ListNode(2);
        listNode.add(4).add(3);
        ListNode listNode2 = new ListNode(5);
        listNode2.add(6).add(4);
        var answer = solution.addTwoNumbers(listNode, listNode2);
        var correctAnswer = new ListNode(7);
        correctAnswer.add(0).add(8);
        assertEquals(correctAnswer, answer);
    }

    @Test
    public void testSolution_1() {
        ListNode listNode = new ListNode(0);
        ListNode listNode2 = new ListNode(0);
        var answer = solution.addTwoNumbers(listNode, listNode2);
        var correctAnswer = new ListNode(0);
        assertEquals(correctAnswer, answer);
    }

    @Test
    public void testSolution_2() {
        ListNode listNode = new ListNode(9);
        listNode.add(9).add(9).add(9).add(9).add(9).add(9);
        ListNode listNode2 = new ListNode(9);
        listNode2.add(9).add(9).add(9);
        var answer = solution.addTwoNumbers(listNode, listNode2);
        var correctAnswer = new ListNode(8);
        correctAnswer.add(9).add(9).add(9).add(0).add(0).add(0).add(1);
        assertEquals(correctAnswer, answer);
    }

    @Test
    public void testSolution_3() {
        ListNode listNode = new ListNode(2);
        listNode.add(4).add(9);
        ListNode listNode2 = new ListNode(5);
        listNode2.add(6).add(4).add(9);
        var answer = solution.addTwoNumbers(listNode, listNode2);
        var correctAnswer = new ListNode(7);
        correctAnswer.add(0).add(4).add(0).add(1);
        assertEquals(correctAnswer, answer);
    }
}
