import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int j;
           int rows = 0;
  Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
 rows=n;
           for (int i = 1; i <= rows; i++) {
                  for (j = 1; j <= rows - i; j++)   // for initial spacing.
                        System.out.print(" ");
 
                  for (int k = j + 1; k <= rows; k++) //creates left half.
                        System.out.print("*");
                  
                  for (int k = rows; k > j - 1; k--)//creates right half.
                        System.out.print("*");
                  
                  System.out.println();
 
           
  }  
}
}
