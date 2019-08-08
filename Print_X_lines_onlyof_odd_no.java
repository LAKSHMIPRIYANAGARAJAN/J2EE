
import java.util.*;
import java.io.*;

class Print_X_lines_onlyof_odd_no
{
	public static void main (String[] args) 
	{
		int n=0,sq=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int a=1;a<=n*2;a++)
	    {
	      if(a%2==1)
	      System.out.println(a);
	    }
	}
}
