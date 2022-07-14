import java.util.*;
public class Deleterepeats
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an array of characters (30 max): ");
		String str = s.nextLine();

		ArrayList<Character> text = new ArrayList<Character>();

		System.out.println("string\t: " + str);
		System.out.println("size\t: " + str.length());
		//add char into text (arraylist) if it is not in the list
		for(int i = 0; i < str.length(); i++)
		{
			if(!text.contains(Character.toUpperCase(str.charAt(i))) &&
				!text.contains(Character.toLowerCase(str.charAt(i))))
				text.add(str.charAt(i));
		}

		System.out.println("\nAfter deleting the repeating characters...\n");
		//display all char in the list 'text'
		System.out.print("string\t: ");
		for(char x : text)
			System.out.print(x);
		System.out.println();
		System.out.println("size\t: " + text.size());
	}
}