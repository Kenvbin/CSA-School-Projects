import java.util.Scanner;

public class Convert {
    public static void main(String[] args) throws Exception {
        try (Scanner converter = new Scanner(System.in)) {
            int years;
            int minutes;
            System.out.print("How many years do you want to convert to minutes?: ");
            years = converter.nextInt();
            minutes = years * 525600;
            System.out.print("The number of minutes in ");
            System.out.print(years);
            System.out.print(" year(s) is: ");
            System.out.print(minutes);
        }
    }
}
