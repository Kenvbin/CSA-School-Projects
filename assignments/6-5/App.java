import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount("Joseph Bingle", 10.0);
        Scanner reader = new Scanner(System.in);

        System.out.println("Account: " + account.toString());

        System.out.print("How much do you want to deposit?: ");
        double amount = reader.nextDouble();
        account.Deposit(amount);    

        System.out.println("\n Account details: " + account.toString());

        System.out.print("How much do you want to withdrawl?: ");
        amount = reader.nextDouble();
        account.Withdrawl(amount);   
        
        System.out.println("\n Account details: " + account.toString());
    }
}
