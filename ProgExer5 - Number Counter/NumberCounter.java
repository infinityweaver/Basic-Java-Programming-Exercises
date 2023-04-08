import java.util.*;
public class NumberCounter
{
	public static void main(String[] args)
	{
		int[] inputNumbers = new int[16];
		List<Integer> uniqueNumbers = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);

		int count = 0;

		System.out.println("Enter 16 numbers [duplicates allowed].");
		while(count < 16)
		{
			inputNumbers[count] = input.nextInt();
			count++;
		}

		uniqueNumbers.add(inputNumbers[0]);

		//finding unique elements in inputNumbers and storing it to the uniqueNumbers List
		for(int i=1; i<16; i++)
		{
			if(uniqueNumbers.get(0) != inputNumbers[i])
			{
				for(int j=0; j<uniqueNumbers.size(); j++)
				{
					if(inputNumbers[i] == uniqueNumbers.get(j))
						break;
					else if(j == uniqueNumbers.size() - 1)
						uniqueNumbers.add(inputNumbers[i]);
				}
			}
		}

		Collections.sort(uniqueNumbers);
		Collections.reverse(uniqueNumbers);

		System.out.printf("\n\tN\tCount\n");
		for(int i=0; i<uniqueNumbers.size(); i++)
		{
			count = 0;
			for(int j=0; j<16; j++)
			{
				if(uniqueNumbers.get(i) == inputNumbers[j])
					count++;
			}
			System.out.printf("\t%d\t%d\n",uniqueNumbers.get(i), count);
		
		}
	}
}