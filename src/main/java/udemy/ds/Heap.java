package udemy.ds;

import java.util.ArrayList;

import static java.util.Collections.swap;

/*
 * ’ип - это по сути структура данных, котора€ основана на бинарном дереве. ќсновное свойство заключаетс€ в том, что сыновь€ каждой вершины должны быть строго больше вершины
 * ƒл€ обеспечени€ лучшего доступа в случае добавлени€ (push) и извлечени€ (pop) мы храним эту структуру данных в массиве, где левый сын вершины имеете индекс parent*2,
 * а правый сын вершины имеет индекс parent*2 + 1.
 * ѕоэтому и ребЄнку очень легко узнать индекс родител€ путЄм целочисленного делени€ на 2.
 *
 *
 * */
public class Heap<T extends Comparable<T>> {

    ArrayList<T> heap = new ArrayList<>();

    public Heap() {

        heap.add(null);

    }

    void push(T item) {

        heap.add(item);
        int index = heap.size() - 1;
        while (index != 1 && heap.get(index).compareTo(heap.get(index / 2)) < 0) {
            swap(heap, index, index / 2);
            index /= 2;
        }
    }

    T pop() {

        swap(heap, 1, heap.size() - 1);
        T min = heap.get(heap.size() - 1);
        heap.remove(min);
        int size = heap.size();
        int index = 1;
        while (index * 2 < size && heap.get(index).compareTo(heap.get(index * 2)) > 0
                || ( index * 2 + 1 < size && heap.get(index).compareTo(heap.get(index * 2 + 1)) > 0 )) {
            if (index * 2 + 1 >= size
                    || heap.get(index * 2).compareTo(heap.get(index * 2 + 1)) < 0) {
                swap(heap, index, index * 2);
                index *= 2;
            } else {
                swap(heap, index, index * 2 + 1);
                index *= index * 2;
                index++;
            }
        }
        return min;
    }

    T top() {

        return heap.get(1);
    }

    boolean empty() {

        return heap.size() == 1;
    }

    int size() {

        return heap.size();
    }

}
