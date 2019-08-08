import java.util.*;
import java.io.*;
class Reverse_the_given_no
{
			
	public static void main (String[] args) 
  {
		int rem=0,rev=0,no=0;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		while(no!=0)
		{
			   rem=no%10;
			   rev=rev*10+rem;
			   no=no/10;  
		}
		System.out.println(rev);
	}
}
