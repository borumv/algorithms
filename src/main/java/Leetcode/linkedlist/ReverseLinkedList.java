package Leetcode.linkedlist;
public class ReverseLinkedList {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        int index = 0;
        int count = right - left;
        ListNode copy = head;
        while (index++ != left){
            copy = copy.next;
        }
        ListNode copyNode = copy.next.next;
        copy.next = reverse(count,copy.next, copy.next.next);




        return copy;
    }
    public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  ListNode reverse(int count, ListNode node, ListNode nextNode){
        if (count == 0){
            nextNode.next = node;

            return nextNode;
        }
        count--;
      return reverse(count, node, nextNode);
  }

    ListNode reverse(ListNode head) {
        if (head.next == null) return head;
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    ListNode customReverse(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = customReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    /**
     *
     *     head.next.next = head;:
     *     ����� ���������� ��������� ��������� next � �������� ���� � ��� ���������� ����. � ������, ����� ����� ��������� ���� ������ ����,
     *     �� �������� � ����� ������: head (������� ����) � head.next (��������� ����).
     *
     *     ������ ������ ��������� ��������� ��������: ��� ������������� ��������� next ��� ����, ���������� �� head.next, ����� �������,
     *     �� ������ ����� ��������� �� ���� head. ��� ���������� ��� ����� �������� ��������������� ������. ������, ����� ��������� next
     *     � ���������� ���� ��������� �� ������� ����, ��������� �������� �����, ��� ��������� ����������� ����������� ���������� �����.
     *
     *     head.next = null;:
     *     ��� ������ ���� �������� ��������� next � �������� ���� head, ��� ���������� ��� ����������� ���������� �������� ��������������� ������.
     *     ����� ���� ��� ���� ���� ����������� � �������� �������, ��������� ���� (������ ������) ������ ��������� �� null,
     *     ����� ��������� ��������������� � �������� ����������� ������.
     *
     * ���������� �������� ���� ���� ����� ��������� ����������� ��������� ������.
     */

}
