import java.util.*;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        Set<Character> charSet = new LinkedHashSet<>();
        List<Character> list = new ArrayList<>();
        String res = "";

        char[] first = s1.toCharArray();
        for (char c : first) {
            charSet.add(c);
        }

        char[] second = s2.toCharArray();
        for (char c : second) {
            charSet.add(c);
        }

        for (char c : charSet) {
            list.add(c);
        }
        Collections.sort(list);

        for (char c : list){
            res += c;
        }

        return res;
    }
}
