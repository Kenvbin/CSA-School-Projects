import java.util.Scanner;
public class TeleCost {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        double length;
        double additional = 0.50;
        System.out.print("How long was the phone call? (in minutes): ");
        length = reader.nextDouble();
        if (length <=2)
            System.out.print("The cost of the phone call was $1.15.");
        else
            System.out.print("The cost of the phone call was $" + (((length - 2)*additional) + 1.15) );
    }
}
