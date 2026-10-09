import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Input a number: ");
        num1 = reader.nextInt();
        System.out.print("Input another number: ");
        num2 = reader.nextInt();
        System.out.println("The quotient is " + Math.max(num1,num2) / Math.min(num1,num2));
        System.out.println("The remainder is " + Math.max(num1,num2) % Math.min(num1,num2));
    }
}