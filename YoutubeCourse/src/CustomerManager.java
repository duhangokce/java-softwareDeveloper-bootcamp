
public class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.creditManager = creditManager;
		this.customer = customer;
	}
	
	
	public void save() {
		System.out.println("Customer saved.");
	}
	public void giveCredit() {
		creditManager.add();
		
		
		
	}
}
