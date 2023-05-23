package SellAndNotSell;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class SellTest {
    public static void main(String[] args) {
        List<String> peopleList = Arrays.stream(new String[]{"Boris", "Stas", "Chicha", "Serega", "Stas Septilko"}).toList();
        List<Purchase> purchaseList = new ArrayList<>();
        Purchase purchase = new Purchase("Маскорпоне", 7.67);
        Purchase purchase1 = new Purchase("Маскорпоне", 7.67);
        Purchase purchase2 = new Purchase("Маскорпоне", 7.67);
        Purchase purchase3 = new Purchase("Сухое молоко", 8.63);
        Purchase purchase4 = new Purchase("Сухое молоко", 8.63);
        Purchase purchase5 = new Purchase("Сгущенное молоко", 3.71);
        Purchase purchase6 = new Purchase("Сгущенное молоко", 3.71);
        Purchase purchase7 = new Purchase("Печенье", 4.04);
        Purchase purchase8 = new Purchase("Печенье2", 4.01);
        Purchase purchase9 = new Purchase("Масло сливочное", 4.81);
        Purchase purchase10 = new Purchase("Какао", 3.26);


//        Purchase purchase7 = new Purchase("Сыр", 4.2);
//        Purchase purchase8 = new Purchase("Сыр", 4.2);
//        Purchase purchase9 = new Purchase("Сыр", 4.2);
//        Purchase purchase10 = new Purchase("Сыр", 4.2);
//        Purchase purchase11 = new Purchase("Сыр", 4.2);
//        Purchase purchase12 = new Purchase("Сыр", 4.2);
//        Purchase purchase13 = new Purchase("Сыр", 4.2);
//        Purchase purchase14 = new Purchase("Сыр", 4.2);
//        Purchase purchase15 = new Purchase("Сыр", 4.2);
//        Purchase purchase17 = new Purchase("Сыр", 4.2);
//        Purchase purchase18 = new Purchase("Сыр", 4.2);
//        Purchase purchase19 = new Purchase("Сыр", 4.2);

        purchaseList.add(purchase);
        purchaseList.add(purchase1);
        purchaseList.add(purchase2);
        purchaseList.add(purchase3);
        purchaseList.add(purchase4);
        purchaseList.add(purchase5);
        purchaseList.add(purchase6);
        purchaseList.add(purchase7);
        purchaseList.add(purchase8);
        purchaseList.add(purchase9);
        purchaseList.add(purchase10);
//        purchaseList.add(purchase7);
//        purchaseList.add(purchase8);
//        purchaseList.add(purchase9);
//        purchaseList.add(purchase10);
//        purchaseList.add(purchase11);
//        purchaseList.add(purchase12);
//        purchaseList.add(purchase13);
//        purchaseList.add(purchase16);


        Map<String, List<Purchase>> purchaseHashMap = getPurchases(peopleList, purchaseList, 1.4);
        randomize(peopleList, purchaseHashMap);

        for (Map.Entry<String, List<Purchase>> f : purchaseHashMap.entrySet()) {
            double totalPrice = 0.0;
            System.out.println(f.getKey() + ":");
            for (Purchase p : f.getValue()) {
                totalPrice += p.getCost();
                System.out.println(p.getName() + " - " + p.getCost());
            }
            System.out.println("Total price = " + totalPrice);
            System.out.println("\n");
        }


        
        
    }
    

    private static Map<String, List<Purchase>> getPurchases(List<String> peopleList, List<Purchase> purchaseList, double mistake) {
        double totalSum = getSum(purchaseList);
        int peopleCount = peopleList.size();
        double mediana = totalSum / peopleCount;
        double start = mediana - mistake;
        System.out.println("TOTAL SUM = " + totalSum);
        System.out.println("MEDIANA = "  + mediana);
        double end = mediana + mistake;
        List<Purchase> sortedPurchaseList = purchaseList.stream().sorted((Comparator.comparing(Purchase::getCost))).toList();
        List<List<Purchase>> result = new ArrayList<>();
        int rightIndex = sortedPurchaseList.size() - 1;
        int leftIndex = 0;
        double counter = 0;

        Map<String, List<Purchase>> resultMap = new HashMap<>();

        while (counter < peopleCount) {
            int totalSumOfPurchase = 0;
            List<Purchase> purchases = new ArrayList<>();

            while (!((start <= totalSumOfPurchase) && (totalSumOfPurchase <= end)) || totalSumOfPurchase > end) {
                if (totalSumOfPurchase + sortedPurchaseList.get(rightIndex).getCost() <= end) {
                    purchases.add(sortedPurchaseList.get(rightIndex));
                    totalSumOfPurchase += sortedPurchaseList.get(rightIndex).getCost();
                    rightIndex--;
                }else {
                    if(totalSumOfPurchase + sortedPurchaseList.get(leftIndex).getCost() <= end){
                        totalSumOfPurchase += sortedPurchaseList.get(leftIndex).getCost();
                        purchases.add(sortedPurchaseList.get(leftIndex));
                        leftIndex++;
                    }else {
                        break;
                    }
                }
            }
            counter++;
            result.add(purchases);
        }

        for (int i = 0; i < peopleList.size(); i++) {
            resultMap.put(peopleList.get(i), result.get(i));
        }
        System.out.println();
        return resultMap;
     }






    private static double getSum(List<Purchase> purchases) {
       return purchases.stream().reduce(0.0, (x,y) -> x + y.getCost(), Double::sum);
    }
    
    private static void randomize(List<String> people, Map<String, List<Purchase>> map){
        
        int i = (int) (10 * Math.random());

        int count = 0;

        while (count < i){
            for (int i1 = 1; i1 < people.size(); i1++) {
                List<Purchase> purchases = map.get(people.get(i1 - 1));
                map.put(people.get(i1 - 1), map.get(people.get(i1)));
                map.put(people.get(i1), purchases);
            }

            count++;
        }

    }
/*
* Если
*
* */

}
