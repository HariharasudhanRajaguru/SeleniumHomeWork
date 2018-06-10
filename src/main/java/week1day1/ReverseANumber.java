package week1day1;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner asd =new Scanner(System.in);
		System.out.println("Enter an input:");
		int n1 = asd.nextInt();
		int reminder=0;
		int quotient;
		String rev ="";
		while(n1>0)
		{
			quotient = n1/10;
			reminder = n1%10;
			n1=quotient;
			rev=rev+reminder;
		}

		System.out.println(rev);

	}

}
