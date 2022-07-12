import java.util.*;

public class AirlineSeat
{

	static int reserved = 0;

	public static void main(String[] args) {
		char[][] seatNum = new char[7][4];
		for (int i = 0; i < 7; i++) 
		{
			seatNum[i][0] = 'A';
			seatNum[i][1] = 'B';
			seatNum[i][2] = 'C';
			seatNum[i][3] = 'D'; 
			System.out.println((i + 1) + " " + seatNum[i][0] + " " 
				+ seatNum[i][1] + " " + seatNum[i][2] + " " + seatNum[i][3]);
		}
		System.out.print("Please choose an unoccupied seat location (from 1A to 7D)");
		String seatPlace = "";
		String n = "";
		Scanner input = new Scanner(System.in);
		
		seatPlace = input.nextLine();

		if (seatPlace.equals("n")) 
		{
			System.out.println("Reservation made, have a nice day.");
			System.exit(0);
		}
        // In case the input is within the range, check if the seat is occupied, if not change it into X
		while (reserved < 28 && seatPlace.length() > 0) 
		{
			int row = seatPlace.charAt(0) - '1';
			int col = seatPlace.charAt(1) - 'A';
			if (row < 0 || row > 7 || col < 0 || col > 4) 
			{
				System.out.println("Error: Invalid input. (range 1A - 7D) | n to exit ");
				seatPlace = input.nextLine();
				if (seatPlace.equals("n")) 
				{
					System.out.println("Reservation made, have a nice day.");
					System.exit(0);
				}

			} else 

			{
				if (seatNum[row][col] != 'X') 
				{
					seatNum[row][col] = 'X';
					reserved++;
					System.out.println(" ");

					//display the seats	
					for (int i = 0; i < seatNum.length; i++)	
					{
						System.out.println((i + 1) + " " + seatNum[i][0] + " " 
							+ seatNum[i][1] + " " + seatNum[i][2] + " " + seatNum[i][3]);
					}
					System.out.print(seatNum);
				}

				else
				{
					if(seatNum[row][col] == 'X') 
					{
						System.out.println("Error: Invalid seat location, it's occupied");
					}
				}
				if (reserved < 28) 
				{
					System.out.println("Input another reservation(from 1A to 7D), n for exit");
					seatPlace = input.nextLine();
					if (seatPlace.equals("n")) {
						System.out.println("Reservation made, have a nice day.");
						System.exit(0);
					}
				}
			}
		}
	}
}