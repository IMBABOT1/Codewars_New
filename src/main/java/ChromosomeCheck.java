public class ChromosomeCheck {

    public static String chromosomeCheck(String sperm) {
        String result = "";
        if (sperm.equals("XY")){
            result = "Congratulations! You're going to have a son.";
        }
        if (sperm.equals("XX")){
            result = "Congratulations! You're going to have a daughter.";
        }
        return result;
    }
}
