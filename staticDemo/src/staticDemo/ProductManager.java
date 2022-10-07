package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		
		if (ProductValidator.isValid(product)) {
		
		System.out.println(product.name +  " added.");
		}else {
			System.out.println(product.name+ " couldn't added.");
		}
		
	}

}
