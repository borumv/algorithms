package trash.Wolf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lodka {
    static int counter = 1;
    Animal sit_animal;

    Set<Animal> blackList;
    StateRegulator stateRegulator;

    public Lodka(StateRegulator stateRegulator) {
        this.stateRegulator = stateRegulator;
        this.blackList = new HashSet<>();
    }

    public Animal getAnimal() {
        return sit_animal;
    }

    public void setAnimal(Animal animal) {
        this.sit_animal = animal;
    }

    public Set<Animal> swap(Set<Animal> animals, HashMap<Integer, List<Set<Animal>>> valid) {
        Set<Animal> animals_copy = new HashSet<>(Set.copyOf(animals));
        Animal animal_copy = animals_copy.stream()
                .filter(item -> !blackList.contains(item))
                .findFirst()
                .get();
        if (this.sit_animal != null) {
            animals_copy.add(this.sit_animal);
            animals_copy.remove(animal_copy);
            this.setAnimal(animal_copy);
        } else {
            this.setAnimal(animal_copy);
            animals_copy.remove(animal_copy);
        }

        if (stateRegulator.checkValid(animals_copy, valid.get(animals_copy.size()))) {
            // this.sit_animal = null;

            System.out.println(counter++ + ".Сажаем " + animal_copy.getName() + " в лодку -> правый берег");
            this.blackList = new HashSet<>();
            return animals_copy;
        } else {
            System.out.println(counter++ + ".Пустая лодка -> левый берег");
            blackList.add(animal_copy);
            this.sit_animal = null;
            return animals;
        }
    }

    public Set<Animal> swapTarget(Set<Animal> animals, HashMap<Integer, List<Set<Animal>>> valid) {
        Set<Animal> animals_copy = new HashSet<>(Set.copyOf(animals));
        if (this.sit_animal != null) {
            animals.add(this.sit_animal);
        }

        if (stateRegulator.checkValid(animals, valid.get(animals.size()))) {
            System.out.println(counter++ + ".Высаживаем на правом берегу " + this.sit_animal.getName());
            this.sit_animal = null;
            return animals;
        } else {
            Animal enemy_animal = stateRegulator.whoEnemy(animals, this.getAnimal());
            animals_copy.add(this.getAnimal());
            System.out.println(counter++ + ".Высаживаем на правом берегу " + this.getAnimal().getName());
            System.out.println(counter++ + ".Забираем на лодку " + enemy_animal.getName() + " -> левый берег");
            this.sit_animal = null;
            animals_copy.remove(enemy_animal);
            this.setAnimal(enemy_animal);
            return animals_copy;
        }
    }
}
