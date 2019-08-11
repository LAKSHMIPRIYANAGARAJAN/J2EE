import java.util.*;
import java.io.*;
class count_non_repeated_digit
{
	public static void main (String[] args) 
		int input1=0,r=0,count=0;
		Scanner sc=new Scanner(System.in);
		input1=sc.nextInt();
		int a[]=new int[10];
		while(input1>0)
		{
			r=input1%10;
			input1=input1/10;
			a[r]=a[r]+1;
		}
		for(int i=0;i<10;i++)
		{
			if(a[i]==1)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}
}
