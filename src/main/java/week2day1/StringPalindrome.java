package week2day1;

import java.util.Scanner;

public class StringPalindrome {

	private static Object String;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b = "";
		Scanner pal = new Scanner(System.in);
		System.out.println("Enter the string value:");
		a = pal.nextLine();
		int n = a.length();
		for(int i = n-1;i>=0;i--)
		{
			b=b+a.charAt(i);			
		}
		if(a.equalsIgnoreCase(b))
		{
		System.out.println("Given string is  palindrome:"+b);
		}
		else
		{
		System.out.println("Given string is not palindrome:"+b);
		}
		


	}

}
