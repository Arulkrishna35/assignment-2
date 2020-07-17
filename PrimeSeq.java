import java.util.Scanner;
public class PrimeSeq  
{  
public static void main(String[] args)   
{ 
Scanner sc=new Scanner(System.in); 
int a,ct=0,n=0,i=1,j=1;  
a=sc.nextInt();
while(n<a)  
{  
j=1;  
ct=0;  
while(j<=i)  
{  
if(i%j==0)  
ct++;  
j++;   
}  
if(ct==2)  
{  
System.out.printf("%d ",i);  
n++;  
}  
i++;  
}  
}  
}  