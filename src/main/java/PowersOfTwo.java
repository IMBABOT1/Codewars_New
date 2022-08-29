import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(i);
        }
        long[] result = new long[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = (long) Math.pow(2, list.get(i));
        }

        return result;
    }
}
