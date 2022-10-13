import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlattenAndSort {

    public static int[] flattenAndSort(int[][] array) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }

        Collections.sort(list);
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
