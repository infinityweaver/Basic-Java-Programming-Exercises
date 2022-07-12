import java.util.*;

public class DeleteRepeats
{
	public static void main(String[] args)
	{

		System.out.print("\nEnter an array of characters (30 max): ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); 

      //check if the input characters is less than 30
		if(input.length()>30)
		{
			System.out.println("\nOut of bounds, 30 characters only.\n");
			return;
		}

      //counts each character except space 
		int count = 0;       
		for(int i = 0; i < input.length(); i++) {    
			if(input.charAt(i) != ' ')    
				count++;   
		}

      //print the user input character(s) and size
		System.out.println("\nString\t:" + input);
		System.out.println("Size\t:" + count);


      //counts characters after deleting repetitions
		int newcount = 0;    
		for(int i = 0; i < deleteRepeats(input).length(); i++) {    
			if(deleteRepeats(input).charAt(i) != ' ')    
				newcount++;   
		}

	  //print the new character after deletion
		System.out.println("\nAfter deleting the repeating characters..." );
		System.out.println("\nString\t:" + deleteRepeats(input));
		System.out.println("Size\t:" + newcount + "\n");
	}

	public static String deleteRepeats(String input)
	{
		String newInput = "";
		
	  //check the length of the character
		for(int i = 0; i < input.length(); i++)
		{	
			//check each character inputed
			char ch = input.charAt(i);
			if(newInput.indexOf(ch)==-1)	//if character exists, it will be deleted
				
			{
				newInput += ch;		//add the unrepeated character to newInput	
			}
		}
		return newInput;
	}
}