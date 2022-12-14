package Leetcode.wordpatterns;

import java.util.HashMap;
import java.util.Map;

public class MostPalindrom {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindromeSecond("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
    public static int longestPalindrome(String s) {

        int maxSizePalindrome = 0;
        boolean chet = s.length() % 2 == 0;
        for (int indMiddle = 0;  indMiddle< s.length(); indMiddle++) {
            int leftIndex = chet? indMiddle : indMiddle - 1;
            int rightIndex = indMiddle + 1;

            while(leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)){
                maxSizePalindrome = Math.max(rightIndex - leftIndex, maxSizePalindrome);
                leftIndex--;
                rightIndex++;
            }
        }
        return maxSizePalindrome;
    }
    public static int longestPalindromeSecond(String s) {
        Map<Character, Integer> countWords = new HashMap<>();
        int maxSizePalindrome = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(countWords.containsKey(ch)){
                countWords.put(s.charAt(i), countWords.get(ch) + 1);
                if (countWords.get(ch) % 2 == 0){
                    maxSizePalindrome += 2;
                }
            }else{
                countWords.put(s.charAt(i), 1);
            }
        }
//
        return maxSizePalindrome < s.length() ? maxSizePalindrome + 1 : maxSizePalindrome;
    }

//    public static int longestPalindromeN(String s) {
//
//        int maxSizePalindrome = 0;
//        for (int indMiddle = 0;  indMiddle< s.length(); indMiddle++) {
//            int leftIndex = indMiddle;
//            int rightIndex = indMiddle + 1;
//
//            while(leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)){
//                maxSizePalindrome = Math.max(rightIndex - leftIndex, maxSizePalindrome);
//                leftIndex--;
//                rightIndex++;
//            }
//        }
//        return maxSizePalindrome;
//    }
}
