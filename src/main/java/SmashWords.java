public class SmashWords {

    public static String smash(String... words) {
        StringBuilder sb = new StringBuilder();

        if (words.length == 0) {
            sb.append("");
        } else {
            for (int i = 0; i < words.length; i++) {
                sb.append(words[i] + " ");
            }
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}
