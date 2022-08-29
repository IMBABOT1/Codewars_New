public class IncrementString {
    public static String incrementString(String str) {
        String last = str.substring(str.length() - 1);
        int inc = 0;
        String incValue = "";

        if (last.matches("[0-9]+")){
            inc = Integer.parseInt(last);
            inc++;
            incValue = String.valueOf(inc);
            str = str.substring(0,str.length()-1) + incValue;
        }


        return str; // you code here
    }
}
