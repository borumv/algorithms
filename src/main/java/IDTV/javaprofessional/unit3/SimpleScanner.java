package IDTV.javaprofessional.unit3;

import java.util.*;

public class SimpleScanner {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(7);
        integerList.add(4);
        integerList.add(5);
        integerList.add(54);
        integerList.add(4);
        integerList.add(54);
        List<Integer> withoutDuplicatesList = removeDuplicated3(integerList);
        for (int i = 0; i < withoutDuplicatesList.size(); i++) {
            System.out.println(withoutDuplicatesList.get(i));
        }
    }
    public static List<Integer> removeDuplicated(List<Integer> input){
        Set <Integer>integerSet = new HashSet<>(input);
        return new ArrayList<>(integerSet);
     }
     public static List<Integer> removeDuplicated2(List<Integer> input){
         for (int i = 0; i < input.size() - 1; i++) {
             for (int j = i + 1; j < input.size() ; j++) {
                 if (input.get(i) == input.get(j)){
                     input.remove(input.get(j));
                 }
             }
         }
         return input;
     }
     public static List<Integer> removeDuplicated3(List<Integer> input){
          Collections.sort(input);
          for (int i = 1; i < input.size();) {
             int a = input.get(i);
             int b = input.get(i- 1);
             if (a == b){
                 input.remove(i - 1);
             }else {
                 i++;
             }
         }
         return input;
     }
     //2,2,2,4,3,3,45,5,5
}
