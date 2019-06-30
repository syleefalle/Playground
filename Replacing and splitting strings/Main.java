import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      int parts = sc.nextInt();
      str1 = str2;
      String[] words = str1.split("\\s");
      for(String w:words)
      {
      System.out.println(w);
      }
    }
}