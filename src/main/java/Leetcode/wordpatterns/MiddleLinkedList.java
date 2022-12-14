package Leetcode.wordpatterns;

public class MiddleLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5, new ListNode(6))))));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(6,
                new ListNode(9)))));
        ListNode listNode1 = middleNode(listNode);

//        printListVoid(listNode1);
//        System.out.println();
//        System.out.println("-------------");
//        printListVoid(middleNode(listNode2));
//        System.out.println();
//        System.out.println("-------------");
        printListVoid(middleNodeSecond(listNode));


    }

    public static ListNode middleNode(ListNode head) {
        double point = 1;
        double count = 0;
        ListNode result = null;
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (count / 2 > point) {
                if (count % 2 == 0) {
                    result = current;
                } else {
                    result = prev;
                }
                point++;
            }
            count++;
            prev = current;
            current = current.next;
        }

        return result;
    }

    public static void printListVoid(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }
    public static int countListNoe(ListNode listNode) {
        int count = 0;
        while (listNode != null) {
            count++;
            listNode = listNode.next;
        }
        return count;
    }

    public static ListNode middleNodeSecond(ListNode head) {
        int step = 0;
        int count = countListNoe(head);
        ListNode result = null;
        ListNode current = head;
        while (count / 2 > step) {
            step++;
            current = current.next;
        }
        result = current;
        return result;
    }


}
