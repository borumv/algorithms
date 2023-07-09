package trash.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Elephant implements Animal{
    @Override
    public String getName() {
        return "Elephant";
    }

    @Override
    public List<Class<? extends Animal>> getVictims() {
        return new ArrayList<>();
    }

    @Override
    public List<Class<? extends Animal>> getFeeders() {
        List<Class<? extends Animal>> feeders = new ArrayList<>();
        feeders.add(Elephant.class);
        return feeders;
    }
}
