import java.util.Scanner;
public class Aproxaroot {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String doItAgain = "y";

        while (doItAgain.equals("y")||doItAgain.equals("Y"))
        {
            System.out.print("Enter a number: ");
            int number = reader.nextInt();
            System.out.print("Enter the ammount of aproxamations: ");
            int aprox = reader.nextInt();
            double guess = 1.0;
            
            for(int i = 1; i<= aprox; i++)
            {
                guess = (guess + number / guess) / 2;
            }
            System.out.println("The aproximate square root of the number "+number+" is "+guess);
            reader.nextLine();
            
            System.out.print("Do you want to do it again? (y/n): ");
            doItAgain = reader.nextLine();
        }
    }
}
