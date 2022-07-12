import java.util.*;
import java.io.IOException;

public class TimeConversion
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		char ans = 'n';
		String type;

		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		do
		{
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter time in 24-hr format (hh mm): ");
			String time = scanner.nextLine();

			String[] x = time.split(" ");
			int[] values = new int[x.length];

			for(int i = 0; i < x.length; i++)
			{
				values[i] = Integer.parseInt(x[i]);
			}

			String pad = String.format("%02d", values[1]);

			if ((values[0] > 24) || (values[1] > 59) || (values[1] < 0))
			{
				System.out.println("Error! Only input from 00 - 24 for hh and 00 - 60 for mm!\n");
				type = null;
			}

			else if (values[0] >= 12)
			{
				if (values[1] < 10)
				{
					pad = String.format("%02d", values[1]);
				}
				values[0] -= 12;
				type = "P.M.";
				System.out.println("It's " + values[0] + ":" + pad + " "+ type + "\n");
			}
			
			else if (values[0] == 0)
			{
				if (values[1] < 10)
				{
					pad = String.format("%02d", values[1]);
				}
				values[0] = Math.abs(values[0]-12);
				type = "A.M.";
				System.out.println("It's " + values[0] + ":" + pad + " "+ type + "\n");
			}

			else 
			{
				if (values[1] < 10)
				{
					pad = String.format("%02d", values[1]);				
				}
				type = "A.M.";
				System.out.println("It's " + values[0] + ":" + pad + " "+ type + "\n");
			}

			System.out.print("Continue to input another time? [y|n]: ");
			ans = scanner.next().charAt(0);
		} while (ans == 'y');
	}
}