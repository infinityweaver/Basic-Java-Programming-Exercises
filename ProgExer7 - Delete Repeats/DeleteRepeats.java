import java.util.Scanner;
import java.util.*;

public class DeleteRepeats
{
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		String again;

		do
		{
			 System.out.print("Enter an array of charcters (30 max): ");
			 String info = scan.nextLine();

			 char str[] = info.toCharArray();
			 int len = str.length;

			 if (len <= 30)
			 {

			 System.out.println("String: " + info );
			 System.out.println("Size: " + len );

			 System.out.println("After deleting repeating characters... ");
			 deleteRepeats(str, len);

			}

			else
			{

				System.out.println("Input exceeds max number of charcters.");
			}

			System.out.print("Enter again?[y/n] ");
			again = scan.nextLine();
		}
		while(again.equals("y"));

	}


	public static void deleteRepeats(char str[], int len)
	{

		int index = 0;
		int count = 0;

		for (int i = 0; i < len; i++)

		{
			int j;

			for (j = 0; j < i; j++)

			{
				if (str[i] == str[j])

				{

					break;

				}
			}

			if (j == i)

			{
		
				count++;
				str[index++] = str[i];

			}
		}

		System.out.print("String: ");
		System.out.println(String.valueOf(Arrays.copyOf(str, index)));
		System.out.print("Size: ");
		System.out.print(count);

	}

}