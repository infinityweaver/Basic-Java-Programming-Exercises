import java.util.*;
public class AirlineTest
{
	public static void main(String[] args)
	{
		int[][] airlineSeats = {{'A','B','C','D'},{'A','B','C','D'},{'A','B','C','D'},{'A','B','C','D'},{'A','B','C','D'},{'A','B','C','D'},{'A','B','C','D'}};
		Scanner input = new Scanner(System.in);
		String yOrN, yes = "y";

		Airline airline = new Airline(airlineSeats);

		do
		{
			airline.displayAirlineSeats();
			airline.inputSeat();
			airline.displayAirlineSeats();
			

			System.out.print("Get another seat? [y|n] ");
			yOrN = input.next();
		
		}while(yes.equals(yOrN.toLowerCase()));
		
	}
}