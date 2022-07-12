import java.util.Scanner; //library to use Scanner

public class TimeConversion
{
	public static void main(String[] args)
	{
		//Scanner object named scan
		Scanner scan = new Scanner(System.in);
		String continueInput;
		
		//loop if user wants to continue or not
		do
		{

			System.out.print("Enter time in 24-hr format (hh mm): ");
			//asks for input of the time
			String inputTime = scan.nextLine();

			//splits the inputTime to a String array
			String[] timeConvo = inputTime.split(" ");

			//splits timeConvo into two variables
			int hours = Integer.parseInt(timeConvo[0]);
			String minutes = timeConvo[1];
			String meridian;

			//condition if merdian is AM or PM
			if(hours < 12 || hours == 24)
			{
				meridian = "AM";//sets the meridian to AM
			}

			else
			{
				meridian = "PM";//set the meridian to PM
			}

			hours %= 12; //changes the value of hours to the answer of equation hours modulo 12


			if(hours == 0) // condition if hours % 12 is equal to 0
			{
				System.out.println("It's 12:" + " " + minutes +" " + meridian);
			}

			else //condition if not.
			{
				System.out.println("It's " + hours + ":" + minutes +" " + meridian);
			}

			//asks if user wants to input again
			System.out.print("Continue to input another time? [y/n]: ");
			continueInput = scan.nextLine();

		}while(continueInput.equals("y"));//continues if continueInput is equal to "y";

	}
}