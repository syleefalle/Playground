import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
           
           int n = scanner.nextInt();
           //System.out.println("");
 
           for (int i = n; i >0; i--) {
                  for (int j = i,k=1; k <= i; j--,k++) {
                        System.out.print(j);
                  }
                  System.out.println("");
           }
	}
}