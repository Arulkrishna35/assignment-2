import java.util.Scanner;
 
public class NumberPyramid{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of Rows: ");
        int n=sc.nextInt();
        int row = 1;
        for (int i=n;i>=1;i--)
        {
            for (int j=1;j<=i*2;j++)
            {
                System.out.print(" ");
            }
            for (int j=i;j<= n; j++)          
            {
                System.out.print(j+" ");
            }
            for (int j = n-1; j >= i; j--)
            {               
                System.out.print(j+" ");            
            }
            System.out.println();
            row++;
     }
 }
}