import java.util.*;
import java.io.*;
class count_number_of_prime_in_given_range
{
	public static void main (String[] args) 
	{
		int n1=0,n2=0,count=0,flag=0;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=n1;i<=n2;i++)
		{
		 for(int j=2;j<i;j++)
		 {
		 	if(i%j==0)
		 	{
		 		flag=1;
		 		break;
		 	}
		 	else{
		 		flag=0;
		 	 }
		 }
		 if(flag==0)
		 {
		 	count=count+1;
		 }
		
	}
		System.out.println("count of prime no "+count);
	}
}
