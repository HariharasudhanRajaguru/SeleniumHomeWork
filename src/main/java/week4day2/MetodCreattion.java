package week4day2;

import java.util.Scanner;

public class MetodCreattion {


	/*public static void main(String[] args) {
		System.out.println("Enter the password:");
		Scanner pass = new Scanner(System.in);
		String password1 =pass.nextLine();
		int length = password1.length();
		int	noscou=0;
		int alpcou=0;
		int chacou=0;

		if(length>=10) {
			if(password1.matches("[a-zA-z0-9]*")) {
				for(int i=0;i<length;i++) {
					char charAt = password1.charAt(i);
					if(Character.isDigit(charAt)){ 
						noscou++;
					}
					if(Character.isUpperCase(charAt)) {
						alpcou++;
					}
					if(Character.isLetter(charAt)) {
						chacou++;
					}


				}
				if((chacou<2)&&(alpcou<1)&&(noscou<2)) {
					System.out.println("Password must contain atleast a uppercase,2 numbers,2 chars");

				}else {
					System.out.println("password is succefully verified");

				}
				}else {
				System.out.println("Password must not contain special chars");
			}

		}else {
			System.out.println("Password must be atleat 10 chars ");
		}

	}



	 */
	public static void main(String[] args) {
		System.out.println("Enter the password:");
		Scanner pass = new Scanner(System.in);
		String password1 =pass.nextLine();
		pass.close();
		if(isValid(password1)) {
			System.out.println("valid");
			
		}else {
			System.out.println("not valid");
		}
		
		
	}

	private static boolean isValid(String password1) {
		int length = password1.length();
		int	noscou = 0,alpcou = 0,chacou=0;
		
		if(length>=10) {
			if(password1.matches("[a-zA-z0-9]*")) {
				for(int i=0;i<length;i++) {
					char charAt = password1.charAt(i);
					if(Character.isDigit(charAt)){ 
						noscou++;
					}
					if(Character.isUpperCase(charAt)) {
						alpcou++;
					}
					if(Character.isLetter(charAt)) {
						chacou++;
					}


				}
				if((chacou<2)&&(alpcou<1)&&(noscou<2)) {
					System.out.println("Password must contain atleast a uppercase,2 numbers,2 chars");
					return false;

				}else {
					System.out.println("password is succefully verified");
					return true;

				}
				}else {
				System.out.println("Password must not contain special chars");
				
				return false;
			}

		}else {
			System.out.println("Password must be atleat 10 chars ");

			return false;
		}
	}
	
}
