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

/*
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args)
	{
		
		int count = 0;
		List<Integer> prime = new ArrayList<Integer>();
		prime.add(2);

		for(int i=3; i<=100; i++)
		{
			boolean flag = true;
			for(int j=0; j<prime.size(); j++)
			{
				if(i%prime.get(j)==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				prime.add(i);
			}

		}
		for(int x:prime)
		{
			System.out.print(x + "\t");
			count++;
			if(count%5==0)
			{
				System.out.println();
			}
		}

	}
}
*/


















/* Another created version (just minor tweaks)
class Main
{
	public static void main(String[] args)
	{
		int count=0 ,i , j;
		for(i=1; i<=100; i++)
		{
			for(j=i-1; j>1; j--)
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
				System.out.print(count%5==0? '\n': ' ');
			}
		}
	}	
}

*/


/* created another version, with method
class PrimeNumbers
{
	public static void main(String[] args)
	{
		int count=0 ,i;
		for(i=1; i<=100; i++)
		{
			if(primeOrNot(i)==true)
			{
				count++;
				System.out.print(i + "\t");
				System.out.print(count%5==0? '\n': ' ');
			}
		}
	}	


	public static boolean primeOrNot(int i)
	{
		boolean prime = false;
		for(int j=i-1; j>1; j--)
		{
			if(i%j==0)
			{
				return prime;
			}
		}
		return (i==1? prime: !prime);
	}
}
*/

/* Last version haha (added another method lol)
class Main
{
	public static void main(String[] args)
	{
		int count=0 ,i;
		for(i=1; i<=100; i++)
		{
			if(primeOrNot(i)==true)
			{
				count++;
				primePrint(count,i);
			}
		}
	}	


	public static boolean primeOrNot(int i)
	{
		boolean prime = false;
		for(int j=i-1; j>1; j--)
		{
			if(i%j==0)
			{
				return prime;
			}
		}
		return (i==1? prime: !prime);
	}

	public static void primePrint(int count, int i)
	{
		System.out.print(i + "\t");
		System.out.print(count%5==0? '\n': ' ');
	}
}
*/