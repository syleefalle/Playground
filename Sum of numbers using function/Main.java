import java.util.Scanner;
class Main
{
  public static int sumof(int y)
	{
    int sum=0;
	    for(int i=0;i<=y;i++)
        {
         sum = sum+i;
        }
	    return sum;
	} 

	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
      
      int z = sumof(n);
	    System.out.print(z);
	}

}