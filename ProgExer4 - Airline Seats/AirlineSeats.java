import java.util.Scanner;

public class AirlineSeats
{

    static int filled = 0;

    public static void main(String[] args) {
        char[][] seats = new char[7][4];
        for (int i = 0; i < 7; i++) 
            {
                seats[i][0] = 'A';
                seats[i][1] = 'B';
                seats[i][2] = 'C';
                seats[i][3] = 'D'; 
                System.out.println((i + 1) + " " + seats[i][0] + " " + seats[i][1] + " " + seats[i][2] + " " + seats[i][3]);
            }
            System.out.print("Please choose an unoccupied seat location (from 1A to 7D)");
        String seatLoc = "";
        String n = "";
        Scanner input = new Scanner(System.in);
        seatLoc = input.nextLine();

        if (seatLoc.equals("n")) 
        {
            System.out.println("Reservation made, have a nice day.");
            System.exit(0);
        }
        // In case the input is within the range, check if the seat is occupied, if not change it into X
        while (filled < 28 && seatLoc.length() > 0) 
        {
            int row = seatLoc.charAt(0) - '1';
            int col = seatLoc.charAt(1) - 'A';
            if (row < 0 || row > 7 || col < 0 || col > 4) 
            {
                System.out.println("Error: Invalid input. (range 1A - 7D) | n to exit ");
                seatLoc = input.nextLine();
                if (seatLoc.equals("n")) 
                {
                    System.out.println("Reservation made, have a nice day.");
                    System.exit(0);
                }
            
            } else 
            {
                if (seats[row][col] != 'X') 
                {
                    seats[row][col] = 'X';
                    filled++;
                    System.out.println(" ");
                    displaySeats(seats);
                }
                else
                {
                    if(seats[row][col] == 'X') 
                    {
                        System.out.println("Error: Invalid seat location, it's occupied");
                    }
                }
                if (filled < 28) 
                    {
                    System.out.println("Input another reservation(from 1A to 7D), n for exit");
                    seatLoc = input.nextLine();
                    if (seatLoc.equals("n")) {
                        System.out.println("Reservation made, have a nice day.");
                        System.exit(0);
                    }
                }
            }
        }
    }

    public static void displaySeats(char[][] seats) 
    {
        for (int i = 0; i < seats.length; i++) 
        {
            System.out.println((i + 1) + " " + seats[i][0] + " " + seats[i][1] + " " + seats[i][2] + " " + seats[i][3]);
        }
    } 
}