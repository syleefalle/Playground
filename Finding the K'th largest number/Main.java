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
  int k = sc.nextInt();
  sort(n, arr);
  int kth = n-k;
   System.out.print(arr[kth]);
}
public static int find_min(int start, int arr[], int end)
   {
    int min = 0;
     if(arr[start]<arr[start+1])
     {
       min = start;
     }
  else
    min = start+1;
    
  for(int i=start+2;i<end;i++)
    if(arr[min]>arr[i])
      min=i;
  return min;
 }    
  
  public static void swap(int start,int min, int arr[])
  {
  int temp = arr[start];
    arr[start] = arr[min];
    arr[min] = temp;
  }
  public static void sort(int n,int arr[])
  {
   for(int start=0; start<n-1; start++)
   {
   int min = find_min(start, arr, n);
    swap(start, min ,arr);
   }
  }
}