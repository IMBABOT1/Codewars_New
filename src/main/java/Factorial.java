public class Factorial {


    public static int factorial(int n) {
        int result = 1;

        System.out.println(n);

        if (n < 0 || n > 12){
            throw new IllegalArgumentException();
        }else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
}
