import java.util.Scanner;
public class Pow {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the exponent: ");
        int exponent = reader.nextInt();

        while (exponent != -1){
            System.out.println("The result is "+ Math.pow(2,exponent));
            System.out.print("Enter the exponent (Write -1 to exit): ");
            exponent = reader.nextInt();
            
        }
        System.out.print("Goodbye :)");
    }
}
