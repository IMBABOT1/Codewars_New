

public class Accumul {
    public static String accum(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res += Character.toUpperCase(s.charAt(i));
            for (int j = 1; j <= i; j++) {
                res += Character.toLowerCase(s.charAt(i));

            }
            if (i < s.length() - 1)
                res += "-";
        }

        return res;
    }
}
