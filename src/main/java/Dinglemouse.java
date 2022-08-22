public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int cat = 0;
        int dog = 0;
        int[] result = new int[3];

        if (humanYears == 1){
            cat += 15;
        }else if (humanYears == 2){
            cat += 15 + 9;
        }else if(humanYears > 2){
            cat += 15 + 9 +((humanYears - 2) * 4);
        }

        if (humanYears == 1){
            dog += 15;
        }else if (humanYears == 2){
            dog += 15 + 9;
        }else if(humanYears > 2){
            dog += 15 + 9 +((humanYears - 2) * 5);
        }

        result[0] = humanYears;
        result[1] = cat;
        result[2] = dog;

        return result;
    }
}
