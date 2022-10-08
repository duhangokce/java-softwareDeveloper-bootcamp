package kodlamaioLayeredApp.core.logging;

public class FileLogger implements IBaseLogger {

	@Override
	public void log(String data) {
		System.out.println("Logged to file : "+ data);
		
	}

}
