import java.util.HashMap;
import java.util.Map;

public class FindOdd {

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
            if (map1.getValue() % 2 != 0) {
               result = map1.getKey();
            }
        }

        return result;
    }
}
