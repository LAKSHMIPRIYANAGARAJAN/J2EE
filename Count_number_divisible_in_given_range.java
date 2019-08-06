import java.util.*;
import java.io.*;
class Count_number_divisible_in_given_range
{
	public static void main (String[] args) 
	{
	  int i,x=0,y=0,z=0,count=0;
	  Scanner sc=new Scanner(System.in);
	  x=sc.nextInt();
	  y=sc.nextInt();
	  z=sc.nextInt();
	  for( i=x;i<=y;i++)
	  {if(i%z==0)
	  count+=1;
	  }
	  System.out.println(count);
	  
	}
}
