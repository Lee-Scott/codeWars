package AlternateCapitalization;

public class Solution {
    public static String[] capitalize(String s) {
        String u = s.toUpperCase();

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        String[] strings = new String[2];

        for (int x = 0; x < s.length(); x++) {
            if (x % 2 == 0) {
                a.append(s.toUpperCase().charAt(x));
                b.append(s.toLowerCase().charAt(x));
            } else {
                a.append(s.toLowerCase().charAt(x));
                b.append(s.toUpperCase().charAt(x));
            }
        }
        return new String[]{String.valueOf(a), String.valueOf(b)};
    }
}