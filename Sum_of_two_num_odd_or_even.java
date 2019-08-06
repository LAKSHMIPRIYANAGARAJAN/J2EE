import java.util.*;
import java.io.*;
class Sum_of_two_num_odd_or_even
{
	public static void main (String[] args)
	{
		int num1=0,num2=0,sum;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum=num1+num2;
		if(sum%2==0)
		System.out.println("sum of "+num1+" and "+num2+ " is "+sum+ " which is even");
		else
		System.out.println("sum of "+num1+" and "+num2+ " is "+sum+ " which is odd ");
	}
}
