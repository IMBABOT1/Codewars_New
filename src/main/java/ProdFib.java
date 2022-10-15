import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProdFib {
    public static long[] productFib(long prod) {
        long[] result = new long[3];

        int a;
        int b = 0;
        int c = 1;

        int first = 0;
        int second = 0;


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < prod; i++) {
            a = b;
            b = c;
            c = a + b;
            list.add(c);
        }


        int index = 0;

        while (true) {
            first = list.get(index);
            second = list.get(index + 1);
            if (first * second == prod) {
                result[0] = list.get(index);
                result[1] = list.get(index + 1);
                result[2] = 1;
                break;
            } else if (first * second > prod) {
                result[0] = list.get(index);
                result[1] = list.get(index + 1);
                result[2] = 0;
                break;
            }
            index++;
        }


        return result;

    }
}
