import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();
        int die1, die2, dollars, total_count = 0;

        System.out.print("How many dollars do you have? ");
        dollars = reader.nextInt();

        for (int i = 0; i < 100; i++) {
            int count = 0; 
            int initialDollars = dollars;  

            while (dollars > 0) {
                count++;
                die1 = generator.nextInt(6) + 1;
                die2 = generator.nextInt(6) + 1;
                if (die1 + die2 == 7)
                    dollars += 4;
                else
                    dollars -= 1;
            }

            total_count += count;
            dollars = initialDollars; 
        }

        System.out.println("Average number of rolls: " + (total_count / 100.0)); 
    }
}