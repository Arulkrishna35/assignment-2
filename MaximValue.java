import java.util.Scanner;
public class MaximValue{
public static void main(String[] args)
{
int  maxi;
Scanner sc = new Scanner(System.in);
System.out.print("Number of elements=");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the elements of array=");
for(int i = 0; i < n; i++)
{
arr[i] = sc.nextInt();
}
maxi = arr[0];
for(int i = 0; i < n; i++)
{
if(maxi < arr[i])
{
maxi = arr[i];
}
}
System.out.println("largest element:"+ maxi);
}
}