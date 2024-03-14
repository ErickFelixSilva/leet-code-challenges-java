package felix.silva.linkedlist;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode add(ListNode next) {
        this.next = next;
        return this.next;
    }

    public ListNode add(Integer nextVal) {
        this.next = new ListNode(nextVal);
        return this.next;
    }

    public String toString() {
        return this.next != null ? String.format("%s - %s", this.val, this.next) : String.format("%s", this.val);
    }
}