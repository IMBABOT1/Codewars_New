import java.util.Arrays;

public class WarnTheSheep {

    public static String warnTheSheep(String[] array) {
        int counter = 0;
        String result = "";

        int index = array.length - 1;

        while (array[index].equals("sheep")){
            index--;
            counter++;
        }


        if (counter > 0) {
            result += "Oi! Sheep number " + counter + "! You are about to be eaten by a wolf!";
        } else {
            result = "Pls go away and stop eating my sheep";
        }

        return result;
    }
}
