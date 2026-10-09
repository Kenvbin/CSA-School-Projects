public class Calculator {
    public static int mode(int[]nums){
        int[] ammount = new int[101];
        int mode = 0;
        int mostammount = 0;
        
        for(int num:nums)
            ammount[num]++;
        for(int i=0;i<ammount.length;i++){
            if (ammount[i] > mostammount){
                mostammount = ammount[i];
                mode = i;
            }
        }
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
}
