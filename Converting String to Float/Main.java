import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int length = s.length();
        double aftDecimal = 0;
        double befDecimal = 0;
        int flag =0;
        for(int i = 0; i<length; i++)
        {
            if(s.charAt(i)=='.')
            flag = 1;
        }
        if(flag == 1)
        {
            for (int i = length - 1 ; s.charAt(i)!= '.' && i >= 0; i--)
            {
                aftDecimal = aftDecimal/10 + (s.charAt(i)-'0');
            }
            aftDecimal = aftDecimal/10;
            for (int i = 0 ; s.charAt(i)!= '.' ; i++)
            {
                befDecimal = befDecimal*10 + (s.charAt(i)-'0');
            }
        }
        else
        {
            for (int i = 0 ; i<length ; i++)
            {
                befDecimal = befDecimal*10 + (s.charAt(i)-'0');
            }
        }
        double sum = (aftDecimal + befDecimal);
        System.out.printf("%.6f",sum);
    }
}