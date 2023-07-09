package AlgoCourse2022.TreeSearch;

public class TreeTest2 {
    public static void main(String[] args) {
        CustomStack<Integer> customStack = new CustomStack<>();
        for (int i = 0; i < 10; i++) {
            customStack.push(i);
            System.out.println("Added - " + i);
        }
        while (!customStack.isEmpty()){
            int i = customStack.pop();
            System.out.println("Getting - " + i);
        }
    }

}
class Node<T,N>{
    T key;
    N value;
    Node<T,N> left, right;

    public Node(T key, N value) {
        this.key = key;
        this.value = value;
    }
//    N get(T k) {
//        Node<T, N> x = root;
//        while (x != null) {
//            int cmp = k.compareTo(x.key);
//            if (cmp == 0) {
//                return x.value;
//            }
//            if (cmp < 0) {
//                x = x.left;
//            } else {
//                x = x.right;
//            }
//        }
//        return null;
//    }
}
