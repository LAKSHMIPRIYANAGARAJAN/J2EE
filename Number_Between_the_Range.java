import java.util.*;
import java.io.*;
class Number_Between_the_Range
{
	public static void main (String[] args)
	{
		int num1=0;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		if(num1>50)
		System.out.println("number is above 50");
		else if(num1<=50 && num1>=40)
		System.out.println("number is between 40 to 50");
		else
		System.out.println("number is lesser than 40");
	}
}
