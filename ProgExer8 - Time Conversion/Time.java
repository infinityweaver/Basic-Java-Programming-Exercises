import java.util.Scanner;
public class Time
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String continueInput;

        do
        {

            System.out.print("Enter time in 24-hr format (hh mm): ");
            //asks for input of the time
            String inputTime = scan.nextLine();

            String[] timeCo = inputTime.split(" ");

            int hours = Integer.parseInt(timeCo[0]);
            String minutes = timeCo[1];
            String meridian;

            
            if(hours < 12)
            {
                meridian = "A.M";
            }

            else
            {
                meridian = "P.M";
            }

            hours %= 12;


            if(hours == 0) 
            {
                System.out.println("It's 12" + " " + minutes +" " + meridian); 
            }

            else
            {
                System.out.println("It's " + hours + " " + minutes +" " + meridian);
            }

            System.out.print("Continue to input another time? [y/n]: ");
            continueInput = scan.nextLine();

        }while(continueInput.equals("y"));

    }
}