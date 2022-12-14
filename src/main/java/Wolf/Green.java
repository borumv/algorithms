package Wolf;

import java.util.ArrayList;
import java.util.List;

public class Green implements Animal{
    @Override
    public String getName() {
        return "Green";
    }

    @Override
    public List<Class<? extends Animal>> getVictims() {
        List<Class<? extends Animal>> victimList = new ArrayList<>();
        victimList.add(Green.class);
        return victimList;
    }

    @Override
    public List<Class<? extends Animal>> getFeeders() {
        return new ArrayList<>();
    }
}
