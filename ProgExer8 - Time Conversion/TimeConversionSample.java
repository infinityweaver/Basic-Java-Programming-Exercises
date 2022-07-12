import java.util.*;


public class TimeConversionSample
{
	public static void main (String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		String ans;  //Choice if the user wants to input again
		
		do
		{
			System.out.print("Enter time in 24-hr format (hh mm): \n");


		//Hour input
			String time = sc.nextLine();

		//time will be split into string arr
			String[] convo = time.split(" ");

		//splits hour and minutes into two variables
			int hrs = Integer.parseInt(convo[0]);
			String mins = convo[1];
			String meridiem;

		//condition to determine meridiem
		if(hrs > 12 || hrs == 12)
			{
				meridiem = "AM";//sets the meridian to AM
			}

			else
			{
				meridiem = "PM";//set the meridian to PM
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