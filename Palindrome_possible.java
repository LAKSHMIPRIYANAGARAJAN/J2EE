import java.util.*;
import java.io.*;
class Palindrome_possible
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=0,i=0,j=0,countodd=0;
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int arr1[]=new int[10];
		while(i<10)
		{
			arr1[i]=0;
			i++;
		}
		while(input1!=0)
		{
			  a=input1%10;
			 arr1[a]=arr1[a]+1;
			input1=input1/10;
		
		}
		while(j<10){
			if((arr1[j]%2)!=0){
				countodd=countodd+1;
			}
			j++;
		}
		if(countodd>1){
			System.out.println("not palindrome");
			
		}
		else{
			System.out.println("palindrome");
		}	
		
	}
}
