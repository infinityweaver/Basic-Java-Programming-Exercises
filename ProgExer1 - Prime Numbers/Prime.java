public class Prime  
{  

    public static void main(String[] args)   
    {  
        int ct=0,n=0,i=1,j=1,count=0;  

        while(n<25)  
        {  
            j=1;  
            ct=0;  

        while(j<=i)  
        {  
            if(i%j==0)  
                ct++;  
                j++;   
        }  

        if(ct==2)  
        {  
            System.out.printf("%d \t",i);  
            count++;
                      if(count == 5) {
                          System.out.print("\n");
                          count = 0;
                      }
            n++;  
        }  
        i++;
        }    
    }  
}  