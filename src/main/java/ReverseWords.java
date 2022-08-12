import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(final String original) {
        if (original.equals("   ")){
            return "   ";
        }else {
            StringBuilder builder = new StringBuilder();
            builder.append(original).reverse();
            String[] s = builder.toString().split(" ");
            List<String> result = new ArrayList<>();
            String res = "";

            for (int i = s.length - 1; i >= 0; i--) {
                result.add(s[i]);
            }
            res = result.toString().replace("[", "");
            res = res.replace("]", "");
            res = res.replace(",", "");

            return res;
        }
    }
}
