package FindUniq;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 3, 2, 3, 4, 6, 7, 9, 7));
        List<Integer> list2 = createNewList(list);
        System.out.println();
    }

    private static List<Integer> createNewList(List<Integer> list) {
        //Создаём Map, подсчитывая количества вхождений чисел массива
        Map<Integer, Integer> counts = new HashMap<>();
        list.forEach((item) -> counts.put(item, counts.get(item) == null ? 1 : counts.get(item) + 1));
        //Возвращаем List, где value() в нашей Map = 1
        return list.stream()
                .filter(item -> counts.get(item) == 1)
                .toList();
    }


}
