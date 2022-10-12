import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Between {

    public static int[] between(int a, int b) {
        List<Integer> list = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            list.add(i);
        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
