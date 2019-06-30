import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int len = sb.length();
        int count[] = new int[70]; 
        for(int i = 0; i < 70; i++){
            count[i] = 0;
        }
        for(int i = 0; i < len; i++)
        {
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
            {
                int offset = sb.charAt(i) - 'A';
                char ch = (char)('a' + offset);
                sb.setCharAt(i, ch);
            }
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
            {
                count[sb.charAt(i) - 'a']++;
            }  
        }
        for(int i = 0; i < len; i++)
        {
            if(count[sb.charAt(i) -'a'] != 0)
            {
                System.out.print(sb.charAt(i) +"" +count[sb.charAt(i)-'a'] + " ");
                count[sb.charAt(i) -'a'] = 0;
            }
        }
    }
}