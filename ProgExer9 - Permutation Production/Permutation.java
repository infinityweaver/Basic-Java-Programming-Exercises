import java.util.*;
import java.io.IOException;

public class Permutation
{
    public static void printPermutation(String word, String permutedWord)
    {
        if (word.length() == 0)
        {
            System.out.print(permutedWord + "\t");
        }
 
        for (int i = 0; i < word.length(); i++) 
        {
            char c = word.charAt(i);
            String substr = word.substring(0, i) + word.substring(i + 1);
            printPermutation(substr, permutedWord + c);
        }
    }
 
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Scanner scanner = new Scanner(System.in);

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.print("Enter a word you want to permute: ");
        String word = scanner.nextLine();

        System.out.println("Input: " + word);
        System.out.println("Output: ");

        printPermutation(word, "");
    }
}