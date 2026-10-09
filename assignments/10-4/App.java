// The median of a list of numbers is the value in the middle of the list if the list is arranged in order. Add to the program of project 10-3 the capability of displaying the median of the list of numbers

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int nums[] = new int[10];
        System.out.println("Enter 10 numbers: ");

        for(int i=0;i<10;i++)
            nums[i] = reader.nextInt();
        
        int mode =Calculator.mode(nums);
        double median = Calculator.median(nums);
        System.out.println("Mode: " + mode);
        System.out.println("Median: " + median);
    }
}
