public class NumberFun {
    public static long findNextSquare(long sq) {
        int nextN = (int)Math.floor(Math.sqrt(sq) + 1);

        return nextN * nextN;
    }
}
