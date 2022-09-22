package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		//double[] myList = new double[4];
		double[] myList = {1.5, 2.3, 9.6, 8.5};
		double total = 0;
		double max = myList[0];
		
		for(double numbers: myList) {
			total=total + numbers;
			if(max < numbers) {
				max = numbers;
			}
			System.out.println(numbers);
		}
		System.out.println("total=" + total);
		System.out.println("max number="+ max);
		
		int[] ownList = {5, 15, 100, 50};
		int sum = 0;
		int thebiggest = ownList[0];
		for(int num: ownList) {
			if(thebiggest<num) {
				thebiggest= num;
			}
			sum = sum + num;
			System.out.println(num);
		}
		System.out.println("sum of numbers is " + sum);
		System.out.println("the biggest number is "+ thebiggest);
	}

}
