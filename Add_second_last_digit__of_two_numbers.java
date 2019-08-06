import java.util.*;
import java.io.*;
class Add_second_last_digit__of_two_numbers
{
	public static void main (String[] args)
	{
		int num1=0,num2=0,r1=0,r2=0,sum,n1=0,n2=0;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		n1=num1;
		n2=num2;
		num1=num1/10;
		r1=num1%10;
		num2=num2/10;
		r2=num2%10;
		sum=r1+r2;
		System.out.println("sum of second last digit if two number "+n1+" and "+n2+" is "+sum);
		
	}
}
