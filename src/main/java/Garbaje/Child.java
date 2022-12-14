package Garbaje;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent{
    @Override
    protected ArrayList<String> parentMethod() {
        return new ArrayList<>();
    }
}
