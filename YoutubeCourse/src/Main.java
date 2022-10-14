
public class Main {

	public static void main(String[] args) {
		
		CreditManager creditManager = new CreditManager();
		creditManager.save();
		Customer customer = new Customer();
		customer.setFirstName("Duhan");
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		

	}

}
