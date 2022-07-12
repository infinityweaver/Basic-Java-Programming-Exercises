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
		int[] data = new int[x.length];

		for(int i = 0; i < x.length; i++)
		{
			data[i] = Integer.parseInt(x[i]);
		}

		System.out.println("\tN \tCount");
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = i; j < data.length; j++)
			{
				if (data[i] < data[j])
				{
					int temp;
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

		int prev = data[0];
		int count = 0; 
	
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] != prev)
			{
				System.out.println("\t" + prev + "\t" + count);
				prev = data[i];
				count = 0;
			}
			count++;
		}
		System.out.println("\t" + prev + "\t" + count);
	}
}




























	