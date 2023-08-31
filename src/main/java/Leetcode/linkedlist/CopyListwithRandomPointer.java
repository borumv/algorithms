package Leetcode.linkedlist;

import java.util.*;

/*
* https://leetcode.com/problems/copy-list-with-random-pointer/?envType=study-plan-v2&envId=top-interview-150
* ��������� ������ ����� n ��� ����� �������, ��� ������ ���� �������� �������������� ��������� ���������, ������� ����� ��������� �� ����� ���� � ������ ��� ����.
* �������� �������� ����� ������. �������� ����� ������ �������� ����� �� n ���������� ����� �����, ��� ������ ����� ���� ����� ��������,
* ������ �������� ���������������� ��������� ����. ��� ���������, ��� � ��������� ��������� ����� ����� ������ ��������� �� ����� ���� � ������������� ������,
* ����� ��������� � �������� ������ � ������������� ������ ������������ ���� � �� �� ��������� ������. �� ���� �� ���������� � ����� ������
* �� ������ ��������� �� ���� � �������� ������.
*
* ��������, ���� � �������� ������ ���� ��� ������� X � Y, ��� X.random --> Y, �� ��� ��������������� ���� ������ x � y � ������������� ������ x.random --> y.
* ������� ��������� �������������� ���������� ������.
* ������� ������ �������������� �� �����/������ � ���� ������ �� n �����. ������ ���� ����������� ����� [val, random_index], ���:
*      val: ����� �����, �������������� Node.val
*      random_index: ������ ���� (�������� �� 0 �� n-1), �� ������� ��������� ��������� ���������, ��� ����, ���� �� �� ��������� �� �� ����� ����.
* ������ ���� ����� ������������ ������ ��������� ��������� ���������� ������.
* * */
public class CopyListwithRandomPointer {

    public Node copyRandomList(Node head) {
//        1. Iterate the original list and duplicate each node. The duplicate
//        of each node follows its original immediately.
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            currentNode.next = new Node(currentNode.val);
            currentNode.next.next = next;
            currentNode = next;
        }
//        2. Iterate the new list and assign the random pointer for each
//        duplicated node.
        currentNode = head;
        while (currentNode != null){
            if(currentNode.random != null){
                currentNode.next.random = currentNode.random.next;
            }
            currentNode = currentNode.next.next;
        }
//        3. Restore the original list and extract the duplicated nodes.

        Node resultNode = head.next;
        while (resultNode.next != null){
            resultNode.next = resultNode.next.next;
            resultNode = resultNode.next;

        }

        return resultNode;
    }


    static class Node {

        int val;
        Node next;
        Node random;

        public Node(int val) {

            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
