import java.util.Scanner;
class Main
{
  public static int sqr(int y)
	{
	    int square = y*y;
	    return square;
	} 

	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
      int z = sqr(n);
	    System.out.print(z);
	}

}