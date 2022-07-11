import java.util.Scanner;
public class CountsNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[16];
		int[] duplicate =  new int[16];

		int j, k, count; 

		System.out.print("Enter 16 numbers [duplicates allowed].");
		for(j = 0; j < arr.length; j++)
		{
			arr[j] = scan.nextInt();
			duplicate[j] = -1;
		}
		System.out.println("\n\tN\tCount");
		for(j = 0; j < arr.length; j++) 
		{
			count = 1;
			for(k = j + 1; k < arr.length; k++)
			{
				if(arr[j] == arr[k])
				{
					count++;
					duplicate[k] = 0;
				}
			}
			if(duplicate[j] != 0);
			{
				duplicate[j] = count;
			}
		}
		for(j = 0; j < arr.length; j++)
		{
			if(duplicate[j] != 0)
			{
				System.out.println("\t" + arr[j] + "\t" + duplicate[j]);
			}
		}
	}
}	