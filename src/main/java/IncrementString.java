public class IncrementString {
//    public static String incrementString(String str) {
//        if (str.equals("")){
//            return "1";
//        }else {
//
//        String last = str.substring(str.length() - 1);
//        int inc = 0;
//        String incValue = "";
//
//        if (last.matches("[0-8]+")) {
//            inc = Integer.parseInt(last);
//            inc++;
//            incValue = String.valueOf(inc);
//            str = str.substring(0, str.length() - 1) + incValue;
//        } else if (last.equals("9")) {
//            String str1 = str.replaceAll("\\D+", "");
//            int inc9 = Integer.parseInt(str1);
//            inc9++;
//            str = str.replaceAll("\\d", "");
//            str = str + inc9;
//        } else {
//            str = str.substring(0, str.length()) + "1";
//        }
//        return str;
//    }
}