import java.util.Arrays;

public class ShortestWord {
    public static int findShort(String s) {
        String[] arr = s.split(" ");

        String shortestWord = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < shortestWord.length()) {
                shortestWord = arr[i];
            }
        }

        return shortestWord.length();
    }
}
