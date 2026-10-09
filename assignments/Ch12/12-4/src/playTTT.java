import java.util.*;
public class playTTT {
    public static void main (String[]args){
        Scanner reader = new Scanner(System.in);
        TTTBoard board = new TTTBoard();

        System.out.println(board);

        Random gen = new Random();
        char player;
        if (gen.nextInt(2) == 1)
            player = 'O';
        else
            player = 'X';

        while (board.getWinner() == '-' && !board.fill()){
            System.out.println(player + "'s turn");
            System.out.println("Enter the row and column [1-3, space, 1-3]: ");

            int row = reader.nextInt();
            int column = reader.nextInt();

            boolean success = board.placeXorO(player, row, column);
            if (!success)
                System.out.println("Error: cell already occupied!");
            else {
                System.out.println(board);
                if (player == 'X')
                    player = 'O';
                else
                    player = 'X';
            }
        }
        char winner = board.getWinner();
        if (winner != '-')
            System.out.println(winner + "s wins!");
        else
            System.out.println("It's a draw!");
    }
}