package Leetcode.wordpatterns;

public class MergeListNode {
    public static void main(String[] args) {
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//       ListNode listNode = mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
//                new ListNode(1, new ListNode(3, new ListNode(4))));
        ListNode listNode2 = mergeTwoLists(new ListNode(), new ListNode());
        pintListVoid(listNode2);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            if(list1 == null && list2 == null)
                return null;
            else if (list1 != null) {
                return list1;
            }else
                return list2;
        }
        if (list1.val == 0 && list2.val == 0) {
            return new ListNode();
        }
        if (list1.next == null && list2.next == null) {
            return list1.val > list2.val
                    ? new ListNode(list2.val)
                    : new ListNode(list1.val, new ListNode(list2.val));
        }
        if (list1.val <= list2.val) {
            return list1.next == null
                    ? new ListNode(list1.val, mergeTwoLists(list2, list2.next))
                    : new ListNode(list1.val, mergeTwoLists(list1.next, list2));

        } else {
            return list2.next == null
                    ? new ListNode(list2.val, mergeTwoLists(list1.next, list1))
                    : new ListNode(list2.val, mergeTwoLists(list2.next, list1));
        }

    }

    public static void pintListVoid(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}


