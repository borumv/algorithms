package Leetcode.linkedlist;
import java.util.ArrayList;
import java.util.List;

public class RecursiveLInkedList {

    static String f = ":";
    static public class Node {

        public int item;
        public Node next;

        Node() {                 // this would be the default, put here for reference
            item = 0;
            next = null;
        }

        Node(int n) {

            item = n;
            next = null;
        }

        Node(int n, Node p) {

            item = n;
            next = p;
        }
    }

    ;

    static void recursiveTask(Node node) {

        if (node == null) {
            System.out.println("This is the end");
        } else {
            System.out.println("node -> " + node.item);
            recursiveTask(node.next);
        }
    }

    static void printList1(Node p) {

        if (p != null) {
            System.out.println(p.item);
            System.out.println(p.item);
            printList1(p.next);
        }
    }

    static void printList2(Node p) {

        if (p != null) {
            // System.out.println(p.item);
            printList2(p.next);
            System.out.println(p.item);
        }
    }

    static void printList3(Node p) {

        if (p != null) {
            System.out.println(p.item);
            printList3(p.next);
            printList3(p.next);
        }
    }

    static void printList4(Node p) {

        if (p != null) {
            printList4(p.next);
            System.out.println(p.item);
            printList4(p.next);
        }
    }

    static void printList5(Node p) {

        if (p != null) {
            printList5(p.next);
            printList5(p.next);
            System.out.println(p.item);
        }
    }
    int h = 5;

    public static void main(String[] args) {


        System.out.println(f);
        List<Object> list = new ArrayList<>();

        Object j = list;

        list.add(10L);
        System.out.println(((List<?>) j).get(0));
        System.out.println(list.get(0));

//        Node n = new Node(1, new Node(2, new Node(3, new Node(4))));
//        // recursiveTask(n);
//        // printList1(n);
//        // printList2(n);
//        // printList3(n);
//        // printList4(n);
//          printList5(n);
    }
}
