package trash.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Cabbage implements Animal {

    @Override
    public String getName() {
        return "Cabbage";
    }
    @Override
    public List<Class<? extends Animal>> getVictims() {
        return new ArrayList<>();
    }

    @Override
    public List<Class<? extends Animal>> getFeeders() {
        List<Class<? extends Animal>> feeders = new ArrayList<>();
        feeders.add(Goat.class);
        return feeders;
    }
}
