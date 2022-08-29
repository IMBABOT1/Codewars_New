public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int avg = 0;

        for (int i = 0; i < classPoints.length; i++) {
            avg += classPoints[i];
        }

        return yourPoints > (avg / classPoints.length);
    }
}
