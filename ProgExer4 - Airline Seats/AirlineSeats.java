import java.util.Scanner;

public class AirlineSeats
{

    private static int filled = 0;

    public static void main(String[] args) {
        char[][] numSeats = new char[7][4];
        for (int i = 0; i < 7; i++) 
            {
                numSeats[i][0] = 'A';
                numSeats[i][1] = 'B';
                numSeats[i][2] = 'C';
                numSeats[i][3] = 'D'; 
                System.out.println((i + 1) + " " + numSeats[i][0] + " " + numSeats[i][1] + " " + numSeats[i][2] + " " + numSeats[i][3]);
            }
            System.out.print("Please choose an unoccupied seat location (from 1A to 7D): ");
        String location = "";
        String n = "";
        Scanner input = new Scanner(System.in);
        location = input.nextLine();

        if (location.equals("n")) 
        {
            System.out.println("Reservation made, have a nice day.");
            System.exit(0);
        }
        // In case the input is within the range, check if the seat is occupied, if not change it into X
        while (filled < 28 && location.length() > 0) 
        {
            int row = location.charAt(0) - '1';
            int col = location.charAt(1) - 'A';
            if (row < 0 || row > 7 || col < 0 || col > 4) 
            {
                System.out.println("Error: Invalid input. (range 1A - 7D) | n to exit ");
                location = input.nextLine();
                if (location.equals("n")) 
                {
                    System.out.println("Reservation made, have a nice day.");
                    System.exit(0);
                }
            
            } else 
            {
                if (numSeats[row][col] != 'X') 
                {
                    numSeats[row][col] = 'X';
                    filled++;
                    System.out.println(" ");

                    for (int i = 0; i < numSeats.length; i++) 
                    {
                         System.out.println((i + 1) + " " + numSeats[i][0] + " " + numSeats[i][1] + " " + numSeats[i][2] + " " + numSeats[i][3]);
                    }
                }
                else
                {
                    if(numSeats[row][col] == 'X') 
                    {
                        System.out.println("Error: Invalid seat location, it's occupied");
                    }
                }
                if (filled < 28) 
                    {
                    System.out.print("Input another reservation(from 1A to 7D), n for exit: ");
                    location = input.nextLine();
                    if (location.equals("n")) {
                        System.out.println("Reservation made, have a nice day.");
                        System.exit(0);
                    }
                }
            }
        }
    }

}