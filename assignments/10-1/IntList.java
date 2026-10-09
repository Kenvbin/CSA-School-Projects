// Write a program that takes 10 integers as input. The program places the even integers into an array called evenList, the odd integers into an array called oddList, and the negative integers into an array called negativeList. The program displays the contents of the three arrays after all the integers has been entered.
import java.util.Scanner;
public class IntList {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int evenList[] = new int[10];
        int oddList[] = new int[10];
        int negativeList[] = new int[10];
        int negative = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Enter 10 integers: ");

        for(int i=0;i<10;i++){
            int num = reader.nextInt();
            if(num%2==0){
                evenList[even] = num;
                even++;
                if(num<0){
                    negativeList[negative] = num;
                    negative++;}
            }
            else{
                oddList[odd]=num;
                odd++;
                if(num<0){
                    negativeList[negative] = num;
                    negative++;}
            }
        }
        System.out.print("Even numbers: ");
        for(int i=0;i<even;i++)
            System.out.print(evenList[i]+" ");
        System.out.print("\nOdd numbers: ");
        for(int i=0;i<odd;i++)
            System.out.print(oddList[i]+" ");
        System.out.print("\nNegative numbers: ");
        for(int i=0;i<negative;i++)
            System.out.print(negativeList[i]+" ");

    }
}
