import java.util.Scanner;
class Main{
	public static void main (String[] args){
   int fac=1;
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
      for(int i=1;i<=n;i++)
      {
       fac=fac*i;
      }
        
          System.out.println(fac);  
	}
}