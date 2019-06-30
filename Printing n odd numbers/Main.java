import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
     int count=0;
      
     for(count=0;count<=n*2;count++)
     {
       
        if(count%2!=0)
      {      
        System.out.println(count);
     }
     
      }
	}
}