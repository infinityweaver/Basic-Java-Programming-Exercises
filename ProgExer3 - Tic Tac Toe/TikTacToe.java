import java.util.Scanner;

public class TikTacToe
{
	public static void main(String[] args) 
	{
		char [][]arr = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		char pos;
		char choice;
		int switcher = 2;
		Scanner sc = new Scanner(System.in);

		System.out.println("This is a tic-tac-toe game. This game requires two players.");
		System.out.println("Player 1 will be marked by 'X' and Player 2 will be marked by 'O'.");
		System.out.println("Whosever first creates a 3-X line or 3-O line wins.\n");

		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			System.out.print("\n");
		}


		do
		{
			if(switcher % 2 == 0)
			{
				System.out.println("Player 1, your turn: ");
				System.out.print("Choose your position in the board: ");
				pos = sc.next().charAt(0);
				System.out.print("\n");
			}
			else
			{
				System.out.println("Player 2, your turn: ");
				System.out.print("Choose your position in the board: ");
				pos = sc.next().charAt(0);
				System.out.print("\n");
			}
				

			xChecker(arr);
			oChecker(arr);
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(switcher % 2 == 0)
					{
						if(arr[i][j] == pos)
						{
							arr[i][j] = 'X';
						}
						System.out.print(arr[i][j]+" ");
					}
					else if(switcher % 2 != 0)
					{
						if(arr[i][j] == pos)
						{
							arr[i][j] = 'O';
						}
						System.out.print(arr[i][j]+" ");
					}
				}
				System.out.print("\n");
			}
			switcher++;//to switch the marking between X and O

			if((xChecker(arr)) || (oChecker(arr)))
			{
				System.exit(0);
			}
		
			if(switcher == 11)
			{
				System.out.println("NO ONE WINS!!!");
				System.exit(0);
			}	

		}while(xChecker(arr) == false || oChecker(arr) == false) ;
	}

	public static boolean xChecker(char[][]arr)
	{
		boolean xWins = false;
		//diagonal x checker
		if((arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') || (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X'))
		{
			xWins = true;
			System.out.println("\nPlayer 1 is the Winner!");
		}
		//horizontal x checker
		else if((arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X') || (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X') || 
			(arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X'))
		{
			xWins = true;
			System.out.println("\nPlayer 1 is the Winner!");
		}
		//vertical x checker
		else if((arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X') || (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') || 
			(arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X'))
		{
			xWins = true;
			System.out.println("\nPlayer 1 is the Winner!");
		}
		return xWins;
	}

	public static boolean oChecker(char[][]arr)
	{
		boolean oWins = false;
		//diagonal o checker
		if((arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') || (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O'))
		{
			oWins = true;
			System.out.println("\nPlayer 2 is the Winner!");
		}
		//horizontal o checker
		else if((arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O') || (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O') || 
			(arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O'))
		{
			oWins = true;
			System.out.println("\nPlayer 2 is the Winner!");
		}
		//vertical o checker
		else if((arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O') || (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O') || 
			(arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O'))
		{
			oWins = true;
			System.out.println("\nPlayer 2 is the Winner!");
		}
		return oWins;
	}
}