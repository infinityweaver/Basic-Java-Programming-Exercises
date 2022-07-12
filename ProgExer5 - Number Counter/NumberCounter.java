import java.util.Scanner;

public class NumberCounter
{
	public static void main(String[] args)
	{
		
		int count = 1;
		int occur = -1;
		String number;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 16 numbers [duplicates allowes]. ");
		number = scan.nextLine();

		String[] t = number.split(" ");
		int[] num = new int[t.length];

		for(int i = 0; i < t.length; i++ )
		{
			num[i] = Integer.parseInt(t[i]);
		}

		int temp = 0;

		for(int i = 0; i < t.length; i++)
		{
			for(int n = i+1; n < t.length; n++)
			{
				if(num[i] < num[n])
				{
					temp = num[i];
					num[i] = num[n];
					num[n] = temp;
				}
			}
		}

		System.out.println("\n\t" + " N \t Count");

		for( int i = 0; i < t.length; i++)
		{
			for(int n = i + 1 ; n < t.length; n++)
			{
				if(num[i] == (num[n]))
				{
					count += 1;
					num[n] = occur;
				}
			}

			if(num[i] == occur)
			{
				continue;
			}
			else
			{
				System.out.println("\t" + num[i] + "\t" + count);
			}

			count = 1;
		}
	}
}