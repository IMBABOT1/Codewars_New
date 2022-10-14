

public class ArrayPrinter {

    public static String printArray(Object array[]) {
        String res = "";

        for (int i = 0; i < array.length; i++) {
            res += array[i] + ",";
        }

        res = res.substring(0, res.length() - 1);

        return res;
    }
}
