import java.util.*;
import java.io.*;
class Print_number_in_given_range_divisible_by_number
{
	public static void main (String[] args) 
	{
	  int i,x=0,y=0,z=0;
	  Scanner sc=new Scanner(System.in);
	  x=sc.nextInt();
	  y=sc.nextInt();
	  z=sc.nextInt();
	  for( i=x;i<=y;i++)
	  if(i%z==0)
	  System.out.println(i);
	}
}
