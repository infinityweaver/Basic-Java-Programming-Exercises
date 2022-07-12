public class PrimeNum
{
	public static void main(String[] args)
	{
		int lineCounter = 0;
		StringBuilder PrimeNum = new StringBuilder();

		for(int i=1; i<=100; i++)
		{
			int counter = 0;

			for(int j=i; j>=1; j--)
			{
				if(i%j==0)
				{
					counter = counter + 1;
				}
			}
			{
				if(counter == 2)
				{
					PrimeNum.append(i).append("\t");
					lineCounter++;
				}
				if(lineCounter == 5)
				{
					PrimeNum.append(System.lineSeparator());
					lineCounter = 0;
				}
			}
		}
		System.out.println(PrimeNum);
	}
} 