import java.util.*;
import java.io.IOException;

public class AirlineSeats
{
	static void displaySeats(char[][] seats) 
	{
		for(int i = 0; i < seats.length; i++)
		{
			System.out.print(i + 1 + " ");
			for(int j = 0; j < seats[i].length; j++)
			{
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException
	{
		char[][] seats = {{'A', 'B', 'C', 'D'},
						 {'A', 'B', 'C', 'D'},
						 {'A', 'B', 'C', 'D'},
						 {'A', 'B', 'C', 'D'},
						 {'A', 'B', 'C', 'D'},
						 {'A', 'B', 'C', 'D'},
						 {'A', 'B', 'C', 'D'}};
		char rowSeat;
		char colSeat;
		int row;
		int col = 0;
		String choice;

		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		displaySeats(seats);
		System.out.println();

		do
		{
			Scanner scanner = new Scanner(System.in);

			System.out.print("Please choose an unoccupied seat location (from 1A to 7D): ");
			String seatLoc = scanner.nextLine();

			rowSeat = seatLoc.charAt(0);
			colSeat = seatLoc.charAt(1);
			row = rowSeat - '0';

			if((colSeat == 'A') || (colSeat == 'a'))
				col = 0;
			else if((colSeat == 'B') || (colSeat == 'b'))
				col = 1;
			else if((colSeat == 'C') || (colSeat == 'c'))
				col = 2;
			else if((colSeat == 'D') || (colSeat == 'd'))
				col = 3;
			else
				System.out.println("\nError: Out of bounds.\n");

			if (seats[row-1][col] == 'X')
				System.out.println("\nError: Invalid Seat Location, it's occupied.\n");
			else
			{
				seats[row-1][col] = 'X';
				System.out.println();
				displaySeats(seats);
				System.out.println();
			}

			System.out.print("Get another seat? [y|n] ");
			choice = scanner.nextLine();
			System.out.println();
		} while(choice.equals("y") || choice.equals("Y"));
		

	}

	
}