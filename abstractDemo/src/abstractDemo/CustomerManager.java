package abstractDemo;

public class CustomerManager {
	
	/* My alternative according to my inferences that I reached from course
		
	                     ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    
    private BaseDatabaseManager databaseManager;
	
	public CustomerManager(BaseDatabaseManager databaseManager) {
		
		this.databaseManager = databaseManager;
	}

	public void getCustomer() {
		databaseManager.getData();
	}*/
	BaseDatabaseManager databaseManager;

	
	public void getCustomer() {
		databaseManager.getData();
	}

}
