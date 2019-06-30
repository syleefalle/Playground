import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = ("");
//   StringBuilder sb1 = new StringBuilder(str1);
 //   StringBuilder str2 = new StringBuilder("");
  //  StringBuilder sb2 = new StringBuilder(str2);

    int l1 = str1.length();
    
    for(int i = l1-1; i>=0; i--)
    {
      //for(int j=0;j<l;j++)
      {
        char ch = str1.charAt(i);
        str2 = str2+ch;
      }    
    }
    if(str2.equals(str1))
    System.out.println("Yes");
    else
    System.out.println("No");
  }
}