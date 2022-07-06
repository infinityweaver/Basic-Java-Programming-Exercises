class PrimeNumber
{
   public static void main (String[] args)
   {     
      int i = 0;
      int num = 0;
      int lineCounter = 0;

   StringBuilder primeNumbers = new StringBuilder();

   for (i = 1; i <= 100; i++) {
    int counter = 0;

    for (num = i; num >= 1; num--) {
        if (i % num == 0) {
            counter = counter + 1;
        }
    }

    if (counter == 2) {
        primeNumbers.append(i).append("\t");
        lineCounter++;
    }

    if (lineCounter == 5) {
        primeNumbers.append(System.lineSeparator());
        lineCounter = 0;
    }
}

System.out.println(primeNumbers);
   }
}