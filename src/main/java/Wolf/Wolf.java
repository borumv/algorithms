package Wolf;

import java.util.ArrayList;
import java.util.List;

public class Wolf implements Animal{
    @Override
    public String getName() {
        return "Wolf";
    }

    @Override
    public List<Class<? extends Animal>> getVictims() {
        List<Class<? extends Animal>> feedList = new ArrayList<>();
        feedList.add(Goat.class);
        return feedList;
    }

    @Override
    public List<Class<? extends Animal>> getFeeders() {
        return new ArrayList<>();
    }
}
