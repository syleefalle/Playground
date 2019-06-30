import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int result = 1;
      int base = sc.nextInt();
      int exp= sc.nextInt();
      while(exp!=0)
      {
       result = base * result;
       exp--;
      }
      System.out.println(result);
    }
}