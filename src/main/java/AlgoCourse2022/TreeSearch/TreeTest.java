package AlgoCourse2022.TreeSearch;

public class TreeTest {
    public static void main(String[] args) {
        Tree root =
                new Tree(20,
                        new Tree(7, new Tree(4, null, new Tree(9)), new Tree(9)),
                        new Tree(35, new Tree(31, new Tree(28), null), new Tree(40, new Tree(38), new Tree(52))));
        //вычислить сумму чисел во всех узлах
        System.out.println("Сумма равна - " + root.sum());
        System.out.println("Сумма 2 равна - " + getSum(root));
    }
    public static int getSum(Tree root){
        CustomStack<Tree> customStack = new CustomStack<>();
        customStack.push(root);
        int sum = 0;
        while (!customStack.isEmpty()){
            Tree node = customStack.pop();
            sum += node.value;
            if(node.left != null)
                customStack.push(node.left);
            if(node.right != null)
                customStack.push(node.right);
        }
        return sum;
    }

}

class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }
    public int sum(){
        int sum = value;
        if(left != null){
            sum += left.sum();
        }
        if(right != null){
            sum += right.sum();
        }
        return sum;
    }

}
