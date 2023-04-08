class PrimeNumbers
{
	public static void main(String[] args)
	{
		int count=0 ,i , j;
		for(i=1; i<=100; i++)
		{
			for(j=i-1; j>i/2; j--)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==1)
			{
				count++;
				System.out.print(i + "\t");
				if(count%5==0)
				{
					System.out.println();
				}
			}
		}
	}	
}

