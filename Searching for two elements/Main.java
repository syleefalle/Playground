import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int idx,f1=0,f2=0;
  int arrsize = sc.nextInt();
 int arr[] = new int[arrsize];
for(idx=0;idx<=arrsize-1;idx++)
{
 arr[idx] = sc.nextInt();
}
  int find1 = sc.nextInt();
   int find2 = sc.nextInt();
 for(idx=0;idx<=arrsize-1;idx++)
 {
  if(arr[idx]==find1)
   {
     System.out.println(idx);
    f1=1;
   }
    
   if(arr[idx]==find2)
   {
     System.out.println(idx);
     f2=1;
   }
 
}
if(f1==0 || f2==0)
     {
     System.out.println("-1");
   }
}
}
