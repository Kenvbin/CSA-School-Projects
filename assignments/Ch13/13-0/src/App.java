import java.util.Scanner;

public class App
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    scanner.close();

    int sum = sumOfNumbersGreaterThanTwo(n);
    System.out.println("Sum of all of the numbers from " + n + " to 2: " + sum);
  }

  private static int sumOfNumbersGreaterThanTwo(int n)
  {
    if (n <= 2)
    {
      return 0;
    }
    else
    {
      return n + sumOfNumbersGreaterThanTwo(n - 1);
    }
  }
}