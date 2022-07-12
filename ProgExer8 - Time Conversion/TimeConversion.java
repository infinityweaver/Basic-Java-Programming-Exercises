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

	String[]timeCo = inputTime.split("");

	int hours = Integer.parseInt(timeCo[0]);
	String minutes = timeCo[1];
	String meridian;


	if(hours < 12)
	{
	   meridian = "AM";
	}


	else
	{
	  meridian = "PM";
	}

	
	hours %= 12;

	if(hours == 0)
	{
	System.out.println("It's 12" + " " +  minutes +" " + meridian);
	}


	else
	{
	System.out.println("It's" + hours + " "+ minutes + " "+ meridian);
	}


	System.out.print("Continue to input another time?[y|n]:");
	conIn = scan.nextLine();
	}


	while(conIn.equals("y"));
	}
}