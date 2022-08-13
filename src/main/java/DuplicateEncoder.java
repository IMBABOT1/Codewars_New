import java.util.*;

public class DuplicateEncoder {

    public static String encode(String word) {
        word = word.toLowerCase();
        String[] arr = word.split("");
        boolean[] b = new boolean[arr.length];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                b[i] |= (i!=j && arr[i].equals(arr[j]));
            }
        }

        for (int i = 0; i < b.length ; i++) {
            if (b[i] == true){
                builder.append(")");
            }else {
                builder.append("(");
            }
        }

        return builder.toString();
    }
}
