// Write a program that takes 10 floating-point numbers as inputs. The program displays the average of the numbers followed by all of the numbers that are greater than the average. As part of your design, write a method that takes an array of doubles as a parameter and returns the average of the data in the array.
import java.util.Scanner;
public class LargeAverage {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        double[] nums = new double[10];

        System.out.println("Enter 10 floating-point numbers: ");
        for(int i =0;i<10;i++)
            nums[i] = reader.nextDouble();
        
        double average =Calculator.average(nums);
        System.out.println("Average: " + average);
        System.out.print("Numbers greater than average: ");

        for(double i:nums){
            if (i>average)
            System.out.print(i+" ");
        }
    }
}
