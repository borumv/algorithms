package AlgoCourse2022.TreeSearch;

import java.util.Arrays;

public class ManagerOfMemory {
    public static void main(String[] args) {
//        int[][][] memory = createMemory();
        Memory memory = new Memory(10);
        for (int i = 0; i < memory.getMemory().length; i++) {
            System.out.println(Arrays.toString(memory.getMemory()[i]));
            memory.newNode();
            System.out.println("free index - " + memory.getIndexFreeElement());
        }
        memory.delNode(4);
    }

    private static int[][][] createMemory() {
        int[][][] memory = new int[][][]{{{0, 1}, {1, 1, 1}, {0}}};
        return memory;
    }
}
