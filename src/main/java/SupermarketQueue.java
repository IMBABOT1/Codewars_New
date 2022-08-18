import java.util.Arrays;

public class SupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int result = 0;
        int sum = 0;

        System.out.println(Arrays.toString(customers));
        System.out.println(n);

        for (int i = 0; i < customers.length ; i++) {
            if (customers[i] < n){
                result  = customers.length;
            }else if (n == 1){
                result += customers[i];
            }else if (customers[i] >= n){
                result += customers[i];
            }
        }

        result = result / n;

        return result;
    }
}
