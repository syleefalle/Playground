import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = fact(num);
    System.out.print(sum);
  }
    public static int fact(int num)
    {
      if(num == 0)
        return 1;
      else
        return num * fact(num - 1);
    }
  }