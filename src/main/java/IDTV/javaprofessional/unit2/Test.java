package IDTV.javaprofessional.unit2;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(1);
        navigableSet.add(3);
        navigableSet.add(2);
        navigableSet.add(4);
        navigableSet.add(5);
        navigableSet.add(324);
        navigableSet.add(32);
        navigableSet.add(44);

        for (int i = 0; i < navigableSet.size(); i++) {
            System.out.println(navigableSet.floor(i));
        }

    }
}
