import java.util.ArrayList;
import java.util.List;

public class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        List<Long> numbers = new ArrayList<>();
        List<Long> primes = new ArrayList<>();


        for (long i = m; i <= n; i++) {
            numbers.add(i);
        }

        int count = 0;
        for (int i = 0; i < numbers.size() ; i++) {
            for (int j = 1; j <= numbers.get(i) ; j++) {
                if (numbers.get(i) % j == 0){
                    count++;
                }
            }
        }


//        long firstNumber = 0;
//        long secondNumber = 0;
//        int index = 0;
//
//        while (true) {
//            firstNumber = primes.get(index);
//            index++;
//            if (index >= primes.size()){
//                return null;
//            }
//            secondNumber = primes.get(index);
//
//            if (secondNumber - firstNumber == g) {
//                break;
//            }
//        }
        return new long[]{1, 2};
    }

    public static boolean prime(long n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
