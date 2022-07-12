public class WordPermutation
{
 
    public static void printPermutation(String word, String answer)
    {
 
        if (word.length() == 0) 
        {
            System.out.print(answer + " ");
            return;
        }
 
        for (int index = 0; index < word.length(); index++) 
        {
 
            char ch = word.charAt(index);
 
            String ro = word.substring(0, index) + word.substring(index + 1);
 
            printPermutation(ro, answer + ch);
        }
    }
 
    public static void main(String[] args)
    {
        String word = "World";
        printPermutation(word, "");
    }
}