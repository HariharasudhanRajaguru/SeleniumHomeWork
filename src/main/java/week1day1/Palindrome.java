package week1day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palindrome//
		Scanner input =new Scanner(System.in);
		System.out.println("Enter an input:");
		int input1 = input.nextInt();
		int input2=input1;
		int reminder;
		int quotient;
		String rev = "";
		while(input1>0)
		{
			quotient = input1/10;
			reminder = input1%10;
			input1=quotient;
			rev=rev+reminder;
		}
		int result = Integer.parseInt(rev);		
		if(input2==result)
		{
			System.out.println("Given Number is a Palindrome : " +result+".");
		}
		else
		{
			System.out.println("Given Number is not a Palindrome : " +result+".");
		}
		

	}

}
