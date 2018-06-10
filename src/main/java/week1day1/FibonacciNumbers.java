package week1day1;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibonacci Numbers//
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Input Value:");
	int n1 = input.nextInt();
	int temp=0,a1=0,a2=1;
	while(a1<=n1)
	{			
	System.out.print(a1);
	temp=a1+a2;
	a2=a1;
	a1=temp;
	
  		}	
	
	}

}
