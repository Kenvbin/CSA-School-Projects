import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App
{
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);
    List<Integer> listOdd = new ArrayList<Integer>();
    List<Integer> listEven = new ArrayList<Integer>();
    System.out.println("Enter a number (Write quit when done): ");
    String input = reader.nextLine();
    while (!input.equals("quit"))
    {
      try
      {
        int num = Integer.parseInt(input);
        if (num % 2 == 0)
        {
          listEven.add(num);
        }
        else
        {
          listOdd.add(num);
        }
      }
      catch (NumberFormatException e)
      {
        System.out.println("Invalid input");
      }
      System.out.println("Enter another number (Write quit when done): ");
      input = reader.nextLine();
    }
    System.out.println("Odd numbers: " + listOdd);
    System.out.println("Even numbers: " + listEven);
    reader.close();
  }
}