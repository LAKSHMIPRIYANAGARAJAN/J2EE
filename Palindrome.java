import java.util.*;
import java.io.*;
class Palindrome
{
	public static void main (String[] args) 
	{
		int rem=0,rev=0,no=0,temp=0;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		temp=no;
		while(no!=0)
		{
			   rem=no%10;
			   rev=rev*10+rem;
			   no=no/10;
			   
		}
		if(temp==rev)
		System.out.println("given number "+temp+" is a palindrome");
		else
		System.out.println("given number "+temp+" is a not a palindrome");
	}
}
