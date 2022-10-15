import java.util.ArrayList;
import java.util.List;

public class RowWeights {
    public static int[] rowWeights(final int[] weights) {
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                firstSum += weights[i];
            } else if (i % 2 != 0) {
                secondSum += weights[i];
            }
        }

        return new int[]{firstSum, secondSum}; // Do your magic!
    }
}
