public class NthPower {
    public static int nthPower(int[] array, int n) {
        if (n >= array.length){
            return - 1;
        }else {
            return (int) Math.pow(array[n], n);
        }
    }
}
