import java.util.*;
import java.io.*;
class Greater_among_two
{
	public static void main (String[] args)
	{
		int num1=0,num2=0;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		System.out.println(num1+ " is greater");
		else
		System.out.println(num2+" is greater ");
	}
}
