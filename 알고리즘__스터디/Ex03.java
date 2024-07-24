package 알고리즘__스터디;

import java.util.List;
import java.util.regex.Pattern;

public class Ex03 {
    private static final Pattern ROMAN_PATTERN = Pattern.compile(
            "^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"
    );

    public static void main(String[] args) {
        int validCount = 0;

        List<String> th = List.of("", "M", "MM", "MMM");
        List<String> hn = List.of("C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM");
        List<String> tn = List.of("X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC");
        List<String> on = List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX");

        for (String thItem : th) {
            for (String hnItem : hn) {
                for (String tnItem : tn) {
                    for (String onItem : on) {
                        String roman = thItem + hnItem + tnItem + onItem;
                        if (roman.length() == 12 && isValidRoman(roman)) {
                            validCount++;
                        }
                    }
                }
            }
        }

        System.out.println("유효한 12자리 로마 숫자의 총 조합 수: " + validCount);
    }

    private static boolean isValidRoman(String s) {
        return ROMAN_PATTERN.matcher(s).matches();
    }
}
