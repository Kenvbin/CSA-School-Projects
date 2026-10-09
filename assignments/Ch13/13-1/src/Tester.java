import java.util.Scanner;

public class Tester
{
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("What 2 numbers do you want to find the GCD of? : ");
    int a = reader.nextInt();
    int b = reader.nextInt();
    reader.close();
    int gcdn = gcd(a, b);
    System.out.println("The GCD of " + a + " and " + b + " is: " + gcdn);
  }

  private static int gcd(int a, int b)
  {
    if (b == 0)
      return a;
    else
      return gcd(b, a % b);
  }
}