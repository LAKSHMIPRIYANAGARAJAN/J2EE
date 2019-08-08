
import java.util.*;
import java.io.*;

class Print_a_b_for_X_lines
{
	public static void main (String[] args) 
	{
		int n=0,b=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++)
	    {
	    	b=n-a;
	    	System.out.println(a+","+b);
	    }
	}
}
