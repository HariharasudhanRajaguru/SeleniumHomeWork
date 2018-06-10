package week1day1;

public class AddingDigitsOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Some of digits of Number//
		int input = 1234,
			quotient,
			reminder,
			sum = 0;
		while(input>0)
		{
			reminder = input%10;
			quotient = input/10;
			sum = sum+reminder;
			input = quotient;
			System.out.println("Reminder is :" +reminder);
			System.out.println("Quotient is :"+quotient);
		}
		System.out.println("Sum of digits :"+sum);
	}

}
