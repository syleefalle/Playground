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
    int  missing = 0;
    for(int i=1;i<=n;i++)
    {
      int check = 0;
         for(int j=0; j<n;j++)
         {  
          if(i==arr[j])
          { 
            check = 1;
            break;
          }
         }  
      if(check==0)
      {
       missing = i;
        break;
      }
    }
         System.out.println(missing);
     
  }
}