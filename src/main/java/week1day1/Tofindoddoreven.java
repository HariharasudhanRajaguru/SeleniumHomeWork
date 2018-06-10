package week1day1;

import java.util.Scanner;

public class Tofindoddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given Input is Odd or Even//
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Input Value:");
	int n1 = input.nextInt();
	if(n1%2 == 0)
	{
		System.out.println("Given Input is Even:"+n1);
	}
	else
	{
		System.out.println("Given Input is Odd:"+n1);
	}


	}

}
