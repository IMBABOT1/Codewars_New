import java.util.ArrayList;
import java.util.List;

public class ProdFib {
    public static long[] productFib(long prod) {
        long[] result = new long[2];


        int a;
        int b = 0;
        int c = 1;

        int first = 0;
        int second = 0;
        int sum = 0;

        int firstIndex = 0;
        int secondIndex = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < prod; i++) {
            a = b;
            b = c;
            c = a + b;
            list.add(c);
        }
        int index = 0;
        while (sum <= prod) {
            if (index == list.size() - 1) {
                break;
            }
            first = list.get(index);
            second = list.get(index + 1);
            if (first * second == prod) {
                firstIndex = index - 1;
                secondIndex = index;
                break;
            } else if (first * second > prod) {
                firstIndex = index - 1;
                secondIndex = index;
                break;
            }
            index++;
        }
        System.out.println(firstIndex);
        System.out.println(secondIndex);

        System.out.println(result);


        return null;
    }
}
