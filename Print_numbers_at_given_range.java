import java.util.*;
import java.io.*;
class Print_numbers_at_given_range
{
	public static void main (String[] args) 
	{
	  int i,x=0,y=0;
	  Scanner sc=new Scanner(System.in);
	  x=sc.nextInt();
	  y=sc.nextInt();
	  for( i=x;i<=y;i++)
	  System.out.println(i);
	}
}
