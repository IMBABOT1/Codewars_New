import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProdFib {
    public static long[] productFib(long prod) {
        long[] result = new long[3];

        System.out.println(prod);

        int a;
        int b = 0;
        int c = 1;

        int first = 0;
        int second = 0;
        int sum = 0;

        int firstIndex = 0;
        int secondIndex = 0;

        StringBuilder sb = new StringBuilder();
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
                result[0] = list.get(firstIndex + 1);
                result[1] = list.get(secondIndex + 1);
                result[2] = 1;
                break;
            } else if (first * second > prod) {
                firstIndex = index - 1;
                secondIndex = index;
                result[0] = list.get(firstIndex + 1);
                result[1] = list.get(secondIndex + 1);
                result[2] = 0;
                break;
            }
            index++;
        }

        return result;
    }
}
