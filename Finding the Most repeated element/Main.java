import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         int countarr[] = new int[100];
      int k=0;
    for(int i=0;i<n;i++)
    {
     arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
     countarr[i] = 0;
    }    
    for(int i=0;i<100;i++)
    {
     // System.out.println(i+": i ");
      for(k=0;k<n;k++)
      {
         if(arr[k]==i)
        {
        countarr[i]++;
      //  System.out.println(countarr[i]);
        } 
      }
    }
     int max =0;
      for(int j=0;j<100;j++)
      {
       if(countarr[j]>0)
       {
         if(countarr[j]>max)
         {
          max = j;
         }
       }
      }
              System.out.println(max);
  }
}