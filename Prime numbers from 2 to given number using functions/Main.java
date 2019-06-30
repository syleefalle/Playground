import java.util.Scanner;
class Main{
  	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
      int n2 = prime(n);   
      
	}
  public static int prime(int n1)
  {
 
    int i;
    if( n1==1)
      {
     System.out.println(n1);
    }
      else
	  {
        for(i=1; i<=n1; i++)
    {
       int fact=0;
        for(int j=1; j<=n1; j++)
        {
            if(i%j==0)
                fact++;
        }
       if(fact==2)
       
       System.out.println(i);
	   }
      }
 return n1;
  }
}