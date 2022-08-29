import java.util.Arrays;
import java.util.Map;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0){
            return null;
        }else {
            char[] arr = phrase.toCharArray();
            boolean space = true;

            for (int i = 0; i < arr.length; i++) {
                if (Character.isLetter(arr[i])) {
                    if (space) {
                        arr[i] = Character.toUpperCase(arr[i]);
                        space = false;
                    }
                } else {
                    space = true;
                }
            }
            return String.valueOf(arr);
        }
    }
}
