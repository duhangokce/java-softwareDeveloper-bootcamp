package abstractClasses;

public abstract class BaseCalculator {
	public abstract void calculate();
	
	public final  void gameOver() {
		System.out.println("Game Over");
	}

}
