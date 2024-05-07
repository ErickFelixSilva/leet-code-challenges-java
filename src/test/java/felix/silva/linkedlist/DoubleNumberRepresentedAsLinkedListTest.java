package felix.silva.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleNumberRepresentedAsLinkedListTest {
    private final DoubleNumberRepresentedAsLinkedList solution = new DoubleNumberRepresentedAsLinkedList();


    @Test
    public void testSolution() {
        var head = new ListNode(1);
        head.add(8).add(9);
        var answer = solution.doubleIt(head);
        var expected = new ListNode(3, new ListNode(7, new ListNode(8)));
        assertEquals(expected, answer);
    }

    @Test
    public void testSolution1() {
        var head = new ListNode(9);
        head.add(9).add(9);
        var answer = solution.doubleIt(head);
        var expected = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(8))));
        assertEquals(expected, answer);
    }

    @Test
    public void testSolution2() {
        var head = new ListNode(new int[] {3,4,5,4,2,5,5,9,9,9});
        var answer = solution.doubleIt(head);
        var expected = new ListNode(new int[] {6,9,0,8,5,1,1,9,9,8});
        assertEquals(expected, answer);
    }
}
