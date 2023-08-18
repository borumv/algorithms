package Leetcode.strings;
public class WithoutRepeatingChars {

    public int lengthOfLongestSubString(String s){
        int left = 0;
        int right = 1;
        int maxLength = 1;

        while (right < s.length() - 1){
            if(s.charAt(right) == s.charAt(left)){
                maxLength = Math.max(right - left, maxLength);
                left++;
            }
            right++;
        }

        return maxLength;
    }
}
