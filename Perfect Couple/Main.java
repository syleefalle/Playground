import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
        int val = sc.nextInt();
    for(int i =0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {   
        if(arr[i]+arr[j]==val)
         System.out.println(arr[i]+", "+arr[j]);
    }  
      //System.out.println();
    }
  }
}