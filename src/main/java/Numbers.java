import java.math.BigDecimal;
import java.math.RoundingMode;

public class Numbers {
    public static double TwoDecimalPlaces(double number) {;
        BigDecimal bd = BigDecimal.valueOf(number);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();

    }
}
