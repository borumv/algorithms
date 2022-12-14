package IDTV.javaprofessional.unit1;

import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        Collections.synchronizedMap(new HashMap<>());
        list1.add(4);


        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("world", "one");
        simpleMap.put("world2", "second");
        simpleMap.put("world3", "third");

        for(Map.Entry<String, String> map: simpleMap.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }

    }

}
