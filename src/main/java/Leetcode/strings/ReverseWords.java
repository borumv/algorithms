package Leetcode.strings;
public class ReverseWords {

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] splitted = s.trim().split("\\s+");
        for(int i = splitted.length - 1; i >= 1; i--){
            result.append(splitted[i]);
            result.append(" ");
        }
        result.append(splitted[0]);
        return result.toString();
    }


}
