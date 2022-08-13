public class Square {

    public static boolean isSquare(int n) {
        boolean result;
        if (Math.sqrt(n) % 1 == 0){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
