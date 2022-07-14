import java.util.*;

public class Prime
{
	public static void main(String[] args)
	{
		ArrayList<Integer> primenumbers = new ArrayList<Integer>();
		primenumbers.add(2);
		for(int i=3; i < 100; i++)
		{
			boolean flag = true;
			for(int p: primenumbers)
			{
				if(i % p == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				primenumbers.add(i);
		}

		//display
		int ctr = 1;
		for(int p: primenumbers)
		{
			System.out.print(p + "\t");
			if(ctr++%5 == 0)
				System.out.println();
		}
	}
}