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

    createGolfScoresFile("fake_golf_scores.txt", dates, scores);

    GolfScoreCard golfScoreCard = new GolfScoreCard("fake_golf_scores.txt");

    System.out.println("Score Card:\n" + golfScoreCard.toString());
    System.out.println(golfScoreCard.highLowDays());

    scanner.close();
  }

  private static void createGolfScoresFile(String fileName, int[] dates, int[][] scores) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
      writer.println(dates.length);

      for (int i = 0; i < dates.length; i++) {
        writer.print(dates[i] + " ");
        for (int j = 0; j < 18; j++) {
          writer.print(scores[i][j] + " ");
        }
        writer.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
