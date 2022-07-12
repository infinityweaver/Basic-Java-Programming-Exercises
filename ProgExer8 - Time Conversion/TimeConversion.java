import java.util.Scanner;

public class TimeConversion
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String continueInput;

		do
		{
			System.out.print("Please Enter time in a 24-hr format(hh:mm): ");
			String inputTime = scan.nextLine();

			String[] timeConvo = inputTime.split(" ");

			int hours = Integer.parseInt(timeConvo[0]);
			String minutes = timeConvo[1];
			String meridian;

			if(hours < 12)
			{
				meridian = "AM";
			}

			else
			{
				meridian = "PM";
			}

			hours %= 12;

			if(hours == 0)
			{
				System.out.println("It's 12:" + " " + minutes +" " + meridian);
			}
			else
			{
				System.out.println("It's " + hours + ":" + minutes +" " + meridian);
			}

			System.out.print("Would you like to converse another time? [y/n]: ");
			continueInput = scan.nextLine();
		}
		while(continueInput.equals("y"));
	}
} 