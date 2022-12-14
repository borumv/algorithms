package Wolf;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Animal> firstBank = new HashSet();
        firstBank.add(new Goat());
        firstBank.add(new Wolf());
        firstBank.add(new Cabbage());
        firstBank.add(new Green());
        firstBank.add(new Elephant());
        HashMap<Integer, List<Set<Animal>>> variants = getStates(firstBank);
        findSolutions(firstBank, variants, new Lodka(new StateRegulatorImpl()));

    }

    private static HashMap<Integer, List<Set<Animal>>> getStates(Set<Animal> firstBank) {

        int count = firstBank.size();
        HashMap<Integer, List<Set<Animal>>> variants = new HashMap<>();
        List<Set<Animal>> animals = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>(firstBank);
        animals.add(firstBank);
        variants.put(firstBank.size(), animals);

        for (int mask = 0; mask < (1 << count); mask++) {
            List<Animal> state = new ArrayList();
            for (int j = 0; j < count; j++) {
                if((mask & (1<<j)) != 0){
                    state.add(animalList.get(j));
                }
            }
            if(!haveEnemy(state)){
                var variant = variants.get(state.size());
                List<Set<Animal>> list = variant != null ? variant : new ArrayList<>();
                list.add(Set.copyOf(state));
                variants.put(state.size(), list);
            }

        }
        return variants;
    }

    private static boolean haveEnemy(List<Animal> state) {
        for (int i = 0; i < state.size() - 1; i++) {
            for (int j = i + 1; j < state.size() ; j++) {
                if(state.get(j).getFeeders().contains(state.get(i).getClass()) || state.get(j).getVictims().contains(state.get(i).getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void findSolutions(Set<Animal> firstBank, HashMap<Integer, List<Set<Animal>>> variants, Lodka lodka) {
        Set<Animal> leftBank = firstBank;
        Set<Animal> rightBank = new HashSet<>();
        printSolutions(lodka, variants, leftBank, rightBank);
    }

    private static void printSolutions(Lodka lodka, HashMap<Integer, List<Set<Animal>>> variants, Set<Animal> leftBank, Set<Animal> rightBank) {
        int size = leftBank.size();
        Set<Animal> leftBankCopy = Set.copyOf(leftBank);
        while (!leftBankCopy.isEmpty() && rightBank.size() < size){
                leftBankCopy = lodka.swap(leftBankCopy, variants);
                if(lodka.getAnimal() != null) {
                    rightBank = lodka.swapTarget(rightBank, variants);
                }
        }
    }


}
