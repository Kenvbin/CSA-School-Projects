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
}
