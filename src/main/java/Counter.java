import java.util.Arrays;

public class Counter {

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;

        System.out.println(Arrays.toString(arrayOfSheeps));

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null){
                continue;
            }else if (arrayOfSheeps[i] == true){
                counter++;
            }
        }

        return counter;
    }
}
