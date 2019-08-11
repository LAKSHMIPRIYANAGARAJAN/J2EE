import java.util.*;
import java.io.*;
class find_nth_prime_number
{
	public static void main (String[] args) 
	{
		int nth=0,num=1,count=0 ,i;
		Scanner sc=new Scanner(System.in);
		nth=sc.nextInt();
	    while(count<nth)
	    {
	    	num=num+1;
	    	for(i=2;i<=num;i++)
	    	{
	    		if(num%i==0){
	    		  break;}
	    		  
	    	}
	    	if(num==i){
	    	count=count+1;}
	    }
	 System.out.println("value of "+nth+" prime no is "+num );   
	}
}	
