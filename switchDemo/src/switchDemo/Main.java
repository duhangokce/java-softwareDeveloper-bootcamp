package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Perfect : Passed");  // if we want to take same output it should be:  case 'A': case 'B': System.out.println("Perfect : Passed");
			break;
		case 'B':
			System.out.println("Nice : Passed");
			break;
		case 'D':
			System.out.println("Bad : Fail");
			break;
		default:
			System.out.println("Invalid grade");

		}

	}

}
