public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        if (yearTo - birth == 1) {
            return "You are " + (yearTo - birth) + " year old.";
        }else if (birth - yearTo == 1){
            return "You will be born in 1 year.";
        } else if (yearTo > birth) {
            return "You are " + (yearTo - birth) + " years old.";
        } else if (yearTo < birth) {
            return "You will be born in " + (birth - yearTo) + " years.";
        } else if (yearTo == birth) {
            return "You were born this very year!";
        }
        return "";
    }
}
