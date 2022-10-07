package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.name = "Macbook";
		product.price = 0;
		productManager.add(product);

	}

}
