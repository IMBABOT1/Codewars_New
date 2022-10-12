import java.util.ArrayList;
import java.util.List;

public class NoBoring {

    public static int noBoringZeros(int n) {
        String temp = String.valueOf(n);
        List<String> list = new ArrayList<>();
        String result = "";

        for (int i = 0; i < temp.length(); i++) {
            list.add(String.valueOf(temp.charAt(i)));
        }

        if (list.get(0).equals("0")) {
            result = "0";
        } else if (!list.get(list.size() - 1).equals("0")) {
            result = String.valueOf(n);
        } else {
            int i = list.size() - 1;
            while (true) {
                list.remove(i);
                i--;
                if (!list.get(i).equals("0")) {
                    break;
                }
            }

            for (int j = 0; j < list.size(); j++) {
                result += list.get(j);
            }
        }

        return Integer.parseInt(result);
    }
}
