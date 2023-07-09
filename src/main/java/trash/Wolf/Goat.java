package trash.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Goat implements Animal {

    @Override
    public String getName() {
        return "Goat";
    }
    @Override
    public List<Class<? extends Animal>> getVictims() {
        List<Class<? extends Animal>> victimList = new ArrayList<>();
        victimList.add(Cabbage.class);
        return victimList;
    }

    @Override
    public List<Class<? extends Animal>> getFeeders() {
        List<Class<? extends Animal>> feeders = new ArrayList<>();
        feeders.add(Wolf.class);
        return feeders;
    }
}
