import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int len = sb.length();
      
        reverse_string(sb, 0, len - 1);
       
        int start_idx = 0;
        for(int i = 0; i < len; i++)
        {
            if(sb.charAt(i) == ' ')
            {
                
                reverse_string(sb, start_idx, i - 1);
                start_idx = i + 1;
            }
            else if(i == (len - 1))// Last word
            {
                reverse_string(sb, start_idx, i);
                start_idx = i + 1;
            }
        }
        System.out.print(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        int end = end_idx;
        int front = start_idx;
        while(front < end)
        {
            char tmp = sb.charAt(front);
            sb.setCharAt(front, sb.charAt(end));
            sb.setCharAt(end, tmp);
            front++;
            end--;
        }
    }
}