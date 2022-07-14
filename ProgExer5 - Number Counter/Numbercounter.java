import java.util.*;
public class Numbercounter
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		System.out.println("Enter 16 numbers [duplicates allowed].");
		while(numbers.size() < 16)
		{
			numbers.add(s.nextInt());
		}
		Collections.sort(numbers, Collections.reverseOrder());

		System.out.println("\tN\tCount");
		int n = numbers.get(0), ctr = 0;
		for(int i : numbers)
		{
			if(i != n)
			{
				System.out.println("\t" + n + "\t" + ctr);
				n = i;
				ctr = 1;
			}
			else
				ctr++;
		}
		System.out.println("\t" + n + "\t" + ctr);
	}
}