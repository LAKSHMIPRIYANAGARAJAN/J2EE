import java.util.*;
import java.io.*;

class Hill_pattern5
{
	public static void main (String[] args) 
	{
		int rows=0;
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
     	
        for (int i = 1; i <= rows; i++)
        { 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
                
            }
            System.out.println();
        }
    }
}
