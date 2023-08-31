package Leetcode.linkedlist;

import java.util.*;

/*
* https://leetcode.com/problems/copy-list-with-random-pointer/?envType=study-plan-v2&envId=top-interview-150
* Связанный список длины n дан таким образом, что каждый узел содержит дополнительный случайный указатель, который может указывать на любой узел в списке или нуль.
* Создайте глубокую копию списка. Глубокая копия должна состоять ровно из n совершенно новых узлов, где каждый новый узел имеет значение,
* равное значению соответствующего исходного узла. Как следующий, так и случайный указатель новых узлов должны указывать на новые узлы в скопированном списке,
* чтобы указатели в исходном списке и скопированном списке представляли одно и то же состояние списка. Ни один из указателей в новом списке
* не должен указывать на узлы в исходном списке.
*
* Например, если в исходном списке есть две вершины X и Y, где X.random --> Y, то для соответствующих двух вершин x и y в скопированном списке x.random --> y.
* Вернуть заголовок скопированного связанного списка.
* Связный список представляется на вводе/выводе в виде списка из n узлов. Каждый узел представлен парой [val, random_index], где:
*      val: целое число, представляющее Node.val
*      random_index: индекс узла (диапазон от 0 до n-1), на который указывает случайный указатель, или нуль, если он не указывает ни на какой узел.
* Вашему коду будет предоставлен только заголовок исходного связанного списка.
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
