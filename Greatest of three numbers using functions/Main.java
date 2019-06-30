import java.util.Scanner;
class Main{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a1=sc.nextInt();
    int b1=sc.nextInt();
    int c1=sc.nextInt();
   int result= great(a1,b1);
    if(result<c1)
    System.out.println(c1);
    else
 
          System.out.println(great(a1,b1));
   
  }
  public static int great(int a,int b)
  {
    int result;
   if(a<b)
    {
    result=b;
    }
    else
      result=a;    
    return result;
  }
}