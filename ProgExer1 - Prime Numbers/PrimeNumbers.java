class PrimeNumbers
{
   public static void main(String[] args)
   {
      int i, j, isPrime, n, count = 0;

      for (i = 2; i <= 100; i++)
      {
         isPrime = 0;
         for (j = 2; j <= i / 2; j++)
         {
            if (i % j == 0)
            {
               isPrime = 1;
               break;            
            }
         }

         if (isPrime == 0)
         {
            System.out.print(i + "\t");   
            count++;
            if(count == 5)
            {
               System.out.print("\n");
               count = 0;
            }
         }
      }
   }
}
