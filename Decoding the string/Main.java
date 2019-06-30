import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     String text = in.nextLine();
     StringBuilder str = new StringBuilder(text); 
     int key = in.nextInt();
     int str_len = str.length();
     for(int index = 0; index <= str_len - 1; index++)
     {
       char ch = str.charAt(index);
       if(ch >= 'A' && ch <= 'Z')
       {
           ch = (char)(ch - key);
            if(ch < 'A')
            {
                ch = (char)(ch + 26);
            }
       }
       else if(ch >= 'a' && ch <= 'z')
       {
           ch = (char)(ch - key);
            if(ch < 'a')
            {
                ch = (char)(ch + 26);
            }
       }
       str.setCharAt(index,ch);
     }
     System.out.print(str);
   }
}