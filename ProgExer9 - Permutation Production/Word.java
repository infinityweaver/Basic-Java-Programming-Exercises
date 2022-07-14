import java.util.*;

public class Word
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList<String> allPermutations = new ArrayList<String>();

		String text = s.nextLine();
		permute(allPermutations, text, 0, text.length()-1);

		int ctr = 1;
		for(String str : allPermutations)
		{
			if(ctr % 6 == 0)
				System.out.println();
			else
				System.out.print(str+"\t");
		}
	}

	private static void permute(ArrayList<String> allPermutations, String str, int l, int r) 
    { 
        if (l == r)
        {
        	if(!allPermutations.contains(str))
            	allPermutations.add(str); 
        }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(allPermutations, str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    }

    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    }
}