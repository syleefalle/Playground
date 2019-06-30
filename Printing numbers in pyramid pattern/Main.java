import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
           //System.out.print("Enter rows in Floyd's triangle : ");
           int rows = scanner.nextInt();
           int nextNumber = 1;
           for (int i = 1; i <= rows; i++) {
             for(int spc=1;spc<=rows-i;spc++)
                System.out.print(" ");
                  for (int j = 1; j <= i; j++) {
 //System.out.print(nextNumber<10 ? (" " + nextNumber++) : ("" + nextNumber++) ); 
          System.out.print(nextNumber+++" ");
                  }
                  System.out.println();
           
           }
	}
}