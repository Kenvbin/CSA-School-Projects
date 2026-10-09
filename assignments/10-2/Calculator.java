public class Calculator {
    public static double average(double[] nums){
        double sum = 0;

        for(double i:nums)
            sum += i;

        return sum/nums.length;
    }
}
