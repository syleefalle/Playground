import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
      String a="*", b="#", c="#";
 		for(int cur_row =1; cur_row <= n; cur_row++) {
			for(int cur_col=1; cur_col <= cur_row ; cur_col++) {
			
              System.out.print(a);
            c=a;
              a=b;
              b=c;
           
			}
    		System.out.println();

		}
    }
}