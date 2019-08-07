import java.util.*;
import java.io.*;
class Display_n_numbers_from_s
{
	public static void main (String[] args) 
	{
		int N=0,S=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		S=sc.nextInt();
		for(int i=S;i<N+S;i++)
		System.out.println(i);
	}
}
