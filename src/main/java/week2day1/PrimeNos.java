package week2day1;

import java.util.Scanner;

public class PrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter the Value of N:");
	     int n = scanner.nextInt();
	     int a;
	     
	     for (int i=2;i<n;i++)
	     {
	    	 a=0;
	    	 for(int j=2;j<i;j++)
	    	 {
	    		 if(i%j==0)
	    			 a=1;
	    	 }
	    	 if(a==0)
	    	System.out.println(i);
	     }  	 
	 }		
}
		
	




