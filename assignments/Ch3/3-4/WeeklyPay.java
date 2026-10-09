import java.util.Scanner;

public class WeeklyPay {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        double hourlywage;
        double regularhours;
        double overtimehours;
        double overtimepay;
        double weeklypay;

        System.out.print("Input the hourly wage: ");
        hourlywage = reader.nextDouble();
        System.out.print("Input the total regular hours worked: ");
        regularhours = reader.nextDouble();
        System.out.print("Input the total overtime hours worked: ");
        overtimehours = reader.nextDouble();

        overtimepay = overtimehours * (1.5 * hourlywage);
        weeklypay = (hourlywage * regularhours) + overtimepay;

        System.out.println("Your weeks pay ammounts to: $"+ weeklypay);
    }
}
