package overriding;

public class Main {

	public static void main(String[] args) {
		
		BaseCreditManager[] creditManagers = {new TeacherCreditManager(), new MilitaryCreditManager(), new StudentCreditManager()};
		
		for(BaseCreditManager credits:creditManagers) {
			System.out.println(credits.calculate(1000));
		}
		
		

	}

}
