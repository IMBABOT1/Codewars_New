public class HelpAlex {

    public static String hoopCount(int n){
        if (n >= 10) return "Great, now move on to tricks";
        if (n < 10) return "Keep at it until you get it";

        throw new RuntimeException("Invalid value");
    }
}
