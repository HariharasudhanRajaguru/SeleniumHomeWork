package week3day2;

import java.util.Scanner;

public class FindingLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nexa= new Scanner(System.in);

		System.out.println("enter input");

		int n1= nexa.nextInt();

		if (n1%100==0) 
		{
			int quo=n1/100;
			if (quo%4==0) 
			{
				System.out.println(n1+" Is a leap year");
			}
			else 
			{
				System.out.println(n1+" Is not a leap year");
			}
		if(n1%100!=0)
		{
			if(n1%4==0) 
			{ 
				System.out.println(n1+" Is a leap year");
			}
			}

		}
		else if(n1%4==0)
		{
			System.out.println(n1+" Is a leap year");
		}

		else if(n1%4!=0) 
		{
			System.out.println(n1+" Is not a leap year");
		}



	}

}
