public class BankAccount {
    public String name;
    public double balance;

    public BankAccount (String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }
    
    public String getName()
    {
        return name;
    }

    public Double getBalance()
    {
        return balance;
    }

    public void Deposit(double money)
    {
        balance += money;
    }

    public void Withdrawl(double money)
    {
        balance -= money;
    }
    public String toString(){
        return "Name: " + name + "\n Balance: " + balance;
    }
}
