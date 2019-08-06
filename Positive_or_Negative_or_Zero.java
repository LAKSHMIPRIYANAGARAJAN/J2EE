import java.util.*;
import java.io.*;
class Positive_or_Negative_or_Zero 
{
	public static void main (String[] args)
	{
		int num=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>0)
		System.out.println(num+" is positive");
		else if(num<0)
		System.out.println(num+" is negative ");
		else
		System.out.println(num+" is zero ");
	}
}
