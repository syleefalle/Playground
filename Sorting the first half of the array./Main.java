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
    int temp=0, i=0;
  //  System.out.println(n/2);
    while(i<(n/2)-1)
    {
     for(int j=0;j<(n/2)-1;j++)
     { 
     if(arr[j]>arr[j+1])
     {
     temp = arr[j+1];
     arr[j+1] = arr[j];
     arr[j] = temp;  
     }
     }
      i++;
  }
    for(int k=0;k<n;k++)
    System.out.print(arr[k]+ " ");
    
  }
}