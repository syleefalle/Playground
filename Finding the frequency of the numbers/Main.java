import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
       arr[i] = sc.nextInt();
      }
      int arrk[] = new int[k+1];
      for(int i=1;i<=k;i++)
      {
       arrk[i] = 0;
      }

   for(int i=0;i<n;i++)
   {
    for(int j=1;j<=k;j++)
    {
     if(arr[i]==j)
     {
      arrk[j] = arrk[j]+1;
     }
    }
   }
      for(int i=1;i<=k;i++)
      {
      System.out.println(i+" "+arrk[i]);
      }
    }
}