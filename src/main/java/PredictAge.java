public class PredictAge {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int a1 = age1 * age1;
        int a2 = age2 * age2;
        int a3 = age3 * age3;
        int a4 = age4 * age4;
        int a5 = age5 * age5;
        int a6 = age6 * age6;
        int a7 = age7 * age7;
        int a8 = age8 * age8;

        int sum = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8;

        return (int) (Math.sqrt(sum) / 2);
    }
}
