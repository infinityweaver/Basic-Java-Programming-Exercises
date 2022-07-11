import java.util.Scanner;

public class TimeConversion
{
	public static void main(String[] args)

	{
	Scanner scan =new Scanner(System.in);

	String conIn;

	do
	{

	System.out.print("Enter time in 24-hr format(hh mm):");
	String inputTime = scan.nextLine();

	String[]timeConv = inputTime.split("");

	int hrs = Integer.parseInt(timeConv[0]);
	String mins = timeConv[1];
	String meridian;


	if(hrs <12)
	{
	meridian = "AM";
	}


	else
	{
	meridian = "PM";
	}

	
	hrs %= 12;

	if(hrs == 0)
	{
	System.out.println("It's" + hrs+ ":"+ mins+ ""+ meridian);
	}


	else
	{
	System.out.println("It's" + hrs+ ":"+ mins+ ""+ meridian);
	}


	System.out.print("Continue to input another time?[y|n]:");
	conIn = scan.nextLine();
	}


	while(conIn.equals("y"));
	}
}