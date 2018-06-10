package codingchallenge;

import java.util.Scanner;

public class Codingchallenge18 {
	
/*	  public static void main (String[]args){
		   Scanner kb = new Scanner (System.in); 
		     String word = "";

		     System.out.println("Enter a word: ");
		     word = kb.nextLine();

		     uniqueCharacters(word); 
		}

		    public static void uniqueCharacters(String test){
		      String temp = "";
		         for (int i = 0; i < test.length(); i++){
		            if (temp.indexOf(test.charAt(i)) == - 1){
		               temp = temp + test.charAt(i);
		         }
		      }

		    System.out.println(temp + " ");

		   }*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("enter the sentence: ");

		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		String temp="";
		
		
		for (int i=0;i<input.length();i++) {


			char charAt = input.charAt(i);
			
			if(temp.indexOf(charAt)==-1){
				temp+=charAt;
				
			}
			System.out.println(temp);


		}


	}

}
