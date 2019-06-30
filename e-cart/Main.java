//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)

}

class Bill
{
  //implement your logic to calculate total price
  public void total(int quantity, int price)
  {
    System.out.println("Total Price is : "+(quantity*price));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner sc = new Scanner(System.in);
    String product = sc.nextLine();
    int price = sc.nextInt();
    int quantity = sc.nextInt();
    obj.total(quantity,price);
  }
}