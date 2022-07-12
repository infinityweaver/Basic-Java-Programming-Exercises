public class PrimeNumber
{
	public static void main(String[] args)
	{
		int lineCounter = 0, count = 0;
		for(int i = 2; i <= 100; i++)
		{
			count = 0;
			boolean isPrime = true;
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}	
			}
			if(isPrime)
			{
				count++;
				if(count == 2 || lineCounter != 5)
				{
						System.out.print(i + "\t");
						lineCounter++;
				}
					else
					{
						System.out.println();
						System.out.print(i + "\t");
						lineCounter = 0;
						lineCounter++;
					}
			}
		}
	}
}