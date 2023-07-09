package trash.Wolf;

import java.util.List;
import java.util.Set;

public interface StateRegulator {

    boolean checkValid(Set<Animal> animals, List<Set<Animal>> validation_list);
    Animal whoEnemy(Set<Animal> listAnimals, Animal candidate);

}
