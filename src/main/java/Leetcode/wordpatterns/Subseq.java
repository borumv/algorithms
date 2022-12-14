package Leetcode.wordpatterns;

public class Subseq {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc","ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        int indexS = 0;
        int indexT = 0;
        while(indexS < s.length() && indexT < t.length()){
            if(t.charAt(indexT) == s.charAt(indexS)){
                indexS++;
            }
            indexT++;
        }
        return indexS == s.length();
    }
}
