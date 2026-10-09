import java.util.*;

public class Guessing {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        int counter = 0;

        System.out.println("I am thinking of a number 1-100");
        System.out.print("Guess: ");
        int guess = reader.nextInt();

        while (guess != num){
            if (guess > num)
                System.out.println("No, the number is less.\n");
            else
                System.out.println("No, the number is greater.\n");
            System.out.print("Guess another number: ");
            guess = reader.nextInt();
            counter += 1;
        }
        System.out.println("Congrats you got the number it was "+ num +"\n It took you " + counter + " tries");
    }
}
