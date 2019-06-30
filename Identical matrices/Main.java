import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int flag=0;
    int matrix1[][] = new int[r][c];
    int matrix2[][] = new int[r][c];

    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        matrix1[i][j] = in.nextInt();
      }
    }
    
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        matrix2[i][j] = in.nextInt();
      }
    }
    
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        if(matrix1[i][j]!=matrix2[i][j])
        {
        flag=0;
        }
        else
          flag = 1;
      }
    }
    if(flag==0)
      System.out.print("No");
    else
     System.out.print("Yes");
  }
}