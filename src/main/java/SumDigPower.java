import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDigPower {

    private static void checkResult(Long[] array, Long value) {
        String s = String.valueOf(value);
        String[] arr = s.split("");
        Long[] temp = new Long[arr.length];
        int[] d = new int[arr.length];
        int sum = 0;
        int result = 0;
        long v = 0;




        for (int i = 0; i < temp.length; i++) {
            temp[i] = Long.valueOf(arr[i]);
        }


        for (int i = 0; i < temp.length; i++) {
            d[i] = (int) Math.pow(temp[i], i + 1);
        }

        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        result = (int) (value - sum);

        if (result == 0){
            v = value;
        }

       // System.out.println(v);
    }


    public static List<Long> sumDigPow(long a, long b) {
        Long[] arr = new Long[(int) b];

        for (long i = 0; i < arr.length ; i++) {
            arr[(int) i] = i + 1;
            checkResult(arr, arr[(int) i]);
        }





        return new ArrayList<>();
    }
}
