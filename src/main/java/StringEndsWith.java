import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEndsWith {

    public static boolean solution(String str, String ending) {
        int firstLength = str.length();
        int secondLength = ending.length();

        if (firstLength < secondLength) {
            return false;
        } else if (secondLength == 0) {
            return true;
        } else {
            int result = firstLength - secondLength;
            String[] first = str.split("");
            String[] second = ending.split("");

            System.out.println(str);
            System.out.println(ending);

            List<String> firstList = new ArrayList<>();
            List<String> secondList = new ArrayList<>(Arrays.asList(second));

            for (int i = result; i < first.length; i++) {
                firstList.add(first[i]);
            }

            if (firstList.equals(secondList)) {
                return true;
            }
        }
        return false;
    }
}
