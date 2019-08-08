import java.util.*;
import java.io.*;
class Sum_of_digit_until_unitdigit
{
	int sod(int n)
		{
			int rem=0,sum=0,no=0;
			no=n;
			while(no!=0)
			{
			   rem=no%10;
			   sum=sum+rem;
			   no=no/10;   
			}
			return sum;
		}
	public static void main (String[] args) 
	{
		int a=0,res=0,ans;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		Sum_of_digit_until_unitdigit d= new Sum_of_digit_until_unitdigit();
		res=d.sod(a);
		if(res>9){
		ans=d.sod(res);
		System.out.println(ans);
		}
		else
		System.out.println(res);
	}
}
