import java.util.*;
import java.io.*;
class Sum_of_values_in_array
{
	public static void main (String[] args) 
	{
		int a[]=new int[10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
