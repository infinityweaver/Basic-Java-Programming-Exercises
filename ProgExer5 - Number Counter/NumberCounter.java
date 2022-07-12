import java.util.Scanner;

public class NumberCounter
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Array/Number Size(ex. 1-15): ");
        int size = input.nextInt();

        int[]Array = new int[30];

        System.out.println("Enter Numbers you wish to count(duplicates allowed):");

        for(int i =0; i<size; i++)
        {
            Array[i]=input.nextInt();
        }

        for(int j = 0; j<size; j++)
        {

            int mini = Array[j];
            int mini_index = j;

            for(int i = j; i<size; i++)
            {
                if(Array[i] < mini)
                {
                    mini = Array[i];
                    mini_index = i; 
                }
            }
            int tmp = Array[j];
            Array[j] = Array[mini_index];
            Array[mini_index] = tmp;
        }

        System.out.println("\t"+"N"+ "\t" + "Count");
        
        for(int i=0; i<size; i++)
        {

            int key = Array[i];
            int counter = 0;

            for(int j=i; j<size; j++)
            {
                if(key == Array[j])
                {
                    counter++;
                }
            }

            if(counter > 0 )
            {
                System.out.println("\t"+Array[i]+"\t"+counter);
            }
        }
    }
}