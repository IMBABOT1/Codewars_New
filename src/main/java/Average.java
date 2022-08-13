public class Average {
    public static double find_average(int[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg /= array.length;
        return avg;
    }
}
