import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int count = 0;
        if(temp < 0)
        {
            temp = temp * -1;
        }
        do
        {
            count++;
            temp = temp/10;
        }while(temp > 0);
        if(n<0)
            count = count + 1;
        char array[] = new char[count];
        if(n < 0)
        {
            n = n * -1;
            array[0] = '-';
        }
        count = count - 1;
        while(n > 0)
        {
            char ch = (char)((n % 10) + '0');
            array[count] = ch;
            n /=10;
            --count;    
        }
        System.out.print(array);
    }
}