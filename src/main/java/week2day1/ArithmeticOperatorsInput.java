package week2day1;

import java.util.Scanner;

import org.openqa.selenium.interactions.Keyboard;

public class ArithmeticOperatorsInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner new1 = new Scanner(System.in);
		System.out.println("Enter an number:");
		
		int n1=new1.nextInt();
		
		Scanner new2 = new Scanner(System.in);
		System.out.println("Enter an number:");
		
		int n2=new2.nextInt();
		*/
		Scanner keyboard = new Scanner(System.in);
        int n1;
        System.out.print("Enter 1st value: ");
        n1 = keyboard.nextInt();
        int n2;
        System.out.print("Enter 2nd value: ");
        n2 = keyboard.nextInt();
        String operator;
        System.out.print("Enter operator (/*-+%): ");
        operator = keyboard.next();
        
        switch(operator)
		
		{
		case"+":
			
			System.out.println(n1+n2);
			break;
			
		case"-":
			System.out.println(n1-n2);
			break;
			
		case"*":
			System.out.println(n1*n2);
			break;
			
		case"/":
			System.out.println(n1/n2);
			break;
		
		case"%":
			System.out.println(n1%n2);
			break;
		}
	}

}
