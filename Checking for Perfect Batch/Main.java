import java.util.Scanner;
class Main
{
  public static void check(int list[],int n)
  {
    int result=0;
    int sum = 0;
    int r = n-1;
    for(int i=0;i<=n-1;i++)
      { 
      sum = sum+list[i];
     // System.out.println(sum);
      if((i+1)%3==0)
      {    
        
       if(sum==n-1)
        result = 1;
         else
        result=0;
        if(i!=n-1)
        sum =0;
      }
    } 
      if(result==1)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    
    for(int i=0;i<n;i++)
    {
    list[i] = sc.nextInt();
    }
    check(list, n);
      
  }
}