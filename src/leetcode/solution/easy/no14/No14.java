package leetcode.solution.easy.no14;

// https://leetcode.com/problems/longest-common-prefix/
public class No14 {
    public String longestCommonPrefix(String[] strs) {
        String rs = "";
        int idx = 0, small = Integer.MAX_VALUE;
        for (int i=0; i< strs.length; i++) {
            int strSize = strs[i].length();
            if (strSize < small) {
                small = strSize;
                idx = i;
            }
        }

        for (int j=0; j<strs[idx].length(); j++) {
            char c = strs[idx].charAt(j);
            for (int i=0; i< strs.length; i++) {
                if (c != strs[i].charAt(j)) {
                    return rs;
                }
            }

            rs += c;
        }

        return rs;
    }
}
