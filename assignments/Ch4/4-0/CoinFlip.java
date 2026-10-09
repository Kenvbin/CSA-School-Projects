import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) throws Exception {
        Random generator = new Random();
        int heads = 0;
        int tails = 0;
        int n;

        for (int i=1 ; i<=10 ; i++){
            n = generator.nextInt(2);
            
            if (n == 0){
                System.out.println("Heads");
                heads ++;
            }
            else{
                System.out.println("Tails");
                tails ++;
            }
        }
        System.out.println("After 10 rounds there were "+ heads+" heads and "+ tails +" tails.");
    }
}
