package kodlamaioLayeredApp.core.logging;

public class DatabaseLogger implements IBaseLogger {

	@Override
	public void log(String data) {
		System.out.println("Logged to Database: " + data);
	}

}
