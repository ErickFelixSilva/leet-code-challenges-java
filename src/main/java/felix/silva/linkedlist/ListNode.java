package felix.silva.linkedlist;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }

    ListNode(@NotNull int[] vals) {
        this.val = vals[0];
        ListNode node = new ListNode(vals[1]);
        this.next = node;
        for (int i = 2; i < vals.length; i++) {
            node.next = new ListNode(vals[i]);
            node = node.next;
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}