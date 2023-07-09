package trash.Garbaje;

import java.util.ArrayList;

public class Child extends Parent{
    @Override
    protected ArrayList<String> parentMethod() {
        return new ArrayList<>();
    }
}
