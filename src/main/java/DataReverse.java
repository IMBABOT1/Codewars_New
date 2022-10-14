import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DataReverse {
    public static int[] DataReverse(int[] data) {
        int firstDimension = data.length / 8;
        int secondDimension = 8;
        int[] result = new int[data.length];
        int[][] arr = new int[firstDimension][secondDimension];
        int i = 0;


        for (int r = 0; r < firstDimension; r++) {
            for (int c = 0; c < secondDimension; c++) {
                arr[r][c] = data[i++];
            }
        }

        for (int j = 0; j < arr.length / 2; j++) {
            int[] temp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = temp;
        }


        for (int j = 0; j < arr.length ; j++) {
            for (int k = 0; k < arr[j].length ; k++) {
                result[k] = arr[j][k];
            }
        }

        int[] array = Stream.of(arr)
                .flatMapToInt(IntStream::of)
                .toArray();

        return array;
    }
}
