import java.util.Scanner;
import java.util.*;   
  
public class Repeat    
{    
    static void deleteRepeats(char str[], int length)   
    {     
        int index = 0;   
        int count = 0;

        for (int i = 0; i < length; i++)   
        {   
              
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            if (j == i)    
            {   
                count++;
                str[index++] = str[i];   
            }   
        }   

        System.out.print("String\t:");
        System.out.print("   ");
        System.out.print(String.valueOf(str));
        System.out.print("\n");
        System.out.print("Size\t:");
        System.out.print("   ");
        System.out.print(str.length);

        System.out.print("\n\n");
        System.out.print("After deleting the repeated characters...\n\n");
        System.out.print("String\t:");
        System.out.print("   ");
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));  
        System.out.print("Size\t:");
        System.out.print("   ");
        System.out.print(count);

    }   
     
    public static void main(String[] args)   
    {   
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an array of characters (30 max):\t");
        String info = scan.nextLine();
        int max = info.length();  

        
         if (max <= 30)
        {
            System.out.print("\n\n");
            char str[] = info.toCharArray();    
            int len = str.length;   
            deleteRepeats(str, len);
        } 

        else
        {
            System.out.print("Please Enter not Exceeding 30 Characters");

        } 
    
    }   
}  