import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int arr[] = new int[n];
int z=0;
    for(int i=0;i<=n-1;i++)
    {  
    arr[i] = sc.nextInt();
    int c = arr[i];
     if(c!=0) 
       System.out.print(c+" ");
      else
        z++;
    } 
    for(int i=0;i<z;i++)
    System.out.print("0 ");
  
    }
}