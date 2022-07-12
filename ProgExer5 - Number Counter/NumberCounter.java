import java.util.*;

public class NumberCounter
{
	public static void main(String[] args)
	{
		String num;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 16 numbers [duplicates allowed]: ");
		
		num = sc.nextLine();
		System.out.println();
		
		String[] input = num.split(" ");
		int[] data = new int[input.length];

		for(int i = 0; i < input.length; i++)
		{
			data[i] = Integer.parseInt(input[i]);
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