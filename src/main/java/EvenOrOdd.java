public class EvenOrOdd {

    public static String even_or_odd(int number) {
        String result = "";

        if (number % 2 == 0){
            result = "Even";
        }else if(number % 2 != 0){
            result = "Odd";
        }

        return result;
    }
}