import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int nums[] = new int[10];
        System.out.println("Enter 10 numbers: ");

        for(int i=0;i<10;i++)
            nums[i] = reader.nextInt();
        
        int[] mode =Calculator.mode(nums);
        double median = Calculator.median(nums);
        System.out.print("Mode: ");
        for (int a : mode){
            if (a==-1)
                System.out.print("None");
            else
                System.out.print(a + " ");
        }
        
        System.out.println();
        System.out.println("Median: " + median);
        Calculator.displayFrequency(nums);
    }
}
