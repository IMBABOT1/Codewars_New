import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static String solve(final String str) {
        int lower = 0;
        int upper = 0;
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches("[A-Z]")) {
                upper++;
            } else if (list.get(i).matches("[a-z]")) {
                lower++;
            }
        }

        if (upper > lower) {
            result = str.toUpperCase();
        } else if (upper < lower) {
            result = str.toLowerCase();
        }else if (upper == lower){
            result = str.toLowerCase();
        }


        return result; //your code here
    }
}
