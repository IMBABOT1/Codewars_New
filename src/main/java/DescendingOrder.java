import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String temp = Integer.toString(num);
        int[] arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res * 10 + arr[i];
        }

        return res;
    }
}
