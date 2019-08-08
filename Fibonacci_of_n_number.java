import java.util.*;
import java.io.*;
class Fibonacci_of_n_number
{
	public static void main (String[] args) 
	{
		int a=0,b=1,c=0,n=0;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<n;++i)
		{
			c=a+b;
		    a=b;
			b=c;
		}
		System.out.println(c);
		
	}
}
