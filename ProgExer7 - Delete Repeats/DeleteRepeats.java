import java.util.Scanner;

public class DeleteRepeats
{
	public static void main(String[] args)
	{
		Scanner string = new Scanner(System.in);
		System.out.print("Enter an array of characters (30 max): ");
		String str = string.nextLine();
		String[] num = str.split("");
		String choice;

			if(num.length <= 30)
			{

				System.out.print("\nstring:");
				for(int i = 0; i < num.length; i++)
				{
					System.out.print(num[i]);
				}
				int count = 0;

				for(int i = 0; i < num.length; i++)
				{
					count++;
				}

				System.out.println("\nsize: "+count);
				System.out.println("\nAfter deleting the repeating characters...");

				String result = removeDup(str);
				System.out.print("\nstring: ");
				System.out.println(result);

				count = 0;

				String[] afterNum = result.split("");
				for(int i = 0; i < afterNum.length; i++)
				{
					count++;
				}
				System.out.println("size: "+count);
			}

			else
			{
				System.out.print("\nYour input exceeds 30 characters.");
			}

	}

	public static String removeDup(String str) 
	{
        String result = "";
        for(int i = 0; i < str.length(); i++)
        {
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);
        }
        return result;
    }
}