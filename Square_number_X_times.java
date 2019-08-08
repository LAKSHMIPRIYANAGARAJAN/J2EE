
import java.util.*;
import java.io.*;

class Square_number_X_times
{
	public static void main (String[] args) 
	{
		int n=0,sq=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n;a++)
	    {
	       	sq=a*a;
	       	System.out.println(sq);
	    }
	}
}
