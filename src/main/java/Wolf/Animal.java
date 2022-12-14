package Wolf;

import java.util.List;

public interface Animal {
    String getName();
    List<Class<? extends Animal>> getVictims();
    List<Class<? extends Animal>> getFeeders();
}
