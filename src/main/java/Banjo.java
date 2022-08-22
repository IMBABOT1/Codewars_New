public class Banjo {

    public static String areYouPlayingBanjo(String name) {
        String result;

        if (name.charAt(0) == 'R' || name.charAt(0) == 'r'){
            result = name + " plays banjo";
        }else {
            result = name + " does not play banjo";
        }

        return result;
    }
}
