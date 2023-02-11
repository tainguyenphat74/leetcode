package leetcode.solution.easy.no9;

// https://leetcode.com/problems/palindrome-number/
public class No9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        String c = "";
        int o = x;

        while (x != 0) {
            int t = x % 10;
            x = x / 10;
            c = c.concat(String.valueOf(t));
        }

        int s_to_i;

        try {
            // -2^31 <= c <= 2^31 - 1
            s_to_i = Integer.parseInt(c);
        } catch (Exception e) {
            return false;
        }

        if (s_to_i == o) return true;

        return false;
    }
}
