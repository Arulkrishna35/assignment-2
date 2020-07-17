import java.util.Scanner;
public class NumberPat{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows: ");
        int n = sc.nextInt();
        int row = n;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++)          
            {
                System.out.print(j+" ");
            }   
            for (int j = row-1; j >= 1; j--)
            {               
                System.out.print(j+" ");            
            }
             
            System.out.println();
            row--;
        }
    }
}