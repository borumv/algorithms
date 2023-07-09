package AlgoCourse2022.TreeSearch;

import java.util.List;

public interface StackTree<T> {
    void push(T t);
    T pop();
    boolean isEmpty();
}
