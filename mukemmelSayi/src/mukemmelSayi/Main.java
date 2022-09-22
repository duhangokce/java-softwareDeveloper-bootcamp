package mukemmelSayi;

public class Main {
	//my own work there would be some errors
	public static void main(String[] args) {
		int number = 27;
		int j = 0;
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				j = j+i;
		
				
				
			}
		}if(j==number) {
			System.out.println(number + " mükemmel sayıdır.");
			
		}else {
			System.out.println(number + " mükemmel sayı değildir.");
		}
	}

}
