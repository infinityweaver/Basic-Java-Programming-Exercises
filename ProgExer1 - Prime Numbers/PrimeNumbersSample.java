public class PrimeNumbersSample
{
   public static void main (String[] args)
   {
      int lineCtr = 0;
      StringBuilder PrimeNum = new StringBuilder();

      for (int i = 1; i <= 100; i++)         
      {            
        int counter=0;    

        for(int num =i; num>=1; num--)
        {
           if(i%num==0)
           {
            counter = counter + 1;
         }
      }
      {
      if (counter ==2)
      {

       PrimeNum.append(i).append("\t");
       lineCtr++;
    } 
    if(lineCtr == 5)
    {
      PrimeNum.append(System.lineSeparator());
      lineCtr = 0;
   }  
} 
}
System.out.println(PrimeNum);
}
}