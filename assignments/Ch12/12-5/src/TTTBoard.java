public class TTTBoard
{
    private char[][] board;

    public TTTBoard()
    {
        board = new char[3][3];
        reset();
    }
    public void reset()
    {
        for (int row = 0; row<3; row++)
        {
            for (int column = 0; column<3; column++)
            {
                board[row][column] = '-';
            }
        }
    }
    public String toString()
    {
        String result = "\n";
        for (int row = 0; row < 3; row++)
        {
            for (int column = 0; column < 3; column++)
            {
                result += board[row][column] + " ";
            }
            result += "\n";
        }
        return result;
    }
    public boolean placeXorO(char player, int row, int column)
    {
        if (board[row - 1][column - 1] == '-')
        {
            board[row -1][column - 1] = player;
            return true;
        }
        else
            return false;
    }
    //test for fullness and for winner
    public char getWinner() {
        for (int i = 0; i < 3; i++) {
          // Check rows and columns
          if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
            return board[i][0];
          }
          if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
            return board[0][i];
          }
        }

        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
          return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
          return board[0][2];
        }

        return '-';
      }

    public boolean fill()
    {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}