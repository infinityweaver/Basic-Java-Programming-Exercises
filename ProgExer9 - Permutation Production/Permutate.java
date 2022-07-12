import java.util.Scanner;

public class Permutate
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print( "\n" +"Enter string: ");
		String str = scan.nextLine();

		int length = str.length();
		Permutate per = new Permutate();
		per.permutation(str,0,length-1);
	}

	public void permutation(String str, int si, int li)
	{
		if(si==li)
		System.out.println(str);

		else
		{
			for(int i = si; i <= li; i ++)
			{
				str = swapChar(str,si,li);
				permutation(str,si+1,li);
				str = swapChar(str,si,i);
			}
		}
	}

	public String swapChar(String str, int i, int j)
	{
		char temp;
		char[] chArray= str.toCharArray();
		temp = chArray[i];
		chArray[i] = chArray[j];
		chArray[j] = temp;

		return String.valueOf(chArray);
	}
}