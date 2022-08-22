import java.util.HashMap;
import java.util.Map;

public class Keypad {

    public static int presses(String phrase) {
        phrase = phrase.toLowerCase();
        String[] arr = phrase.split("");
        Map<String, Integer> map = new HashMap<>();
        int result = 0;

        System.out.println(phrase);

        map.put("1", 1);
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("2", 4);
        map.put("d", 1);
        map.put("e", 2);
        map.put("f", 3);
        map.put("3", 4);
        map.put("g", 1);
        map.put("h", 2);
        map.put("i", 3);
        map.put("4", 4);
        map.put("j", 1);
        map.put("k", 2);
        map.put("l", 3);
        map.put("5", 4);
        map.put("m", 1);
        map.put("n", 2);
        map.put("o", 3);
        map.put("6", 4);
        map.put("p", 1);
        map.put("q", 2);
        map.put("r", 3);
        map.put("s", 4);
        map.put("7", 5);
        map.put("t", 1);
        map.put("u", 2);
        map.put("v", 3);
        map.put("8", 4);
        map.put("w", 1);
        map.put("x", 2);
        map.put("y", 3);
        map.put("z", 4);
        map.put("9", 5);
        map.put(" ", 1);
        map.put("0", 2);
        map.put("#", 1);
        map.put("*", 1);

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            for (int i = 0; i < arr.length; i++) {
                if (m.getKey().equals(arr[i])) {
                    result += m.getValue();
                }
            }
        }

        return result;
    }
}
