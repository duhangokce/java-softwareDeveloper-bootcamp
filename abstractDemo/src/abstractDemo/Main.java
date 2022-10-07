package abstractDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 * My alternative according to my inferences that I reached from course
		 * 
		 * ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		 * 
		 * CustomerManager customerManager = new CustomerManager(new
		 * OracleDatabaseManager()); customerManager.getCustomer();
		 */
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new SqlServerDatabaseManager();
		customerManager.getCustomer();

	}

}
