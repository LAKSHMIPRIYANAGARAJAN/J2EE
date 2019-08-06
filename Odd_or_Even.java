import java.util.*;
import java.io.*;
class Odd_or_Even
{
	public static void main (String[] args) 
	{
		int num=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0)
		System.out.println(num+" is even");
		else
		System.out.println(num+" is odd ");
	}
}
