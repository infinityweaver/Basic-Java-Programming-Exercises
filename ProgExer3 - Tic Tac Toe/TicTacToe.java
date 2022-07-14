import java.util.*;

public class Tictactoe
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		//initialize board
		char[][] board = new char[3][];
		for(int i=0; i < board.length; i++)
		{
			board[i] = new char[3];
			for(int j=0; j < board[i].length; j++)
				board[i][j] = '.';
		}

		System.out.println("This is a tic-tac-toe game. This game requires two players.\nPlayer 1 will be marked by 'X' and Player 2 will be marked by 'O'.\nWhosoever first creates a 3-X line or 3-O line wins.");
		//let players play until someone wins
		char[] playerSymbol = new char[]{'X', 'O'};
		int player = 0, numberOfPlays = 0;
		do
		{
			System.out.println();
			displayBoard(board);
			System.out.println("\nPlayer " + (player+1) + ", your turn.");
			System.out.print("Choose a position in the board: ");
			int pos = s.nextInt();
			if(pos < 1 || pos > 9)
			{
				System.out.println("Error: Invalid position.");
			}
			else if (play(board, pos, playerSymbol[player]))
			{
				numberOfPlays++;
				player = ++player % 2;
			}

			if(numberOfPlays == 9)
				break;

		}while(!checkWin(board));

		System.out.println();
		displayBoard(board);
		System.out.println();
		if(checkWin(board))
			System.out.println("Player " + ((1-player)+1) + ", wins!");
		else
			System.out.println("The game was a draw!");
	}

	public static void displayBoard(char[][] board)
	{
		for(int i=0; i < 3; i++)
		{
			for(int j=0; j < 3; j++)
			{
				if(board[i][j] == '.')
					System.out.print((3*i + j + 1)+" ");
				else
					System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean play(char[][] board, int pos, char player)
	{
		int x = (pos - 1) / 3;
		int y = (pos - 1) % 3;
		if(board[x][y] == '.')
		{
			board[x][y] = player;
			return true;
		}
		else
		{
			System.out.println("Please choose a position not marked an 'X' or 'O'.");
			return false;
		}
	}

	public static boolean checkWin(char[][] board)
	{
		boolean flag = false;

		for(int i=0; i < 3; i++)
		{
			//vertical
			if(board[i][0] != '.' && board[i][0] == board[i][1] && 
				board[i][1] == board[i][2])
			{
				flag = true;
				break;
			}

			//horizontal
			if(board[0][i] != '.' && board[0][i] == board[1][i] && 
				board[1][i] == board[2][i])
			{
				flag = true;
				break;
			}
		}

		if(board[0][0] != '.' && board[0][0] == board[1][1] && 
				board[1][1] == board[2][2])
		{
			flag = true;
		}
		else if(board[0][2] != '.' && board[0][2] == board[1][1] && 
				board[1][1] == board[2][0])
		{
			flag = true;
		}

		return flag;
	}
}