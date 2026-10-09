import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of dates: ");
        int numDates = scanner.nextInt();

        int[] dates = new int[numDates];
        int[][] scores = new int[numDates][18];

        for (int i = 0; i < numDates; i++) {
          System.out.print("Enter date (yyyymmdd): ");
          dates[i] = scanner.nextInt();

          for (int j = 18; j > 0; j--) {
            System.out.print("Enter "+j+ " more score(s): ");
            scores[i][18-j] = scanner.nextInt();
          }
        }

    try (PrintWriter writer = new PrintWriter(new FileWriter("fake_golf_scores.txt"))) {
      writer.println(numDates);

      for (int i = 0; i < numDates; i++) {
        writer.print(dates[i] + " ");
        for (int j = 0; j < 18; j++) {
          writer.print(scores[i][j] + " ");
        }
        writer.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    GolfScoreCard golfScoreCard = new GolfScoreCard("fake_golf_scores.txt");

    System.out.println("Score Card:\n" + golfScoreCard.toString());
    System.out.println(golfScoreCard.highLowDays());

    scanner.close();
  }
}
