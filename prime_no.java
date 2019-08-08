import java.util.*;
import java.io.*;
class prime_no
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=0,i=0,flag=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("number "+n+" is prime");
		else
		System.out.println("number "+n+" is not prime");
		
	}
}
