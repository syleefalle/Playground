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
    
    for(int i=0;i<n;i++)  // i = comapring value or key
    {
      for(int j=i;j<n;j++)   // j = increasing values to be compared by i
      { 
        if(arr[i]<arr[j])
        {
         System.out.println(arr[i]+","+arr[j]);
        }
        
      }
      
    }
  
  }
}