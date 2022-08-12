public class Bio {
    public static String dnaToRna(String dna) {
        dna = dna.replaceAll("T", "U");

        return dna;  // Do your magic!
    }
}
