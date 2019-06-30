import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     int list[] = new int[n];
     int grt = 0;
    for(int i=0;i<n;i++)
    {
     list[i] = sc.nextInt();
   
      if (list[i] > grt)
        grt = list[i];
    }
   // System.out.print(grt);
    for(int i=0;i<n;i++)
    {
     if(list[i]==grt)
       System.out.print(i);
    }
  }
}