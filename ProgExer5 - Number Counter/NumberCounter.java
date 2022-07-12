import java.util.Scanner;
public class NumberCounter
{
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5,6,7,8,8,7,6,5,4,3,2,1};
		int temp;
		int [] ctr = new int[50];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 16 numbers [duplicates allowed].");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr [i] + " ");
		}
		
		for (int i = 0; i < arr.length; i++) 
        {     
            temp = arr[i];
            ctr[temp]++;
        }

        System.out.printf("\n\tN\tCount\n");
        for(int i = 0; i < ctr.length; i++)
        {
        	if(ctr[i] > 0 && ctr[i] == 1)
        	{
        		System.out.printf("\t%d\t%d\n",i, ctr[i]);
        	}
        	else if(ctr[i] >= 2)
        	{
        		System.out.printf("\t%d\t%d\n",i, ctr[i]);
        	}
        }   
	}
}