public class PermutationProduction
{
 
    // Function to print all the permutations of str
    static void printPermutation(String word, String answer)
    {
 
        // If string is empty
        if (word.length() == 0) 
        {
            System.out.print(answer + " ");
            return;
        }
 
        for (int index = 0; index < word.length(); index++) 
        {
 
            // ith character of str
            char ch = word.charAt(index);
 
            // Rest of the string after excluding
            // the ith character
            String ros = word.substring(0, index) +
            word.substring(index + 1);
 
            // Recursive call
            printPermutation(ros, answer + ch);
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String word = "what";
        printPermutation(word, "");
    }
}