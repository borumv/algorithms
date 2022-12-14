package TreeSearch;

public class Memory {

    int[][] memory;
    int indexFreeElement;

    public Memory(int sizeMemory) {
        setMemory(new int[sizeMemory][3]);
        for (int i = 0; i < sizeMemory; i++) {
            this.memory[i][0] = 0;
            this.memory[i][1] = i + 1;
            this.memory[i][2] = 0;
        }
    }

    public int newNode(){
        setIndexFreeElement(this.memory[indexFreeElement][1]);
        return this.indexFreeElement;
    }
    public void delNode(int index){
        this.memory[index][1] = getIndexFreeElement();
        setIndexFreeElement(index);
    }


    public int[][] getMemory() {
        return memory;
    }

    public int getIndexFreeElement() {
        return indexFreeElement;
    }

    public void setMemory(int[][] memory) {
        this.memory = memory;
    }

    public void setIndexFreeElement(int indexFreeElement) {
        this.indexFreeElement = indexFreeElement;
    }
}
