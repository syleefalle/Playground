import java.util.Scanner;
class Main
{
  public static int gcd(int a, int b)
  {
    int mn, gcd1=0;
    if(a>b)
      mn=b;
    else
      mn=a;  
    while(mn>=1)
    {
      if(a%mn==0 && b%mn==0)
      {
       gcd1=mn;
        break;
      }
      mn--;
    }
    return gcd1;
  }
   public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
          int a1 = sc.nextInt();
		int b1 = sc.nextInt();
    int c1 = sc.nextInt();
  int gcd2 = gcd(a1,b1);
    System.out.println(gcd(gcd2,c1));
     
  }
}