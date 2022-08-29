public class SquareSum {

    public static int squareSum(int[] n) {
        int result = 0;

        for (int i = 0; i < n.length ; i++) {
            result += n[i] * n[i];
        }

        return result;
    }
}
