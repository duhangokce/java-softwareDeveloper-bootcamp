package miniProjectPrimeNumbers;

public class Main {

	public static void main(String[] args) {
		int number = 2;
		boolean isPrime = true;
		if (number == 1) {
			System.out.println("not prime number");
			return;
		}
		
		for(int i = 2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(number+ " is prime number");
		}
		else {
			System.out.println(number+ " is not prime number");
		}
		

	}

}