import java.util.Scanner;

public class Word 
{
    public static void main(String... a) {
        System.out.print("Enter an array of characters (30 max): ");
        Scanner Sc = new Scanner(System.in);
        String st=Sc.nextLine();
        StringBuilder sb=new StringBuilder();
        boolean [] bc=new boolean[256];
        for(int i=0;i<st.length();i++)
        {
            int index=st.charAt(i);
            if(bc[index]==false)
            {
                sb.append(st.charAt(i));
                bc[index]=true;
            }

        }
        System.out.println("\nstring" + "\t : " + st.toString());
        System.out.println("size  " + "\t : " + st.length());
        System.out.println("\n"+ "After deleting the repeating characters...");
        System.out.println("\nstring" + "\t : " + sb.toString());
        System.out.println("size  " + "\t : " + sb.length());
    }
}