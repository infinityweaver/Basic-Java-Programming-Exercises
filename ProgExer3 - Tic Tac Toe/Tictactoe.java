import java.util.*;

public class Tictactoe {
  
  static String[] board;
  static String turn;
  static String checkWinner()
  {
    for (int a = 0; a < 8; a++) {
      String line = null;

      switch (a) {
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
      //For X winner
      if (line.equals("XXX")) {
        return "X";
      }
      
      // For O winner
      else if (line.equals("OOO")) {
        return "O";
      }
    }
    
    for (int a = 0; a < 9; a++) {
      if (Arrays.asList(board).contains(
          String.valueOf(a + 1))) {
        break;
      }
      else if (a == 8) {
        return "draw";
      }
    }

  // To enter the X Or O at the exact place on board.
    System.out.println("Player " + 
      turn + " your turn. \nChoose a position in the board: "
      + turn);
    return null;
  }
  
  
  static void printBoard()
  {
  	System.out.println("\n");
    System.out.println(board[0]
            + "  " + board[1] + "  " + board[2]
 			);
    System.out.println(board[3] + "  "
            + board[4] + "  " + board[5]
             );
    System.out.println(board[6] + "  "
            + board[7] + "  " + board[8]
            );
    System.out.println("\n");
  }

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    board = new String[9];
    turn = "X";
    String winner = null;

    for (int a = 0; a < 9; a++) {
      board[a] = String.valueOf(a + 1);
    }

    System.out.println("This is a tic-tac-toe game. This games requires two players.");
    System.out.println("Player 1 will be marked by 'X' and player 2 will be marked by 'O'");
    System.out.println("whosever first creates a 3-X line or 3-0 line wins.");
    printBoard();
    System.out.println("Player X, your turn.");
    System.out.println("Choose a position in the board: ");

    while (winner == null) 
    {
      int numInput;
      
      try {
        numInput = in.nextInt();
        if (!(numInput > 0 && numInput <= 9)) {
          System.out.println(
            "Invalid input; re-enter slot number:");
          continue;
        }
      }
      catch (InputMismatchException e) {
        System.out.println(
          "Invalid input; re-enter slot number:");
        continue;
      }
      
      if (board[numInput - 1].equals(
          String.valueOf(numInput))) {
        board[numInput - 1] = turn;

        if (turn.equals("X")) {
          turn = "O";
        }
        else {
          turn = "X";
        }

        printBoard();
        winner = checkWinner();
      }
      else {
        System.out.println(
          "Slot already taken; re-enter slot number:");
      }
    }
    
    if (winner.equalsIgnoreCase("draw")) {
      System.out.println(
        "It's a draw! Thanks for playing.");
    }
    
    else {
      System.out.println(
        "Player " + winner
        + " wins!");
    }
  }
}
