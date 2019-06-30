import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str2 = "";
      int len = str.length();
      int alp[] = new int[26];
      
      for(int i=0;i<26;i++)
      {
        alp[i] = 0;
      }
      
      for(int i=0;i<len;i++)
      {
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
           {
            int offset = str.charAt(i) - 'a';
             alp[offset]++;
           }
          else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
           {
            int offset = str.charAt(i) - 'A';
             alp[offset]++;
           }
       }
      for(int i=0;i<26;i++)
      {
        if(alp[i]==0)
        {
          int j = i;
          j = j + 97;
          char ch = (char)j;
      System.out.print(ch+" ");
        }
      }
    }
}