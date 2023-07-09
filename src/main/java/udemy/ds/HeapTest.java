package udemy.ds;
public class HeapTest {

    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();
        heap.push(4);
        heap.push(10);
        heap.push(40);
        heap.push(5);
        heap.push(1);
        heap.push(9);
        heap.push(5);
        heap.push( 6);
        heap.push(12);
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
    }

}
