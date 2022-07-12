import java.util.*;

class TicTacToe
{
	static String[] board;
    static String turn;
    
    static String checkWinner()
    {
        for (int a = 0; a < 8; a++)
        {
            String line = null;
  
            switch (a)
            {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }

            // For Player 1 Winner
            if (line.equals("XXX"))
            {
                return "Player 1";
            }
              
            // For Player 2 Winner
            else if (line.equals("OOO"))
            {
                return "Player 2";
            }
        }
          
        for (int a = 0; a < 9; a++)
        {
            if (Arrays.asList(board).contains(String.valueOf(a + 1)))
            {
                break;
            }
            else if (a == 8)
            {
                return "draw";
            }
        }
  
       // To enter the X or O at the exact place on board.
        if (turn.equals("X"))
        {
        	System.out.print("Player 1, your turn. \nChoose a position in the board: ");
        	return null;
        }

        else
        {
        	System.out.print("Player 2, your turn. \nChoose a position in the board: ");
        	return null;
        }
        
    }
    
    static void printBoard()
    {
        System.out.print("\n");
        System.out.println(" " + board[0] + " " + board[1] + " " + board[2]);
        System.out.println(" " + board[3] + " " + board[4] + " " + board[5]);
        System.out.println(" " + board[6] + " " + board[7] + " " + board[8]);
        System.out.print("\n");
    }
  
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;
  
        for (int a = 0; a < 9; a++)
        {
            board[a] = String.valueOf(a + 1);
        }
  
        System.out.println("This is a tic-tac-toe game. This game requires two players.");
        System.out.println("Player 1 will be marked by 'X' and Player 2 will be marked by 'O'.");
        System.out.println("Whosoever first creates a 3-X line or 3-O line wins.");
        printBoard();
  
        System.out.print("Player 1 your turn. \nChoose a position in the board: ");
  
        while (winner == null)
        {
            int numInput;
            
           // Exception handling.
           // numInput will take input from user like from 1 to 9.
           // If it is not in range from 1 to 9.
           // then it will show you an error "Invalid input."
            try
            {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9))
                {
                    System.out.println("Error: Invalid Position. Please choose a position from 1-9");
                    continue;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Error: Invalid Position. Please choose a position from 1-9");
                continue;
            }
              
            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (board[numInput - 1].equals(String.valueOf(numInput)))
            {
                board[numInput - 1] = turn;
  
            	if (turn.equals("X"))
            	{
                    turn = "O";
                }

                else
                {
                    turn = "X";
                }
  
                printBoard();
                winner = checkWinner();
            }

            else
            {
            	System.out.println("Error: Invalid Position. Please choose a position not marked an 'X' or 'O'.");
            }
        }
        
        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw"))
        {
            System.out.println("The game was a draw!");
        }
        
        // For winner -to display Congratulations! message.
        else
        {
            System.out.println(winner + " wins!");
        }
    }
}