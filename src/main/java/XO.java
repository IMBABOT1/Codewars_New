import java.util.Arrays;

public class XO {


    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                x++;
            } else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                o++;
            }
        }
        return x == o;
    }
}
