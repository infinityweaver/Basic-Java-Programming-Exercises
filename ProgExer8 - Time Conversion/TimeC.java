import java.util.Scanner;
public class TimeC
{
    static void convert(String str) 
    {
        // Get Hours
        int h1 = (int) str.charAt(0) - '0';
        int h2 = (int) str.charAt(1) - '0';
        int hh = h1 * 10 + h2;
        // check if the time should be in AM or PM
        String mrdn;
        if (hh < 12)
        {
            mrdn = "AM";
        } else
            mrdn = "PM";
        hh %= 12;
        // Handle 00 and 12 case separately
        if (hh == 0)
        {
            System.out.print("12");
            // Printing minutes and seconds
            for (int i = 2; i < 8; ++i) 
            {
                System.out.print(str.charAt(i));
            }
        }
        else
        {
            System.out.print(hh);
            // Printing minutes and seconds
            for (int i = 2; i < 8; ++i) {
                System.out.print(str.charAt(i));
            }
        }
        // After time is printed print Meridien
        System.out.println(" " + mrdn);
    }
    public static void main(String ar[])
    {
        // 24 hour format
        // The Format of the Input must be HH:MM:SS
        System.out.print("The Format of the Input must be HH:MM:SS\n");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        convert(str);
    }
}