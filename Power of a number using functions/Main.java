import java.util.Scanner;
class Main{
  	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
          int base = sc.nextInt();
      int exp = sc.nextInt();
      int pwr= power(base,exp);
      System.out.print(pwr);
	}
  public static int power(int b, int e)
  {
    int pwr=1;
    while(e>0)
    {
    pwr = pwr*b;
    e--;
         }
 return pwr;
  }
}