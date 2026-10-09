import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();
        
        String p1;
        int p1w = 0;
        int com = 0;
        String comm = "rock";
        int comw = 0;

        while (p1w != 3 && comw != 3){
            com = generator.nextInt(3);
            if (com == 0){comm="rock";}
            if (com == 1){comm="paper";}
            if (com == 2){comm="scissors";}
            
            System.out.print("Rock, Paper or Scissors?: ");
            p1 = reader.nextLine();

            if (comm.equals("rock")&& p1.equals("paper")){
                System.out.println("You won!");
                p1w++;
            }
            if (comm.equals("rock") && p1.equals("scissors")){
                System.out.println("You lost.");
                comw++;
            }
            if (comm.equals("paper") && p1.equals("rock")){
                System.out.println("You lost.");
                comw++;
            }
            if (comm.equals("paper")&& p1.equals("scissors")){
                System.out.println("You won!");
                p1w++;
            }
            if (comm.equals("scissors") && p1.equals("paper")){
                System.out.println("You lost.");
                comw++;
            }
            if (comm.equals("scissors") && p1.equals("rock")){
                System.out.println("You win!");
                p1w++;
            }
            if (comm.equals(p1))
                System.out.println("You tied try again");
        }
        if (comw==3){
            System.out.println("Sorry the computer won the best of 3");
        }
        else{
            System.out.println("CONGRATS YOU WON!!!");
        }



    }
}
