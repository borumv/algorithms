package Wolf;

import java.util.List;

public class None implements Animal{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public List<Class<? extends Animal>> getVictims() {
        return null;
    }

    @Override
    public List<Class<? extends Animal>> getFeeders() {
        return null;
    }
}
