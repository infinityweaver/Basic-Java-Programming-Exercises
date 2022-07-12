import java.util.*;
import java.io.IOException;

public class DeleteRepeats
{
	static void deleteRepeats(String originalString)
	{
		String deletedRepeatChars = new String();   

        int length = originalString.length();   
            
        for (int i = 0; i < length; i++)    
        {   
            char charAtPosition = originalString.charAt(i);   
            if (deletedRepeatChars.indexOf(charAtPosition) < 0)   
            {   
                deletedRepeatChars += charAtPosition;   
            }   
        }
        System.out.println("\nstring\t: " + deletedRepeatChars);
		System.out.println("size\t: " + deletedRepeatChars.length());
	}

	public static void main(String[] args) throws IOException, InterruptedException
	{
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an array of characters (30 max): ");
		String originalString = scanner.nextLine();
		System.out.println();

		System.out.println("string\t: " + originalString);
		System.out.println("size\t: " + originalString.length() + "\n");

		System.out.println("After deleting the repeating characters...");

		deleteRepeats(originalString);

		
	}
}