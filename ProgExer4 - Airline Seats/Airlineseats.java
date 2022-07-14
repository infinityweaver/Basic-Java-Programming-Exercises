import java.util.*;
import java.io.IOException;

public class Airlineseats
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Scanner s = new Scanner(System.in);

		//initialize all seats to false
		boolean[][] seats = new boolean[7][];
		for(int i=0; i < seats.length; i++)
			seats[i] = new boolean[4];

		char ans = 'n';
		String seatChoice = "";
		do
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			displaySeats(seats);
			System.out.print("Please choose an unoccupied seat location (from 1A to 7D): ");
			seatChoice = s.nextLine();
			chooseSeat(seats, seatChoice);
			displaySeats(seats);
			do
			{
				System.out.print("Get another seat? [y|n] ");
				ans = s.nextLine().charAt(0);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}while(ans != 'y' && ans != 'n');
		}while(ans == 'y');
	}

	public static void displaySeats(boolean[][] seats)
	{
		for(int i=0; i < seats.length; i++)
		{
			System.out.print((i+1) + " ");
			for(int j=0; j < seats[i].length; j++)
			{
				if(seats[i][j])
					System.out.print("X ");
				else
					System.out.print((char)('A'+j) + " ");
			}
			System.out.println();
		}
	}

	//typecast
	public static boolean chooseSeat(boolean[][] seats, String seatChoice)
	{
		//check validity of seatChoice
		//check if length of string is 2
		//check if 1-7 1st char
		//check if a-d 2nd char
		seatChoice = seatChoice.toUpperCase();
		if((seatChoice.length() != 2) ||
		  (seatChoice.charAt(0) < '1' || seatChoice.charAt(0) > '7') ||
		  (seatChoice.charAt(1) < 'A' || seatChoice.charAt(1) > 'D'))
		{
			System.out.println("Error: Invalid input. (Range is 1A - 7D).");
			return false;
		}

		int row = seatChoice.charAt(0)-'1', col = seatChoice.charAt(1)-'A';

		if(seats[row][col])
		{
			System.out.println("Error: Invalid seat location, it's occupied.");
			return false;
		}
		else
		{
			return (seats[row][col] = true);
		}
	}
}