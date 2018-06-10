package week1day1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		// TODO Auto-generted method stub
		//Multiplication Table//
    int multi;
	Scanner input1 = new Scanner(System.in);
	System.out.println("Enter Input1:");
	int n1 = input1.nextInt();
	Scanner input2 = new Scanner(System.in);
	System.out.println("Enter Input2:");
	int n2 = input2.nextInt();
	for(int i=1;i<=n2;i++)
	{
	multi = i*n1;	
	System.out.println(i+"*"+n1+"="+multi);
	}
	}

}
