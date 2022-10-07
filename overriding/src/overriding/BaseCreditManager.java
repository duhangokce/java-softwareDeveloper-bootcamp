package overriding;

public class BaseCreditManager {
	public double calculate(double amount) { //public final ... -> we cannot override if we use final keyword
		return amount * 1.18;
		
	}

}
