import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Permutations {

    public static List<String> singlePermutations(String s) {
        Set<Character> duplicates = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            duplicates.add(s.charAt(i));
        }

        System.out.println(duplicates);


        return null;
    }
}
