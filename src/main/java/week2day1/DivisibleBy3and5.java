package week2day1;

import java.util.Scanner;

public class DivisibleBy3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Divisible By 3 and 5//
	Scanner a = new Scanner(System.in);
	System.out.println("Enter Input No.1:");
	int n1 = a.nextInt();
	Scanner b = new Scanner(System.in);
	System.out.println("Enter Input No.2:");
	int n2 = b.nextInt();
	if(n1<n2)
	System.out.print("Output is :");
	for(int i=n1;i<=n2;i++) {
		
		if (i%3==0 && i%5==0) {
			System.out.print(" BizzFizz ");
		}
		else if(i%3==0 && i%5!=0) {
			System.out.print(" Bizz ");
		}
		else if(i%3!=0 && i%5==0) {
			System.out.print(" Fizz ");
		}
		if (i%3!=0 && i%5!=0) {
			System.out.print(i);
		}
		}
	}

}
