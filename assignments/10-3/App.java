// The mode of a list of numbers is the number listed more often. Write a program that takes 10 numbers as input and displays the mode of these numbers. Your program should use parallel arrays and a method that takes an array of numbers as a parameter and returns the value that appears most often in the array

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int nums[] = new int[10];
        System.out.println("Enter 10 numbers: ");

        for(int i=0;i<10;i++)
            nums[i] = reader.nextInt();
        
        int mode =Calculator.mode(nums);
        System.out.println("Mode: " + mode);
    }
}
