import java.util.*;

public class SumDigPower {

    private static long checkResult(Long value) {
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


        if (result == 0) {
            v = value;
        }


        return v;
    }


    public static List<Long> sumDigPow(long a, long b) {
        long length = b - a + 1;

        List<Long> list = new ArrayList<>();
        List<Long> result = new ArrayList<>();


        for (long i = 0; i < length; i++) {
            list.add(i + a);
            if (checkResult(list.get((int) i)) != 0) {
                result.add(checkResult(list.get((int) i)));
            }
        }

        return result;
    }
}
