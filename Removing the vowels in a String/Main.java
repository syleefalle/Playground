import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder sb2 = new StringBuilder("");
    int n  = sb.length();
    for(int i=0;i<n;i++)
    {
     if(sb.charAt(i)!='a' && sb.charAt(i)!='e' &&  sb.charAt(i)!='i' &&  sb.charAt(i)!='o' &&  sb.charAt(i)!='u')
     {
       sb2.append(sb.charAt(i));
     }
    }
    System.out.print(sb2);
  }
}