public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double result = weight / Math.pow(height , 2);
        String res = "";
        if (result <= 18.5) {
            res = "Underweight";
        } else if (result <= 25.0) {
            res = "Normal";
        } else if (result < 30.0) {
            res = "Overweight";
        } else if (result > 30) {
            res = "Obese";
        }
        return res;
    }
}
