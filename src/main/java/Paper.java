public class Paper {

    public static int paperWork(int n, int m) {
        int result = 0;

        if (n < 0 || m < 0){
            result = 0;
        }else {
            result = n * m;
        }
        return  result;
    }
}
