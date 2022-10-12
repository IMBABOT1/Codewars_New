
public class StringUtils {

    public static String toAlternativeString(String string) {
        String result = "";

        for (int i = 0; i < string.length() ; i++) {
            if ((string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') || string.charAt(i) == ' '){
                result += String.valueOf(string.charAt(i)).toLowerCase();
            }else if ((string.charAt(i) >= 'a' && string.charAt(i) <= 'z') || string.charAt(i) == ' '){
                result += String.valueOf(string.charAt(i)).toUpperCase();
            }else if (String.valueOf(string.charAt(i)).matches(".*\\d.*")){
                result += String.valueOf(string.charAt(i));
            }else if (string.charAt(i) == '>' ||
                      string.charAt(i) == '<' ||
                      string.charAt(i) == '=' ||
                      string.charAt(i) == '.' ||
                      string.charAt(i) == ';' ||
                      string.charAt(i) == '?' ||
                      string.charAt(i) == '/' ||
                      string.charAt(i) == ',' ||
                      string.charAt(i) == ':' ||
                      string.charAt(i) == '!'

            ){
                result += String.valueOf(string.charAt(i));
            }
        }

        return result;
    }
}
