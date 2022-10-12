
public class Troll {


    public static String disemvowel(String str) {
        String[] arr = new String[str.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].matches("[AEIOUaeiou]")) {
                sb.append(arr[i]);
            }
        }

        return sb.toString();

    }
}
