import java.util.Scanner;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Scanner scan = new Scanner(System.in);
		String ans = "";
		do
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.print("Enter the amount of change (from 1-99): ");
			ans = scan.nextLine();
			System.out.println("\n" + ans + " cents can be given as");
			int amountLeft = Integer.parseInt(ans);
			int[] amt = computeCoin(25, amountLeft);
			System.out.print(amt[0] + " quarter(s) ");
			amt = computeCoin(10, amt[1]);
			System.out.println(amt[0] + " dime(s) and " + amt[1] + " penny(pennies)\n");
			System.out.print("Do you want to enter another amount? [y|n] ");
			ans = scan.nextLine();
		}while(ans.equals("y"));
	}

	public static int[] computeCoin(int coinValue, int amountLeft)
	{
		//**TODO**//
		if ((amountLeft >= 0) && (amountLeft <= 99))
		{
			int num;

			num = amountLeft / coinValue;
			amountLeft = amountLeft - num * coinValue;

			int cent[] = {num, amountLeft};

			return cent;
		}
		
		else
		{
			System.out.println("Error: Invalid amount, range is from 1 to 99.\n");
		}
		return null;
	}
}