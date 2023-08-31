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
     *     Здесь происходит изменение указателя next у текущего узла и его следующего узла. В момент, когда метод достигает этой строки кода,
     *     он работает с двумя узлами: head (текущий узел) и head.next (следующий узел).
     *
     *     Данная строка выполняет следующее действие: она устанавливает указатель next для узла, следующего за head.next, таким образом,
     *     он теперь будет указывать на узел head. Это происходит как часть процесса переворачивания списка. Теперь, когда указатель next
     *     у следующего узла указывает на текущий узел, создается обратная связь, что позволяет перевернуть направление следования узлов.
     *
     *     head.next = null;:
     *     Эта строка кода обнуляет указатель next у текущего узла head, что необходимо для корректного завершения процесса переворачивания списка.
     *     После того как узлы были перестроены в обратном порядке, последний узел (бывший первым) должен указывать на null,
     *     чтобы завершить переворачивание и избежать циклической ссылки.
     *
     * Совместное действие этих двух строк позволяет перевернуть связанный список.
     */

}
