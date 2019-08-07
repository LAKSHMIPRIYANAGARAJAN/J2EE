import java.util.*;
import java.io.*;
class Get_5no_find_odd_numbers
{
	public static void main (String[] args) 
	{
		int n=0,count=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			n=sc.nextInt();
			if(n%2==1){
			System.out.println(n);
			count+=1;	
			}
		}
		System.out.println("count of odd numebr in given 5 numbers is "+count);
	}
}
