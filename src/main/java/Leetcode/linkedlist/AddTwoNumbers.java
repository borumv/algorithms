package Leetcode.linkedlist;
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int remnant = 0;
        ListNode outuput = new ListNode();
        ListNode curr = outuput;
        while (l1.next != null) {
            curr.val = ( l1.val + l2.val + remnant ) / 10;
            remnant = ( l1.val + l2.val + remnant ) % 10;
            curr = curr.next = new ListNode();
            l1 = l1.next;
            l2 = l2.next;
        }
        return outuput;
    }

    static public class ListNode {

        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {

            this.val = val;
        }

        ListNode(int val, ListNode next) {

            this.val = val;
            this.next = next;
        }
    }
}
