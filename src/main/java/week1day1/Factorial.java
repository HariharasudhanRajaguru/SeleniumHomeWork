package week1day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial//
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Input Value:");
	int n1 = input.nextInt();
	int n2 = n1;
	int sum = 1,temp = 0;
	while(n1>0)
	{
		sum = sum*n1;
		temp = sum;
		n1 = n1-1;
	}
	System.out.println("Factorial of  " +n2+ " is "+temp+".");
	
	}

}
