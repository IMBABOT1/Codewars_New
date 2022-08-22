import java.util.*;

public class Sum {

    public static int GetSum(int a, int b) {
        List<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int result = 0;
        list.add(a);
        list.add(b);
        Collections.sort(list);

        int first = list.get(0);
        int second = list.get(list.size() - 1);
        while (first <= second) {
            res.add(first);
            first++;
        }

        for (Integer i : res){
            result += i;
        }

        return result;
    }
}
