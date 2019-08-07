import java.util.*;
import java.io.*;
class Divisible_Nno_divisible_by_X_startingfrom_Y
{
	public static void main (String[] args) 
	{
		int n=0,x=0,y=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		for(int i=y;i<(y+(n*x));i++)
		{
            if(i%x==0){
			System.out.println(i);
            }
		}
	
	}
}
