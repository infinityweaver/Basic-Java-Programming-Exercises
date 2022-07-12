import java.util.Scanner;
public class Change
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Scanner x = new Scanner(System.in);

		int amount = 0;
		char option;
		do
		{	System.out.println("Enter the amount of change (from 1-99): ");
			amount = scanner.nextInt();

			if(checkInput(amount))
			{
				System.out.println(amount + " cents can be given as: " + "\n");
				computeCoin(amount);
			}

			System.out.println("Would ypu still like to perform another convesion? Y/N");
			option = x.next().charAt(0);
		}
		while(option == 'y' || option == 'Y');
	}

	public static void computeCoin(int amount)
	{
		int pennies = amount;
		int dime;
		int quarter;

		if(amount < 10)
		{
			System.out.println(pennies + " pennie(s).\n");
		}
		else if(amount >= 10 && amount < 25)
		{
			dime = amount / 10;
			pennies = pennies - (dime * 10);
			System.out.println(dime + " dime(s) and " + pennies + " pennie(s).\n");
		}
		else if(amount >= 25)
		{
			quarter = amount / 25;
			pennies = pennies - (quarter * 25);
			dime = pennies / 10;
			pennies = pennies - (dime * 10);
			System.out.println(quarter + " quarter(s), " + dime + " dime(s), and " + pennies + " pennie(s).\n");
		}
	}

	public static boolean checkInput(int amount)
	{

		boolean isValid = true;

		if(amount < 1 || amount > 99)
		{
			System.out.println("Amount between 1 and 99 (inclusive): " + amount + "\n");
			isValid = false;	
		}

		System.out.println("\n");

		return isValid;
	}
}