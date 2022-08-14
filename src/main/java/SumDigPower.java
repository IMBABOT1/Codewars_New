import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        String s = String.valueOf(a);
        String[] arr = s.split("");
        Long[] temp = new Long[arr.length];
        double[] d = new double[arr.length];


        for (int i = 0; i < temp.length ; i++) {
            temp[i] = Long.valueOf(arr[i]);
        }

        for (int i = 0; i < temp.length; i++) {
            d[i] = Math.pow(temp[i], i+1);
        }

        System.out.println(Arrays.toString(d));

        return new ArrayList<>();
    }
}
