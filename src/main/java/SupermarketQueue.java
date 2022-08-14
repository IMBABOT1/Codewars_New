import java.util.Arrays;

public class SupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int sum = 0;
        int result = 0;



        for (int i = 0; i < customers.length; i++) {
            sum += customers[i];

            if (customers.length == 1){
                result = customers[0];
            }else if (n > sum){
                result = customers.length;
            }else {
                customers[i] = customers[i] - 2;
                sum +=  customers[i];
            }

        }

        return result;
    }
}
