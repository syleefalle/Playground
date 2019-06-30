import java.util.Scanner;
import java.util.Scanner;
class Main{    
    public static void main(String argc[]) 
    { 
      int fd, ld,n1=0,n2=0,n3=0,n4=0,counter=0;
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
      n3=n;
      n1=n;
      n4=n;
		   while(n > 0)
        {
            n = n / 10;
            counter++;
        }
    //     System.out.println(counter);  
        while(counter > 0)
        {
            n2 = n1 % 10;
            n1 = n1/10;
           // a = a+n2;
            counter--;
        }  
 // System.out.println("n2: "+n2); 
      fd=n2;
      ld = n4%10;
      int sum = fd+ld;
        System.out.println(sum); 
    } 
} 
  