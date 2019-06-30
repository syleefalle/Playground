import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
          float num = sc.nextInt();
    float num2=0;
    int count = 0, n1, num1=0;
    num1= (int) num;
    while(num1!=0)
    {
      num1 = num1/10;
      count ++;
    }
   // System.out.println("count: " + count);
    count = count - 2;
    num2=num;
    while(count > 0)
    {
       num2 = num2/10;
       count--;
    }
   //System.out.println(num2);
   n1 = (int) num2%10;
   System.out.println(n1);
  }
}