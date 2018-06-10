package week4day2;

import java.util.Scanner;

import java.math.*;

public class ProgToFindPercetofupplownos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the string value");
		Scanner value = new Scanner(System.in);
		String input = value.nextLine();
		int length = input.length();
		int nos=0,ups = 0,sps=0,lws=0,wss=0;

		for(int i=0;i<length;i++) {
			char c = input.charAt(i);
			if(Character.isUpperCase(c)) {
				ups++;
			}
			if(Character.isLowerCase(c)) {
				lws++;
			}
			if(Character.isDigit(c)) {
				nos++;
			}
			if(Character.isWhitespace(c)) {
				wss++;
			}
			

		}
		sps=length-(ups+lws+nos);
		System.out.println(ups+"--"+lws+"--"+nos+"--"+sps+"--"+wss);
		System.out.println(length);
		
		System.out.println("Percentage of Uppercase letters in string is: "+((float)ups/length*100));
		
		System.out.println("Percentage of Lowercase letters in string is: "+((float)lws/length*100));
		
		System.out.println("Percentage of Number  in string is: "+((float)nos/length*100));
				
		System.out.println("Percentage of Specialcase letters in string is: "+((float)sps/length*100));
		
		
		System.out.println("Percentage of Specialcase letters in string is: "+((float)wss/length*100));
		
		


	}

}
