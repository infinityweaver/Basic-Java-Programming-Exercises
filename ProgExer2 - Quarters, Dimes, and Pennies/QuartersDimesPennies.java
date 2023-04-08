import java.util.*;
public class QuartersDimesPennies
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] coinValue = {25, 10, 1};
		int[] coinDenomination = new int[3];
		int[] arrchange = new int[2];
		int amountOfChange;
		String yesOrNo = "y";
		
		do 
		{
			System.out.print("\nEnter the amount of change (from 1-99): ");
			amountOfChange = input.nextInt();
			if(amountOfChange > 100 || amountOfChange < 1)
			{
				System.out.println("Error: Invalid amount, range is from 1 to 99.");
				continue;
			}
			int temp = amountOfChange;
			for(int i = 0; i < coinValue.length; i++)
			{
				arrchange = computeCoin(coinValue[i],amountOfChange);
				amountOfChange = arrchange[1];
				coinDenomination[i] = arrchange[0];
			}
			System.out.println(temp + " cents can be given as");
			System.out.printf("%d quarter(s) %d dime(s) %d penny(pennies)\n\n",coinDenomination[0],coinDenomination[1], coinDenomination[2]);
			System.out.print("Do you want to enter another amount? [y|n]");
			input.nextLine();
			yesOrNo = input.nextLine();
			
		}while(yesOrNo.equalsIgnoreCase("y"));
	}

	public static int[] computeCoin(int coinValue, int amountLeft)
	{
		int[] arr = new int[2];
		int number = amountLeft;
		if((coinValue > 0 && coinValue < 100) && (amountLeft >= 0 && amountLeft < 100))
		{
			number /= coinValue;
			amountLeft %= coinValue;
			arr[0] = number;
			arr[1] = amountLeft;
			return arr;
		}
		return arr;
	}
}
