import java.util.Scanner ;

public class AirplaneSeating
{
    int count = 0 ;
    public static void main(String[] args)
    {
        // two- dimensional array with 7 rows and 4 columns 
        char[][] seats = new char [7][4] ;
        for (int i = 0; i < 7; i++)
        {
            seats[i][0] = 'A' ;
            seats[i][1] = 'B' ;
            seats[i][2] = 'C' ;
            seats[i][3] = 'D' ;
        }

        String seatNumber = " " ; 
        int count = 0 ;
        String q = " " ;
        int numberOfSeatsAvailable = 0 ;
        int filled = 0 ;
        System.out.println(" 1 A B C D\n 2 A B C D\n 3 A B C D\n 4 A B C D\n 5 A B C D\n 6 A B C D\n 7 A B C D\n") ;
        System.out.println("Please choose an unoccupied seat location (from 1A to 7D.") ;
        System.out.println("Enter q to exit.") ;
        Scanner keyboard = new Scanner(System.in) ;
        seatNumber = keyboard.nextLine() ;
        count++ ;
        if (seatNumber.equals("q"))
       {
            System.out.println("Program ended.") ;
            System.exit(0) ;
       } 
        else
       {
         //print seating pattern and put an X in the seatNumber location
         while((filled < 28) && (seatNumber.length() > 0))
         {
            int row = seatNumber.charAt(0) - '1' ;
            int col = seatNumber.charAt(1) - 'A' ;
            count ++ ;
            if (row < 0 || row > 7 || col < 0 || col > 4)
            {
                System.out.println("Error: Invalid input. (Range is 1A - 7D)" +
                    "or q to quit.");
                seatNumber = keyboard.nextLine() ;
                count++ ;
            }
            else
            {
                if (seats[row][col] != 'X')
                {
                    seats[row][col] = 'X' ;
                    filled++;
                    System.out.println(" ") ;
                    printSeats(seats);
                }
                if (filled < 28)
                {
                    System.out.println("Please choose an unoccupied seat location (from 1A to 7D)" +
                        "or q to quit.");
                    seatNumber = keyboard.nextLine();
                    count++ ;
                }
             }
          }         
        }
    }

    private static void printSeats(char[][] seats)
    {
        int count = 0;
        System.out.println("Row") ;
        for (int i = 0; i < seats.length; i++)
        {
            System.out.println((i + 1) + "  " + 
                seats[i][0] + " " + seats[i][1] + "  " + seats[i][2] + " " + seats[i][3]) ;

        }
        count++ ;
        int numberOfSeatsAvailable = 0 ;     
        numberOfSeatsAvailable = (28 - count) ;      
        System.out.println("There are " + numberOfSeatsAvailable + " seats available.") ;
    }  //end main
}  //end class