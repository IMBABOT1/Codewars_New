public class ChromosomeCheck {

    public static String chromosomeCheck(String sperm) {
        String result = "";
        switch (sperm) {
            case ("XY"):
                result = "Congratulations! You're going to have a son.";
                break;
            case ("XX"):
                result = "Congratulations! You're going to have a daughter.";
        }
        return result;
    }
}
