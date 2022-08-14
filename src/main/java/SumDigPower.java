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


        if (result == 0 ) {
            v = value;
        }


       return v;
    }


    public static List<Long> sumDigPow(long a, long b) {
        long length = b - a + 1;

        Long[] arr = new Long[(int) length];
        List<Long> result = new ArrayList<>();

        System.out.println(a);
        System.out.println(b);




        for (long i = a; i < length ; i++) {
            arr[(int) i] = i;

            if (checkResult(arr[(int) i]) != 0){
                result.add(checkResult(arr[(int) i]));
            }
        }

        return result;
    }
}
