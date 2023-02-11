package leetcode.solution.easy.no13;

// https://leetcode.com/problems/roman-to-integer/
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
public class No13 {
    public static final char SYMBOL_I = 'I';
    public static final char SYMBOL_V = 'V';
    public static final char SYMBOL_X = 'X';
    public static final char SYMBOL_L = 'L';
    public static final char SYMBOL_C = 'C';
    public static final char SYMBOL_D = 'D';
    public static final char SYMBOL_M = 'M';

    public int romanToInt(String s) {
        int rs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                rs += symbolToValue(s.charAt(i));
                return rs;
            }
            switch (s.charAt(i)) {
                case SYMBOL_I:
                    if (s.charAt(i+1) == SYMBOL_V || s.charAt(i+1) == SYMBOL_X) {
                         rs += symbolToValue(s.charAt(i+1)) - 1;
                         ++i;
                    }
                    else {
                        rs += symbolToValue(s.charAt(i));
                    }

                    break;

                case SYMBOL_X:
                    if (s.charAt(i+1) == SYMBOL_L || s.charAt(i+1) == SYMBOL_C) {
                        rs += symbolToValue(s.charAt(i+1)) - 10;
                        ++i;
                    }
                    else {
                        rs += symbolToValue(s.charAt(i));
                    }
                    break;

                case SYMBOL_C:
                    if (s.charAt(i+1) == SYMBOL_D || s.charAt(i+1) == SYMBOL_M) {
                        rs += symbolToValue(s.charAt(i+1)) - 100;
                        ++i;
                    }
                    else {
                        rs += symbolToValue(s.charAt(i));
                    }
                    break;

                default:
                    rs += symbolToValue(s.charAt(i));
            }
        }

        return rs;
    }

    public int symbolToValue(char sym) {
        switch (sym) {
            case SYMBOL_I:
                return 1;

            case SYMBOL_V:
                return 5;

            case SYMBOL_X:
                return 10;

            case SYMBOL_L:
                return 50;

            case SYMBOL_C:
                return 100;

            case SYMBOL_D:
                return 500;

            case SYMBOL_M:
                return 1000;

            default:
                return 0;
        }
    }
}
