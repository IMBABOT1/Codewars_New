public class Feast {

    public static boolean feast(String beast, String dish) {
        String beastFirstLetter = String.valueOf(beast.charAt(0));
        String beastLastLetter = String.valueOf(beast.charAt(beast.length() - 1));
        String dishFirstLetter = String.valueOf(dish.charAt(0));
        String dishLastLetter = String.valueOf(dish.charAt(dish.length() - 1));

        return beastFirstLetter.equals(dishFirstLetter) && beastLastLetter.equals(dishLastLetter);
    }
}
