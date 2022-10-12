import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        boolean result = false;
        int length = a.length;
        double[] arr = new double[length];
        double[] tempArr = new double[length];
        int[] convert = new int[length];


        if (a == null || b == null) {
            result = false;

        } else if (a.length != b.length) {
            result = false;
        } else if (a.length == 0 && b.length == 0) {
            result = true;
        } else {
            for (int i = 0; i < length; i++) {
                arr[i] = b[i];
            }
            for (int i = 0; i < length; i++) {
                tempArr[i] = Math.sqrt(arr[i]);
            }
            for (int i = 0; i < length; i++) {
                convert[i] = (int) tempArr[i];
            }


            for (int i = 0; i < length; i++) {
                if (convert[i] < 0){
                    convert[i] *= -1;
                }
            }

            for (int i = 0; i < length; i++) {
                if (a[i] < 0){
                    a[i] *= -1;
                }
            }

            bubbleSort(convert);
            bubbleSort(a);


            for (int i = 0; i < length; i++) {
                if (convert[i] == a[i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }


        return result;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
