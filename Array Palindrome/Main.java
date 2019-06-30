import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int index = 0; index < n; index++)
       {
           arr[index] = sc.nextInt();
       }
    int pall=1;
    int j=n-1;
       for(int i=0;i<n;i++)
       {
          if(arr[i]!=arr[j])
          {
           pall=0;
          //  System.out.println(arr[i] + "i , j" + arr[j]);
          }
        j--;
       }
       if(pall==1)
       System.out.println("Yes");
       else
       System.out.println("No");
  }
}