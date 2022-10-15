import java.util.Arrays;

public class ProdFib {
    public static long[] productFib(long prod) {
        long[] result = new long[3];

        long a;
        long b = 0;
        long c = 1;

        System.out.println(prod);

        if (prod == 1){
            result[0] = 1;
            result[1] = 1;
            result[2] = 1;
        }else {
            for (int i = 0; i < prod; i++) {
                a = b;
                b = c;
                c = a + b;
                if (a * b == prod) {
                    result[0] = a;
                    result[1] = b;
                    result[2] = 1;
                    break;
                } else if (a * b > prod) {
                    result[0] = a;
                    result[1] = b;
                    result[2] = 0;
                    break;
                }
            }
        }

        return result;
    }
}
