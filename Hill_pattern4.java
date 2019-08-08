
import java.util.*;
import java.io.*;

class Hill_pattern4
{
	public static void main (String[] args) 
	{
		int rows=0;
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
     	int k = 1;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
