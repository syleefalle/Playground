import java.util.Scanner;
class Main 
{
    public static void even(int n, int arr[], int rot)
    {
       int first_even_elem_index = 1;
       int last_even_elem_index;
       if(n % 2 == 0)
       {
           last_even_elem_index = n - 1;
       }
       else
       {
           last_even_elem_index = n - 2;
       }
       for(int rotation = 1; rotation <= rot; rotation++)
       {
           int temp = arr[first_even_elem_index];
           for(int i = 3; i < n; i = i + 2)
           {
               arr[i - 2] = arr[i];
           }
           arr[last_even_elem_index] = temp;
       }
    }
	
	//--------------------------------------------------
    public static void odd(int n, int arr[], int rot)
    {
       int first_odd_elem_index = 0;
       int last_odd_elem_index;
       if(n % 2 == 1)
       {
          last_odd_elem_index = n - 1;
       }
       else
       {
          last_odd_elem_index = n - 2;
       }
       for(int rotation = 1; rotation <= rot; rotation++)
       {
           int temp = arr[last_odd_elem_index];
           for(int i = (last_odd_elem_index - 2); i >= 0; i = i - 2)
            {
               arr[i + 2] = arr[i];
           }
           arr[first_odd_elem_index] = temp;
       }
    }
	
	//--------------------------------------------------------------
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <= (n - 1); i++)
        {
            arr[i] = in.nextInt();
        }
        int rot = in.nextInt();
        even(n, arr, rot);
        odd(n, arr, rot);
    
    for(int i = 0; i <= (n - 1); i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}