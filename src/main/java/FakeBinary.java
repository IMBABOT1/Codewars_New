import java.util.Arrays;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String[] arr = numberString.split("");
        int[] result = new int[arr.length];
        StringBuilder resString = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.valueOf(arr[i]);
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] < 5) {
                result[i] = 0;
            } else if (result[i] >= 5) {
                result[i] = 1;
            }
        }


        for (int i = 0; i < result.length; i++) {
            resString.append(result[i]);
        }


        return resString.toString();
    }
}
