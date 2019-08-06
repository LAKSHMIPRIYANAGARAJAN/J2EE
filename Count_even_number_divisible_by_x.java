import java.util.*;
import java.io.*;
class Count_even_number_divisible_by_x
{
	public static void main (String[] args) 
	{
	  int i,x=0,y=0,count=0;
	  Scanner sc=new Scanner(System.in);
	  x=sc.nextInt();
	  y=sc.nextInt();
	  for( i=1;i<=x;i++)
	  {
	  	if(i%y==0 && i%2==0)
	  	count+=1;
	  }
	  System.out.println(count);
	  
	}
}
