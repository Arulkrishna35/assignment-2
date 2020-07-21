import java.util.Scanner;
public class Armstrong{  
  public static void main(String[] args)  
  { 
    Scanner sc= new Scanner(System.in);  
    int c=0,temp,a;  
    int n=sc.nextInt();  
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c) 
	{	
    System.out.println("ARMSTORNG NUMBER");   
    }
	else
	{	
        System.out.println("NOT AN ARMSTORNG NUMBER");    
	}
}   
}