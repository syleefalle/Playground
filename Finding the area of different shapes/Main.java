import java.lang.Math.*;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
    int choice=sc.nextInt();
      double area = 0d;
 
      switch(choice)
      {
        case 1: 
          int side = sc.nextInt();
                  area = side*side;
          System.out.println(area);
          break;
          
        case 2: 
         int length = sc.nextInt();
         int breadth = sc.nextInt();
                  area = length*breadth;
          System.out.println(area);
          break;  
          
         case 3: 
         int base = sc.nextInt();
         int height = sc.nextInt();
                  area = (base*height)/2;
          System.out.println(area);
          break;         
          
          case 4: 
          int radius = sc.nextInt();
                  area = 3.13999999999999972222222222222222d*(radius*radius);
          System.out.println(area);
          break;   
        default:
                    System.out.println("Invalid input");
        break;          
      }
    }
}