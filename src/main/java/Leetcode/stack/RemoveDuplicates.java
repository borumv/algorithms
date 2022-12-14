package Leetcode.stack;

import java.util.Stack;
// "abbaca";
public class RemoveDuplicates {
    public String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(stack.empty()){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == stack.peek()){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        stack.forEach(result::append);
        return result.toString();
    }

}
