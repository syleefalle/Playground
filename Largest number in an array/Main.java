import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
  int idx,largest=0;
  int arrsize = sc.nextInt();
 int arr[] = new int[arrsize];
for(idx=0;idx<=arrsize-1;idx++)
{
 arr[idx] = sc.nextInt();
}
  for(idx=0;idx<=arrsize-1;idx++)
{  
    if(largest<arr[idx])
    {
    largest=arr[idx];
    } 
  }     
     System.out.println(largest); 
    }
}