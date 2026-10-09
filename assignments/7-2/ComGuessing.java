import java.util.Scanner;
import java.util.Random;

public class ComGuessing {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            Random rand = new Random();
            int min = 1;
            int max = 100;
            int attempts = 0;

            System.out.print("Input a number 1-100: ");
            int num = reader.nextInt();

            while (true) 
            {
                int guess = rand.nextInt(max - min + 1) + min;

                if (guess == num) {
                    System.out.println("It took "+ attempts+" attempts for the computer to guess your number of "+num);
                    break;
                } 
                System.out.println(guess);
                if (guess < num) 
                    min = guess + 1;
                 else 
                    max = guess - 1;
                

                attempts++;
            }
        }
    }
}