import java.util.*;


public class TimeConversion
{
	public static void main (String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		String ans;  
		
		do
		{
			System.out.print("Enter time in 24-hr format (hh mm): \n");


		//Hour
			String time = sc.nextLine();

		
			String[] convo = time.split(" ");

		
			int hrs = Integer.parseInt(convo[0]);
			String mins = convo[1];
			String meridiem;

			if(hrs > 11)
			{
				meridiem = "PM"; 
					if(hrs > 12)
						hrs -= 12;
			}

			else
			{
				meridiem = "AM";
				if(hrs == 0)
					hrs = 12;
			}

			hrs %= 12;

			if(hrs == 0)
			{
				System.out.println("It's 12:" + " " + mins + " " + meridiem);
			}
			else
			{
				System.out.println("It's " + hrs + ":" + mins + " " + meridiem);
			}

			System.out.print("Continue to input another time? [y/n]: ");
			ans = sc.nextLine();

		}while(ans.equals("y"));
		
	}
}