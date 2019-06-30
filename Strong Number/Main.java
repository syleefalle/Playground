import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();  
      int n1=n;
      int fd,md,ld,f1=1,f2=1,f3=1,fac=0,nf=n,nm=n,nl=n;
      fd= nf/100;
      md=(nm/10)%10;
      ld=nl%10;
     // System.out.println(" "+fd+" "+md+" "+ld); 
      for(int i=1;i<=fd;i++)
      {
       f1=f1*i;
      }
       for(int j=1;j<=md;j++)
      {
       f2=f2*j;
      }
       for(int k=1;k<=ld;k++)
      {
       f3=f3*k;
      }
       //System.out.println(" "+f1+" "+f2+" "+f3); 
      
      fac=f1+f2+f3;      
      if(fac==n1)
        {
        System.out.println("Yes");
        }
      else
      {
        System.out.println("No");
      }
          
	}
}