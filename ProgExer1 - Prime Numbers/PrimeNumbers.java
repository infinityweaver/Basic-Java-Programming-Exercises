public class PrimeNumbers
{
	public static void main(String[] args)
	{
		int start;
		int end = 100;
		int count;
		int lineCounter = 0;
		
		for(start = 2; start <= end; start++)
		{
			count = 0;
			for(int i = 1; i <= start; i++)
			{
				if(start % i == 0)
				{
					count++;
				}
			}

				if(count == 2)
					if(lineCounter != 5)
					{
						System.out.print(start + "\t");
						lineCounter++;
					}
					else
					{
						System.out.println();
						System.out.print(start + "\t");
						lineCounter = 0;
						lineCounter++;
					}

					
		}
	}
}