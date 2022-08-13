import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestScoringWord {

    private static int count(String s) {
        String[] test = s.split("");
        int counter = 0;
        for (int i = 0; i < test.length; i++) {
            if (test[i].equals("a")) {
                counter += 1;
            } else if (test[i].equals("b")) {
                counter += 2;
            } else if (test[i].equals("c")) {
                counter += 3;
            } else if (test[i].equals("d")) {
                counter += 4;
            } else if (test[i].equals("e")) {
                counter += 5;
            } else if (test[i].equals("f")) {
                counter += 6;
            } else if (test[i].equals("g")) {
                counter += 7;
            } else if (test[i].equals("h")) {
                counter += 8;
            } else if (test[i].equals("i")) {
                counter += 9;
            } else if (test[i].equals("j")) {
                counter += 10;
            } else if (test[i].equals("k")) {
                counter += 11;
            } else if (test[i].equals("l")) {
                counter += 12;
            } else if (test[i].equals("m")) {
                counter += 13;
            } else if (test[i].equals("n")) {
                counter += 14;
            } else if (test[i].equals("o")) {
                counter += 15;
            } else if (test[i].equals("p")) {
                counter += 16;
            } else if (test[i].equals("q")) {
                counter += 17;
            } else if (test[i].equals("r")) {
                counter += 18;
            } else if (test[i].equals("s")) {
                counter += 19;
            } else if (test[i].equals("t")) {
                counter += 20;
            } else if (test[i].equals("u")) {
                counter += 21;
            } else if (test[i].equals("v")) {
                counter += 22;
            } else if (test[i].equals("w")) {
                counter += 23;
            } else if (test[i].equals("x")) {
                counter += 24;
            } else if (test[i].equals("y")) {
                counter += 25;
            } else if (test[i].equals("z")) {
                counter += 26;
            }
        }

        return counter;

    }


    public static String high(String s) {
        String[] test = s.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        System.out.println(Arrays.toString(test));


        for (int i = 0; i < test.length; i++) {
            map.put(test[i], count(test[i]));
        }

        System.out.println(map);


        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        return maxEntry.getKey();
    }
}
