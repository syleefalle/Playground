//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int sal)
  {
    //write your Faculty class statements
	System.out.println("Base Salary: "+sal);
  }
}
class CSE extends Faculty
{
  public void salary(int sal)
  {
    //write your CSE class statements
	System.out.println("CSE Faculty: "+(sal+3000));
  }
}
class IT extends CSE
{
  public void salary(int sal)
  {
    //write your IT class statements
	System.out.println("IT Faculty: "+(sal+5000));
  }
}
class ECE extends IT
{
  public void salary(int sal)
  {
    //write your ECE class statements
	System.out.println("ECE Faculty: "+(sal+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Faculty obj1 = new Faculty();
    CSE obj2 = new CSE();
    IT obj3 = new IT();
    ECE obj4 = new ECE();
    //implement your required concept here
	Scanner sc = new Scanner(System.in);
	int sal = sc.nextInt();
   obj1.salary(sal);
    obj2.salary(sal);
    obj3.salary(sal);
    obj4.salary(sal);
  }
}