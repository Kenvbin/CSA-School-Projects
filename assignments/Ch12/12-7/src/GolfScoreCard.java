import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class GolfScoreCard {
  private int[] dates;
  private int[][] scores;

  public GolfScoreCard(String fileName) throws IOException {
    Scanner fileReader = new Scanner(new File(fileName));

    int numDays = fileReader.nextInt();

    dates = new int[numDays];
    scores = new int[numDays][18];

    for (int i = 0; i < numDays; i++) {
      dates[i] = fileReader.nextInt();
      for (int j = 0; j < 18; j++) {
        scores[i][j] = fileReader.nextInt();
      }
    }
    fileReader.close();
  }

  public String toString() {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < dates.length; i++) {
      str.append("Date: ").append(dates[i]).append(" Scores:");
      for (int j = 0; j < 18; j++) {
        str.append(" ").append(scores[i][j]);
      }
      str.append("\n");
    }
    return str.toString();
  }

  public String highLowDays() {
    int indexLow = 0;
    int indexHigh = 0;
    int lowTotal = dayTotal(0);
    int highTotal = dayTotal(0);

    for (int i = 1; i < dates.length; i++) {
      int todayTotal = dayTotal(i);
      if (todayTotal < lowTotal) {
        indexLow = i;
        lowTotal = todayTotal;
      } else if (todayTotal > highTotal) {
        indexHigh = i;
        highTotal = todayTotal;
      }
    }
    StringBuilder str = new StringBuilder();
    str.append("The best day: ").append(dates[indexLow]).append(" score: ").append(lowTotal).append("\n");
    str.append("The worst day: ").append(dates[indexHigh]).append(" score: ").append(highTotal).append("\n");
    return str.toString();
  }

  private int dayTotal(int i) {
    int total = 0;
    for (int j = 0; j < 18; j++) {
      total += scores[i][j];
    }
    return total;
  }
}
