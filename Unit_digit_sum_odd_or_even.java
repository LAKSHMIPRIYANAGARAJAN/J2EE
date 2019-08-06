import java.util.*;
import java.io.*;
class Unit_digit_sum_odd_or_even
{
	public static void main (String[] args)
	{
		int num=0,rem=0,sum=0,n=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		n=num;
		while(num!=0)
		{
		 rem=num%10;
		 sum=sum+rem;
		 num=num/10;
		}
		if(sum%2==0)
		System.out.println("unit digit of  "+ n +" is "+ sum+" is even");
		else
	    System.out.println("unit digit of  "+ n +" is "+ sum+" is odd");
	}
}
