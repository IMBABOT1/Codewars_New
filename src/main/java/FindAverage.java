public class FindAverage {

    public static int findAverage(int[] nums) {
        int avg = 0;

        for (int i = 0; i < nums.length ; i++) {
            avg += nums[i];
        }

        return avg/nums.length;
    }
}
