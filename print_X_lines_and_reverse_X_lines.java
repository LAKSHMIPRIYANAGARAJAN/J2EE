import java.util.*;
import java.io.*;

class print_X_lines_and_reverse_X_lines
{
	public static void main (String[] args) 
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		    System.out.println(i);
		System.out.println(" ");    
	    for(int j=n;j>=1;j--)
	        System.out.println(j);
	}
}
