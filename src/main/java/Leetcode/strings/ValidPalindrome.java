package Leetcode.strings;
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String without = s.toLowerCase().replaceAll("[\\p{Punct}\\s+]", "");
        for (int i = 0; i < without.length() / 2; i++) {
            if(without.charAt(i) != without.charAt(without.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

}
