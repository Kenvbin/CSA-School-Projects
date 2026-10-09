public class Calculator {
    public static int[] mode(int[] array) {
        int[] frequency = Frequency(array);
        int maxFrequency = 0;

        for (int freq : frequency) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }

        int count = 0;
        for (int freq : frequency) {
            if (freq == maxFrequency) {
                count++;
            }
        }

        int[] mode = new int[count];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxFrequency) {
                mode[index++] = i;
            }
        }
        if (maxFrequency ==1)
            return mode = new int[]{-1};
        
        
        return mode;
    }
    public static double median(int[]nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int a = 0; a < nums.length - 1 - i; a++) {
                if (nums[a] > nums[a + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = nums[a];
                    nums[a] = nums[a + 1];
                    nums[a + 1] = temp;
                }
            }
        }
        double median =(nums[4]+nums[5])/2.0;
        return median;
    }
    public static void displayFrequency(int[] numbers) {
        System.out.printf("%-16s%s","Number", "Frequency");
        System.out.println("");

        int[] frequency = Frequency(numbers);

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.printf("%-16d%d",i,frequency[i]);
                System.out.println("");
            }
        }
    }

    private static int[] Frequency(int[] array) {
        int[] frequency = new int[101];

        for (int number : array) {
            frequency[number]++;
        }

        return frequency;
    }
}
