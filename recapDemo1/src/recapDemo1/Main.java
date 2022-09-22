package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 25;
		int num3 = 28;
		int thebiggest = num1;
		if(thebiggest<num2) {
			thebiggest = num2;
		}
		if (thebiggest<num3) {
			thebiggest = num3;
		}
		System.out.println("The biggest number is " + thebiggest);
	}

}
