import java.util.Scanner;
public class Permutation
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String userInput = scan.nextLine();

		permutation(userInput);
	}

	public static void permutation(String input)
	{
		permutation("", input);
	}

	public static void permutation(String prefix, String word)
	{
		if(word.isEmpty())
		{
			System.out.println(prefix + word);
		}
		else 
		{
			for(int i = 0; i < word.length(); i++)
			{
				permutation(prefix + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}
}