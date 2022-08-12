import java.util.Arrays;

public class VowelCount {

    public static int getCount(String str) {
        String[] arr = str.split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("a") ||
                    arr[i].equals("e") ||
                    arr[i].equals("i") ||
                    arr[i].equals("o") ||
                    arr[i].equals("u")) {
                count++;
            }
        }
        return count;
    }
}
