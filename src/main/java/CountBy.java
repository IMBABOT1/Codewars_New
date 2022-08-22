import java.lang.reflect.Array;
import java.util.Arrays;

public class CountBy {

    public static int[] countBy(int x, int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length ; i++) {
            result[i] = x * (i + 1);
        }
        return result;
    }
}
