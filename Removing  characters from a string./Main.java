import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String substr = sc.nextLine();
    System.out.print(remove(str,substr));
  }
     public static int[] countarr(String str)
     {
      int count[] = new int[256];
    int i=0;
    for(i=0;i<str.length();i++)
    {
     count[str.charAt(i)]++;
    // System.out.println(count[str.charAt(i)]); 
    //System.out.println(count[i]); 
    }
       return count;
     }
  public static String remove(String str, String substr)
    { 
    int count[] = countarr(substr); 
   int ip=0,ri=0;
    char arr[] = str.toCharArray();
    while(ip!=arr.length)
    {
     char temp = arr[ip];
      if(count[temp]==0)
      {
       arr[ri]= arr[ip];
        ri++;
      }
      ip++;
    }
    str = new String(arr);
   return str.substring(0,ri);
  }
  
}