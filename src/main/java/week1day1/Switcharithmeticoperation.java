package week1day1;

public class Switcharithmeticoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using String//
		String operation = "sub";
		int a = 5,b = 10;

		switch(operation)
		{
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
		case "divide":
			System.out.println(a/b);
			break;
		case "modulus":
			System.out.println(b%a);
			break;
		case "multiply":
			System.out.println(a*b);
		}
	}

}
