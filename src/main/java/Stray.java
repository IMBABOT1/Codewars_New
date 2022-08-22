import java.util.HashMap;
import java.util.Map;

public class Stray {
    public static int stray(int[] numbers) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length ; i++) {
            if (!map.containsKey(numbers[i])){
                map.put(numbers[i], 1);
            }else if (map.containsKey(numbers[i])){
                map.put(numbers[i], map.get(numbers[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()){
            if (m.getValue() == 1){
                result = m.getKey();
            }
        }

        return result;
    }
}
