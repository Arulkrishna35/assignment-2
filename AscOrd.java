import java.util.Scanner;
public class AscOrd
{
    public static void main(String[] args) 
    {
        int n, m;
        Scanner s = new Scanner(System.in);
        System.out.print("No.of elements:");
        m= s.nextInt();
        int a[] = new int[m];
        System.out.println("Enter the elements:");
        for (int i=0;i<m;i++) 
        {
            a[i] = s.nextInt();
       }
        for (int i=0;i <m;i++) 
        {
        for (int j=i+1;j<m;j++) 
         {
            if (a[i] > a[j]) 
             {
                  n = a[i];
                  a[i] = a[j];
                  a[j] = n;
               }
           }
       }
        for (int i=0;i< m-1;i++) 
        {
            System.out.print(a[i] + "  ");
        }
        System.out.print(a[m - 1]);
    }
}