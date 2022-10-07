package polyMorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
		for(BaseLogger logger: loggers) {
			logger.log(" Log message");
		}
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
