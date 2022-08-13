import java.util.*;

public class HighestAndLowest {

    public static int sum(int[] numbers) {
        int sum = 0;
        int maxOccurrence = 0;
        int minOccurrence = 0;
        List<Integer> lMax = new ArrayList<>();
        List<Integer> lMin = new ArrayList<>();
        List<Integer> total = new ArrayList<>();
        if (numbers == null){
            return 0;
        }
        if (numbers.length == 0) {
            return 0;
        } else {
            int min = numbers[0];
            int max = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                } else if (max < numbers[i]) {
                    max = numbers[i];
                }
            }


            for (int i = 0; i < numbers.length; i++) {
                if (min == numbers[i]) {
                    minOccurrence++;
                } else if (max == numbers[i]) {
                    maxOccurrence++;
                }
            }

            for (int i = 0; i < numbers.length; i++) {
                if (max == numbers[i] && maxOccurrence > 1) {
                    lMax.add(numbers[i]);
                    maxOccurrence--;
                }
            }


            for (int i = 0; i < numbers.length; i++) {
                if (min == numbers[i] && minOccurrence > 1) {
                    lMin.add(numbers[i]);
                    maxOccurrence--;
                }
            }

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] != max && numbers[i] != min) {
                    total.add(numbers[i]);
                }
            }

            total.addAll(lMax);
            total.addAll(lMin);


            for (int i = 0; i < total.size(); i++) {
                sum += total.get(i);
            }
        }
        return sum;
    }
}
