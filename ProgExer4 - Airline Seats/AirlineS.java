import java.util.Scanner;

public class AirlineS
{
   public static void main(String args[])
   {
      Boolean seats[][] = {
      {
            false, false, false, false
         },
         {
            false, false, false, false
         },
         {
            false, false, false, false
         },
         {
            false, false, false, false
         },
         {
            false, false, false, false
         },
         {
            false, false, false, false
         },
         {
            false, false, false, false
         }
      };

      String object;
      do {
         System.out.println(" ");
         for (int i = 0, num = 1; i < 7; i++, num++)
         {
            System.out.print(num + " ");
            for (char j = 'A'; j <= 'D'; j++)
            {
               if (seats[i][j - 'A'] == true)
               {
                  System.out.print("X" + " ");
               }
               else
               {
                  System.out.print(j + " ");
               }
            }

            System.out.print("\n");
         }
         System.out.println(" ");

         System.out.print("Please choose an unoccupied seat location (from 1A to 7D): ");
         Scanner scan = new Scanner(System.in);
         String y = scan.nextLine();
         int a = 0;
         char b;
         a = Integer.parseInt(y.charAt(0) + "");
         b = y.charAt(1);

         // 1A TO AD

         //1A
         if (a == 1 && b == 'A')
         {
            if (seats[0][0] == false)
            {
               System.out.println("");
               seats[0][0] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
            else if (seats[0][0] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //1B
         else if (a == 1 && b == 'B')
         {
            if (seats[0][1] == false)
            {
               System.out.println("");
               seats[0][1] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
            else if (seats[0][1] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //1C
         else if (a == 1 && b == 'C')
         {
            if (seats[0][2] == false)
            {
               System.out.println("");
               seats[0][2] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[0][2] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //1D
         else if (a == 1 && b == 'D')
         {
            if (seats[0][3] == false)
            {
               System.out.println("");
               seats[0][3] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[0][3] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //2A TO 2D

         //2A
         else if (a == 2 && b == 'A')
         {
            if (seats[1][0] == false)
            {
               System.out.println("");
               seats[1][0] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[1][0] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //2B
         else if (a == 2 && b == 'B')
         {
            if (seats[1][1] == false)
            {
               System.out.println("");
               seats[1][1] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[1][1] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //2C
         else if (a == 2 && b == 'C')
         {
            if (seats[1][2] == false)
            {
               System.out.println("");
               seats[1][2] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[1][2] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //2D
         else if (a == 2 && b == 'D')
         {
            if (seats[1][3] == false)
            {
               System.out.println("");
               seats[1][3] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[1][3] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //3A TO 3D
         else if (a == 3 && b == 'A')
         {
            if (seats[2][0] == false)
            {
               System.out.println("");
               seats[2][0] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[2][0] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //3B
         else if (a == 3 && b == 'B')
         {
            if (seats[2][1] == false)
            {
               System.out.println("");
               seats[2][1] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[2][1] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //3C
         else if (a == 3 && b == 'C')
         {
            if (seats[2][2] == false)
            {
               System.out.println("");
               seats[2][2] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[2][2] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //3D
         else if (a == 3 && b == 'D')
         {
            if (seats[2][3] == false)
            {
               System.out.println("");
               seats[2][3] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[2][3] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //4A TO 4D

         //4A
         else if (a == 4 && b == 'A')
         {
            if (seats[3][0] == false)
            {
               System.out.println("");
               seats[3][0] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[3][0] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //AB
         else if (a == 4 && b == 'B')
         {
            if (seats[3][1] == false)
            {
               System.out.println("");
               seats[3][1] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[3][1] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //4C
         else if (a == 4 && b == 'C')
         {
            if (seats[3][2] == false)
            {
               System.out.println("");
               seats[3][2] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[3][2] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //4D
         else if (a == 4 && b == 'D')
         {
            if (seats[3][3] == false)
            {
               System.out.println("");
               seats[3][3] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }


            else if (seats[3][3] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //5A TO 5D

         //5A
         else if (a == 5 && b == 'A')
         {
            if (seats[4][0] == false)
            {
               System.out.println("");
               seats[4][0] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[4][0] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //5B
         else if (a == 5 && b == 'B')
         {
            if (seats[4][1] == false)
            {
               System.out.println("");
               seats[4][1] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[4][1] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //5C
         else if (a == 5 && b == 'C')
         {
            if (seats[4][2] == false)
            {
               System.out.println("");
               seats[4][2] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[4][2] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //5D
         else if (a == 5 && b == 'D')
         {
            if (seats[4][3] == false)
            {
               System.out.println("");
               seats[4][3] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[4][3] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //6A TO 6D

         //6A
         else if (a == 6 && b == 'A')
         {
            if (seats[5][0] == false)
            {
               System.out.println("");
               seats[5][0] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[5][0] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

         }

         //6B
         else if (a == 6 && b == 'B')
         {
            if (seats[5][1] == false)
            {
               System.out.println("");
               seats[5][1] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[5][1] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

         }

         //6C
         else if (a == 6 && b == 'C')
         {
            if (seats[5][2] == false)
            {
               System.out.println("");
               seats[5][2] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[5][2] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //6D
         else if (a == 6 && b == 'D')
         {
            if (seats[5][3] == false)
            {
               System.out.println("");
               seats[5][3] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[5][3] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //7A TO 7D

         //7A
         else if (a == 7 && b == 'A')
         {
            if (seats[6][0] == false)
            {
               System.out.println("");
               seats[6][0] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[6][0] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

         }

         //7B
         else if (a == 7 && b == 'B')
         {
            if (seats[6][1] == false)
            {
               System.out.println("");
               seats[6][1] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[6][1] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //7C
         else if (a == 7 && b == 'C')
         {
            if (seats[6][2] == false)
            {
               System.out.println("");
               seats[6][2] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[6][2] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }

         //7D
         else if (a == 7 && b == 'D')
         {
            if (seats[6][3] == false)
            {
               System.out.println("");
               seats[6][3] = true;
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }

            else if (seats[6][3] == true)
            {
               System.out.println(" ");
               System.out.println("Error: Invalid seat location. it's occupied ");
               for (int i = 0, num = 1; i < 7; i++, num++)
               {
                  System.out.print(num + " ");
                  for (char j = 'A'; j <= 'D'; j++)
                  {
                     if (seats[i][j - 'A'] == true)
                     {
                        System.out.print("X" + " ");
                     }
                     else
                     {
                        System.out.print(j + " ");
                     }
                  }

                  System.out.print("\n");
               }
            }
         }
         else
         {
            System.out.println("Error: Invalid input. (Range is 1A - 7D) ");
         }

         System.out.println(" ");
         System.out.print("Get another seat[Y/N]?");
         object = scan.nextLine();

      } while (object.equals("Y"));

   }
}