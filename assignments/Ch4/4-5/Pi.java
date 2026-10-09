import java.util.Scanner;
public class Pi {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int iterations;
        double aprox = 1.0;
        System.out.print("How many iterations do you want the program to run: ");
        iterations = reader.nextInt();

        for (double i = 1; i<iterations; i++)
            if (i % 2 == 0){
                aprox += (1.0 / ( (2 * i) + 1 ));
            }
            else{
                aprox -= (1.0 / ( (2 * i) + 1 ));
            }
System.out.println("The aproxamation of Pi divided by 4 is " + aprox);
System.out.println("The aproxamation of Pi is " + aprox*4.0);
    }
}
