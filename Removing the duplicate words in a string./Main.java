import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    String[] words = str.split(" ");
    StringBuilder sb2 = new StringBuilder("");
    for(int i=0;i<words.length;i++)
    {
      if(words[i]!=null)
     {
      for(int j=i+1;j<words.length;j++)
      {
      if(words[i].equals(words[j]))
      {
      words[j] = null;
      }
      }
    }
    }  
    for(int i=0;i<words.length;i++)
    {
      if(words[i]!=null)
      System.out.print(words[i]+" ");
    }
  }
  
  
 /* public static void check_string2(int n, )
  {
   for(int i=0;i<n;i++)
   {
    
   }
  } */
}