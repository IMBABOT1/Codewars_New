import java.util.*;

public class Order {
    public static String order(String words) {
        StringBuilder result = new StringBuilder();
        if (words.equals("")) {
            return "";
        } else {

            Map<Integer, String> map = new HashMap<>();
            String[] numberOnly = words.replaceAll("[^0-9]", "").split("");
            String[] word = words.split(" ");

            for (int i = 0; i < word.length; i++) {
                map.put(Integer.parseInt(numberOnly[i]), word[i]);
            }


            for (Map.Entry<Integer, String> m : map.entrySet()) {
                result.append(m.getValue() + " ");
            }

            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
}
