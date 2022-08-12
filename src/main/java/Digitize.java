import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Digitize {

    public static int[] digitize(long n) {
        String temp = String.valueOf(n);
        String[] arr = temp.split("");
        int[] tempArr = new int[arr.length];
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = tempArr.length - 1; i >= 0; i--) {
            result.add(tempArr[i]);
        }

        int[] finalInt = new int[result.size()];

        for (int i = 0; i <finalInt.length ; i++) {
            finalInt[i] = result.get(i);
        }

        return finalInt;
    }
}
