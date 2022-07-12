import java.util.*;
import java.io.IOException;

public class NumberCounter
{
  public static void main(String[] args) throws IOException, InterruptedException
  {
    String num;

    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter 16 numbers [duplicates allowed]: ");
    
    num = scanner.nextLine();
    System.out.println();
    
    String[] string = num.split(" ");
    int[] numbers = new int[string.length];

    for(int i = 0; i < string.length; i++)
    {
      numbers[i] = Integer.parseInt(string[i]);
    }

    System.out.println("\tN \tCount");
    
    for(int i = 0; i < numbers.length; i++)
    {
      for(int j = i; j < numbers.length; j++)
      {
        if (numbers[i] < numbers[j])
        {
          int temp;
          temp = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = temp;
        }
      }
    }

    int prev = numbers[0];
    int counter = 0; 
  
    for(int i = 0; i < numbers.length; i++)
    {
      if(numbers[i] != prev)
      {
        System.out.println("\t" + prev + "\t" + counter);
        prev = numbers[i];
        counter = 0;
      }
      counter++;
    }
    System.out.println("\t" + prev + "\t" + counter);
  }
}


