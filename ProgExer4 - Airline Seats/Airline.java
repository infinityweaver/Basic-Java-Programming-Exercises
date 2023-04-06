import java.util.*;
public class Airline
{
	
	int[][] airlineSeats;
	public Airline(int[][] airlineSeats)
	{
		this.airlineSeats = airlineSeats;
	}
	
	public void displayAirlineSeats()
	{
		System.out.println();
		for(int i=0; i<this.airlineSeats.length; i++)
		{
			System.out.print((i+1) + " ");
			for(int j=0; j<this.airlineSeats[0].length; j++)
			{
				System.out.printf("%c ", this.airlineSeats[i][j]);
			}
			System.out.println();
		}
	}

	public boolean isSeatAvailable(int seatNumber, char seatChar)
	{
		if(this.airlineSeats[seatNumber-1][this.letterToArrayNum(seatChar)] != 'X')
			return true;
		else 
			return false;
	}

	public void pickSeat(int seatNumber, char seatChar)
	{
		if((seatNumber > 7 ||  seatNumber < 1) || (Character.toUpperCase(seatChar) < 'A' || Character.toUpperCase(seatChar) > 'F'))
		{
			System.out.println("Error: Invalid input. (Range is 1A - 7D).");
			this.displayAirlineSeats();
			this.inputSeat();
		}
		else if(this.isSeatAvailable(seatNumber, seatChar))
			this.airlineSeats[seatNumber-1][letterToArrayNum(seatChar)] = 'X';
		else	
		{
			System.out.println("Error: Invalid seat location, it's occupied.");
			this.displayAirlineSeats();
			this.inputSeat();
		}
	}

	public int letterToArrayNum(char seatChar)
	{
		switch(seatChar)
		{
			case 'A':
				return 0;
			case 'B':
				return 1;
			case 'C':
				return 2;
			case 'D':
				return 3;
		}
		return -1;
	}

	public void inputSeat()
	{
		System.out.print("\nPlease choose an unoccupied seat location (from 1A to 7D): ");
		Scanner scanner = new Scanner(System.in);
		String seatLocation;

		seatLocation = scanner.next();
		
		pickSeat(Character.getNumericValue(seatLocation.charAt(0)), Character.toUpperCase(seatLocation.charAt(1)));
	}	
}

