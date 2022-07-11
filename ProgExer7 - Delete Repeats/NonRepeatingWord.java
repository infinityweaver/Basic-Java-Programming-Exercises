import java.util.Scanner;
public class NonRepeatingWord
{
	public static void main(String[] args)
	{
		System.out.print("Enter an array of characters (30 max): ");
		Scanner scan = new Scanner(System.in);
		String array[] = new String[30];
		String originalString = scan.nextLine();
		System.out.println();
		System.out.print("string\t: " + originalString +"\n");
		System.out.println("size\t: " + originalString.length());
		System.out.println("After deleting the repeating characters... ");
		System.out.println();
		System.out.println("string\t: " + deleteRepeats(originalString));
		System.out.println("size\t: " + deleteRepeats(originalString).length());
	}
	public static String deleteRepeats(String originalString)
	{
		String removedString = "";
		for(int i = 0; i < originalString.length(); i++)
		{
			char ch = originalString.charAt(i);
			if(removedString.indexOf(ch) == -1)
			{
				removedString += ch;
			}
		}
		return removedString;
	}
}