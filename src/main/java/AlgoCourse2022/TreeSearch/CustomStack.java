package AlgoCourse2022.TreeSearch;

import java.util.ArrayList;

public class CustomStack<T> implements StackTree<T> {
    private final ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T t) {
        stack.add(t);
    }

    @Override
    public T pop() {
        return stack.remove(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}