import java.util.*;
public class DeleteRepeats
{	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter an array of characters (30 max): ");
		String word = input.next();
		System.out.println("\nstring: " + word + "\nsize: " + word.length());
		System.out.println("\nAfter deleting the repeating characters...\n");
		System.out.println("string: " + deleteRepeats(word) +"\nsize: " + deleteRepeats(word).length());
		
	}


	public static String deleteRepeats(String originalString)
	{
		char[] arrChar = new char[30];
		arrChar[0] = originalString.charAt(0);
		int count = 1;

		for(int i=1; i<originalString.length(); i++)
		{
			if(originalString.charAt(0) != originalString.charAt(i))
			{
				for(int j=0; j<arrChar.length; j++)
				{
					if(originalString.charAt(i) == arrChar[j])
						break;
					else if(j == arrChar.length-1)
					{
						arrChar[count] = originalString.charAt(i);
						count++;
					}
					
				}
			}
		}
		String uniqueChars = "";
		for(int i=0; arrChar[i] != '\0'; i++)
		{
			uniqueChars += arrChar[i];
		}
		return uniqueChars;
	}	
}
