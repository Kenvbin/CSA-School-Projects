import java.util.*;
public class playTTT {
    public static void main (String[]args){
        Scanner reader = new Scanner(System.in);
        TTTBoard board = new TTTBoard();

        System.out.println(board);

        Random gen = new Random();
        char player = 'O';

        while (board.getWinner() == '-' && !board.fill()){
            if (player == 'O')
            {
            System.out.println(player + "'s turn");
            System.out.println("Enter the row and column [1-3, space, 1-3]: ");

            int row = reader.nextInt();
            int column = reader.nextInt();

            boolean success = board.placeXorO(player, row, column);
            if (!success)
                System.out.println("Error: cell already occupied!");
            else {
                System.out.println(board);
                player = 'X';
            }
            }
            else
                {
                    System.out.println("X's turn");
                    int row = gen.nextInt(3)+1;
                    int column = gen.nextInt(3)+1;

                    boolean success = board.placeXorO(player, row, column);
                    while (!success)
                    {
                        row = gen.nextInt(3)+1;
                        column = gen.nextInt(3)+1;
                        success = board.placeXorO(player, row, column);
                    }
                        System.out.println(board);
                        player = 'O';
                }
        }
        char winner = board.getWinner();
        if (winner != '-')
            System.out.println(winner + "s wins!");
        else
            System.out.println("It's a draw!");
    }
}