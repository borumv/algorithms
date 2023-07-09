package AlgoCourse2022.windowsliding;

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class TestWindow {

    static int x = 5;
    /*
        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
    */
    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        int[] cache = new int[256];
        for (int i = 0, j = 0; i < s.length(); i++) {
            j = (cache[s.charAt(i)] > 0) ? Math.max(j, cache[s.charAt(i)]) : j;
            cache[s.charAt(i)] = i + 1;
            result = Math.max(result, i - j + 1);

        }
        return result;
    }

    public static void main(String[] args) {
        TestWindow t = new TestWindow();
        t.x = 55;
        int y = x / t.x;
        System.out.println(y);
    }
}
