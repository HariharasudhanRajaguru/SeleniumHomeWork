package week1day1;

import java.util.Scanner;

public class Largestofthreegivennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Largest of Three Given Numbers//
		
		Scanner Number1 = new Scanner(System.in);
		System.out.println("Enter Input1:");
		int n1 = Number1.nextInt();
		Scanner Number2 = new Scanner(System.in);
		System.out.println("Enter Input2:");
		int n2 = Number2.nextInt();
		Scanner Number3 = new Scanner(System.in);
		System.out.println("Enter Input3:");
		int n3 = Number3.nextInt();
		if((n1>n2)&&(n1>n3))
		{
			System.out.println("Largest Number is:" +n1);
		}
		else if((n2>n1)&&(n2>n3))
		{
			System.out.println("Largest Number is:" +n2);
		}
		else if((n3>n1)&&(n3>n2))
		{
			System.out.println("Largest Number is:" +n3);
		}
	}
	
}

		

	




