public class PrimeNumbers
{
	public static void main (String[] args)
	{
		int i;
		int numbersPerLine = 0;

		for (i = 1; i <= 100; i++)
		{
			if (isPrime(i) == true)
			{
				System.out.print(i + "\t");
				numbersPerLine++;
			}
			if (numbersPerLine == 5)
			{
				numbersPerLine = 0;
				System.out.println();
			}
		}
	}

public static boolean isPrime(int x)
	{
		if (x <= 1)
			return false;

		for (int i = 2; i < x; i++)
		{
			if (x % i == 0)
				return false;
		}
		return true;
	}
} 