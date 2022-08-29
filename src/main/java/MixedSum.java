import java.util.ArrayList;
import java.util.List;

public class MixedSum {
    public static int sum(List<?> mixed) {
        int numbers = 0;

        for (int i = 0; i < mixed.size(); i++) {
            if (mixed.get(i) instanceof String){
                numbers += Integer.parseInt((String) mixed.get(i));
            }else {
                numbers += (int) mixed.get(i);
            }
        }

        return numbers;
    }
}
