import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  int n, n1, n2, a=0, counter = 0;
        Scanner s=new Scanner(System.in);
      
  
        n = s.nextInt();
        n1 = n;
      
        while(n > 0)
        {
            n = n / 10;
            counter++;
        }
        // System.out.println(counter);  
        while(counter > 0)
        {
            n2 = n1 % 10;
            n1 = n1/10;
            a = a+n2;
            counter--;
        }
           System.out.println(a);  
	}
}