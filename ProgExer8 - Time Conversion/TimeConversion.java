import java.util.Scanner;
public class TimeConversion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String continueInput;


	do
	{
		System.out.print("Enter time in 24-hour format (hh:mm) : ");
		String number = input.nextLine().trim();
		String hour = number.substring(0, number.indexOf(":"));
		String min = number.substring(number.indexOf(":") + 1);
		int hourInteger = Integer.parseInt(hour);
		int hour1 = Integer.parseInt(hour);

		if(hourInteger > 12 && hourInteger < 24)
		{
			hourInteger = hourInteger - 12;
		}
		else if(hourInteger == 24)
		{
			hourInteger = hourInteger - 12;
		}
		else if(hourInteger == 0)
		{
			hourInteger += 12;
		}
		else if(hourInteger < 0 || hourInteger > 24)
		{
			System.out.println("Invalid time value");
		}

		if(hour1 >= 0 && hour1 < 12)
		{
			System.out.println("It's : "+ hourInteger + ":" + min + " AM");
		}
		else if(hour1 == 24)
		{
			System.out.println("It's : "+ hourInteger + ":" + min + " AM");
		}
		else
		{
			System.out.println("It's : " + hourInteger + ":" + min + " PM");
		}

		System.out.print("Continue to input another time? [y/n]: ");
		continueInput = input.nextLine();
		System.out.print("\n");
	}
	while(continueInput.equals("y"));

	}
}