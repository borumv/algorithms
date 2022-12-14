package Wolf;

import java.util.List;
import java.util.Set;

public class StateRegulatorImpl implements StateRegulator{
    @Override
    public boolean checkValid(Set<Animal> animals, List<Set<Animal>> validation_list) {
        return validation_list.contains(animals);
    }

    @Override
    public Animal whoEnemy(Set<Animal> listAnimals, Animal candidate) {

        return listAnimals.stream()
                .filter(item -> (item.getVictims().contains(candidate.getClass()) || item.getFeeders().contains(candidate.getClass())))
                .findFirst()
                .get();
    }
}
