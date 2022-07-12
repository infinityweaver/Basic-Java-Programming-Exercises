import java.util.*;
import java.io.IOException;

public class NumberCounter
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		String numbers;

		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 16 numbers [duplicates allowed]: ");
		
		numbers = scanner.nextLine();
		System.out.println();
		
		String[] x = numbers.split(" ");
		int[] num = new int[x.length];

		for(int i = 0; i < x.length; i++)
		{
			num[i] = Integer.parseInt(x[i]);
		}

		System.out.println("\tN \tCount");
		
		for(int i = 0; i < num.length; i++)
		{
			for(int j = i; j < num.length; j++)
			{
				if (num[i] < num[j])
				{
					int temp;
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		int prev = num[0];
		int count = 0; 
	
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] != prev)
			{
				System.out.println("\t" + prev + "\t" + count);
				prev = num[i];
				count = 0;
			}
			count++;
		}
		System.out.println("\t" + prev + "\t" + count);
	}
}




























	