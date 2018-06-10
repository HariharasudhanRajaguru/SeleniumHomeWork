package week3day2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Finding Leap Year
		
	Scanner input = new Scanner(System.in);
	System.out.println("Which Year:");
	int year = input.nextInt();
	boolean flag = false;
	if(year%400==0)
	{
	flag = true;
	}
	else if(year%100==0)
	{
	flag = false;
	}
	else if(year%4==0)
	{
	flag  = true;
	}
	else
	{
	flag = false;
	}
	if(flag)
	{
	System.out.println(+year+ " is a leap year");
	}
	else
	{
	System.out.println(+year+ " is not a leap year");
	}
	}
}

