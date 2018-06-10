package week1day1;

public class SwitchControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//				int day = 8;
		//				String dayString;
		//		
		//				// switch statement with int data type
		//				switch(day) 
		//				{
		//				case 1:  dayString = "Monday";
		//				break;
		//				case 2:  dayString = "Tuesday";
		//				break;
		//				case 3:  dayString = "Wednesday";
		//				break;
		//				case 4:  dayString = "Thursday";
		//				break;
		//				case 5:  dayString = "Friday";
		//				break;
		//				case 6:  dayString = "Saturday";
		//				break;
		//				case 7:  dayString = "Sunday";
		//				break;
		//				default: dayString = "Invalid day";
		//				break;
		//				}
		//				System.out.println(dayString);


		int pillars = 1;
		String javapillars;
		//Switch & case//
		switch(pillars)
		{
		case 1: javapillars = "Naming Convention & Coding Statements";
		break;
		case 2: javapillars = "Datatypes & variables";
		break;
		case 3: javapillars = "Operators";
		break;
		case 4: javapillars = "Access & Modify";
		break;
		case 5: javapillars = "Concept & Methods";
		break;
		case 6: javapillars = "Keywords";
		break;
		case 7: javapillars = "Loops";
		break;
		case 8: javapillars = "Inheritance";
		break;
		default: javapillars = "Out Of Syllabus";
		}
		System.out.println(javapillars);	
	}
}
