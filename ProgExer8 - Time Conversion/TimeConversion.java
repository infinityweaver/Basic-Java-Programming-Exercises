import java.util.Scanner;

public class TimeConversion
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String proceed;
        
        do
        {

            System.out.print("Enter time in 24-hr format (hh mm): ");
            String inputTime = scan.nextLine();

            String[] time = inputTime.split(" ");

            int hours = Integer.parseInt(time[0]);
            String mins = time[1];
            String dayTime;

            if(hours < 12)
            {
                dayTime = "AM";
            }
            else
            {
                dayTime = "PM";
            }
            hours %= 12;


            if(hours == 0) 
            {
                System.out.println("It's 12:" + " " + mins +" " + dayTime);
            }
            else
            {
                System.out.println("It's " + hours + ":" + mins +" " + dayTime);
            }

            System.out.print("\n" + "Continue to input another time? [y|n]: " );
            proceed = scan.nextLine();

        }while(proceed.equals("y"));
    }
}
