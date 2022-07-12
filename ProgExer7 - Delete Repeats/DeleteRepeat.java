import java.util.*;
import java.util.Scanner;


class DeleteRepeat
{
  static String deleteRepeats(char originalString[], int n)
  {
    int index = 0;

    for (int i = 0; i < n; i++)
    {

      int j;
      for (j = 0; j < i; j++)
      {
        if (originalString[i] == originalString[j])
        {
          break;
        }
      }
      
      if (j == i)
      {
       
        originalString[index++] = originalString[i];
      }
    }
    return String.valueOf(Arrays.copyOf(originalString, index));

  }

  public static void main(String[] args)
  {
    Scanner scan =  new Scanner(System.in);
    System.out.print("Enter an array of characters (30 max):  ");
    String text = scan.nextLine();
    char originalString[] = text.toCharArray();
    int n = originalString.length;

    if( originalString.length <= 30)
    {
      System.out.println("\nString \t :  " + String.valueOf(originalString));
      System.out.println("Size \t :  " + originalString.length  + "\n");
      System.out.println("After deleting the repeated characters..\n");
      System.out.println("String \t :  " + deleteRepeats(originalString, n));    
      System.out.println("String \t :  " + deleteRepeats(originalString, n).length());
    }
    else
    {
      System.out.print("Please enter an array of characters 30 max!");
    }

  }
}