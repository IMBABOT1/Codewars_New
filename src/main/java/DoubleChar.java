import java.util.*;

public class DoubleChar {

    public static String doubleChar(String s) {
        char[] arr = s.toCharArray();
        int[] ints = new int[s.length()];
        int[] temp = new int[ints.length * 2];
        char[] results = new char[temp.length];


        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            temp[i] = ints[i / 2];
        }

        for (int i = 0; i < temp.length; i++) {
            results[i] = (char) temp[i];
        }

        String text = String.copyValueOf(results);


        return text.toString();
    }
}
