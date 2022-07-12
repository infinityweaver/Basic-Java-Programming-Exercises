class PrimeNum
{
    public static void main (String[] args)
    {
        int i;
        int num;
        int lineCounter = 0;

        StringBuilder primeNums = new StringBuilder();

        for(i=1; i<=100; i++)
        {
            int counter = 0;

            for(num = i; num>= 1; num--)
            {
                if(i % num == 0)
                {
                    counter = counter + 1;
                }
            }
            if(counter == 2)
            {
                primeNums.append(i).append("\t");
                lineCounter++; 
            }
            if (lineCounter == 5) 
            {
                primeNums.append(System.lineSeparator());
                lineCounter = 0;
            }
        }
        System.out.println(primeNums);
    }
}