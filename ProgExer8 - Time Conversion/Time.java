import java.util.*;
public class Time
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int[] time = new int[2];

		boolean flag;
		do
		{
			flag = false;
			System.out.print("Enter time in 24-hr format (hh mm): ");
			for(int i=0; i < 2; i++)
				time[i] = s.nextInt();

			System.out.println();

			//check if time is valid
			//check if hh is between 0-24
			//check if mm is between 0-59
			if((time[0] < 0 || time[0] > 24) ||
			   (time[1] < 0 || time[1] > 59))
			{
				System.out.println("Error: Invalid time value.\nEnter a valid one.");
				flag = true;
			}
		}while(flag);

		System.out.print("It's ");
		String meridian = "";
		//ternary operation = (<cond>)? <val if true> : <val if false>; 
		meridian = (time[0] == 24 || time[0] < 13)? "A.M.":"P.M.";

		if(time[0] == 0 || time[0] == 24)
			time[0] = 12;
		else if(time[0] > 12)
			time[0] %= 12;

		System.out.println(String.format("%02d", time[0]) + ":" + String.format("%02d", time[1]) + " " + meridian);
	}
}