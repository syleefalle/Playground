import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    StringBuilder sb1 = new StringBuilder(str1);
    StringBuilder sb2 = new StringBuilder(str2);
    StringBuilder temp = new StringBuilder("");
    int l1 = sb1.length();
    int l2 = sb2.length();
    int count = 0;
    boolean match = true;
    
    for(int i = 0;i<(l1-l2+1);i++)
    {
    //char ch = sb.charAt(i);
     //if(ch!= ' ') 
   // temp.append(ch);   
      match = true;
      
      for(int j=0; j<l2;j++)
      { 
        if(str1.charAt(i+j)!=str2.charAt(j))
        {
          match = false;
        }
      }
      if(match == true)
      {
       count++;
      }
    }
    System.out.print(count);
  }
}